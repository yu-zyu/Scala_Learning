package chap06.program07

class Color {
  val sky = "sky"
  def printColor(input: String) {
    input match {
      case this.sky => println("blue")
      case ambiguous => println(ambiguous + " is unknown!")
    }
  }
}
object Example8 {
  def main(args: Array[String]) {
    new Color() .printColor("sky")
    new Color() .printColor("car")
  }
}

