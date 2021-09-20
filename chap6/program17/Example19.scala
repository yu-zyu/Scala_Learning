package chap06.program17

object Example19 {
  def main(args: Array[String]) {
    val colors = "red (blue) green (yellow) pink white (black)"
    val pattern = """\(.+?\)""".r
    println((pattern findAllIn colors).mkString(" "))
  }
}

