package basics.collections

import org.scalatest.{FlatSpec, Matchers}
import pl.scala.hello.ChecksumAccumulator

/**
  * Created by Bogumil on 13.12.2016.
  */
class ChecksumAccumulatorSpec extends FlatSpec with Matchers{

  val accumulator = new ChecksumAccumulator

  it should "add values" in {
    accumulator.add(5)
    assert(accumulator.getSum()==5)

    accumulator.add(10)
    assert(accumulator.getSum()==15)
  }
}
