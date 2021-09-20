package chap06.program16

object Example18 {
  def main(args: Array[String]) {
    val colors = "red blue green yellow pink white black"
    val pattern = """red""".r
    println(pattern findFirstIn colors)
  }
}

