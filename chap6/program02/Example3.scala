package chap06.program02

object Example3 {
  def main(args: Array[String]) : Unit = {
    val numberList = List(1, 2, 3)
    for (number <- numberList) {
      number match {
        case 1 => println("One")
        case 2 => println("Two")
      }
    }
  }
}
