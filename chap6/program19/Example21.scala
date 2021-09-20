package chap06.program19

object Example21 {
  def main(args: Array[String]) {
    val colors = "red (blue) green (yellow) pink white (black)"
    println("""\(""".r replaceAllIn("""\)""".r replaceAllIn(colors, "]"),
      "["))
  }
}
