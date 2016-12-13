package pl.scala.hello

/**
  * Created by Bogumil on 13.12.2016.
  */
class ChecksumAccumulator {
  private var base:Int = 0

  def add(element:Int):Unit = base += element
  def getSum():Int = base
}
