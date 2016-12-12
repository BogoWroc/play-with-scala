package pl.scala.hello

object HelloWorld {
  /* This is my first java program.
  * This will print 'Hello World' as the output
  */
  def main(args: Array[String]) {
    println("Hello, world!") // prints Hello World

    /*
    Variable Data Type
     */
    // mutable variable
    var mutableVariable: Integer = 5
    mutableVariable += 7
    println(mutableVariable)

    val immutableVariable: String = "Nie da rady przebić tej wartości!"
    println(immutableVariable)

    /*
    Variable Type Interface
     */

    val i = 10
    val s = "Bla bla"

    // Multi assignments
    val (myVar1: Int, myVar2: String) = Pair(40, "Foo")



  }
}
