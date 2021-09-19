package chap06.program03

object Example4 {
  def main(args: Array[String]): Unit = {
    val strings = List("true", "false")
      for (string <- strings) {
        string match {
          case true => println("true")
          case _ => println("false")
        }
      }
  }
}

