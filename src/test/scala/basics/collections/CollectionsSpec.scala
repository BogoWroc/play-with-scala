package basics.collections

/**
  * Created by Bogumil on 12.12.2016.
  */

import java.util

import org.scalatest._


class CollectionsSpec extends FlatSpec with Matchers {

  "Lists" should "be immutable" in {
    val list1 = List(1, 2)
    val list2 = List(3, 4)
    assert((list1 ::: list2).equals(List(1, 2, 3, 4)))
  }

  "Array" should "be modifiable" in {
    val array = new Array[Int](2)
    array.update(0,100)
    assert(array.apply(0) == 100)
  }

  "Tuples" should "be immutable" in {
    val tuple = (100,"Bogus")
    assert(tuple._1.equals(100))
    assert(tuple._2.equals("Bogus"))
  }
}
