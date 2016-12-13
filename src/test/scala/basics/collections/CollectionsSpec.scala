package basics.collections

/**
  * Created by Bogumil on 12.12.2016.
  */

import java.util

import org.scalatest._

import scala.collection.mutable


class CollectionsSpec extends FlatSpec with Matchers {

  "Lists" should "be immutable" in {
    val list1 = List(1, 2)
    val list2 = List(3, 4)
    assert((list1 ::: list2).equals(List(1, 2, 3, 4)))
  }

  "Array" should "be modifiable" in {
    val array = new Array[Int](2)
    array.update(0,100)
    array.update(1,200)
    assert(array.apply(0) == 100)

    for (i <- 0 to 1)
      println(array(i))
  }

  "Tuples" should "be immutable" in {
    val tuple = (100,"Bogus")
    assert(tuple._1.equals(100))
    assert(tuple._2.equals("Bogus"))
  }

  "Sets" should "contains not doubled values" in {
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    jetSet += "Airbus"
    assert(jetSet.contains("Cessna") == false)
    assert(jetSet.size == 3)
  }

  it should "produce set" in {
    val hashSet = mutable.HashSet("Tomatoes", "Chilies")
    for (element <- hashSet)
      println(element)

    assert(hashSet.toList(1).equals("Tomatoes"))
  }

  "Map" should "contains key and values" in {
    val treasureMap = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    assert(treasureMap(2).equals("Find big X on ground."))
  }

  it should "produce Romain map" in {
    val romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    assert(romanNumeral(4).equals("IV"))
  }
}
