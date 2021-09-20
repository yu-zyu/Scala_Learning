package chap06.program18

object Example20 {
  def main(args: Array[String]) {
    val colors = "red (blue) green (yellow) pink white (black)"
    println("""\(""".r replaceFirstIn("""\)""".r replaceFirstIn(colors, "]"),
      "["))
  }
}
