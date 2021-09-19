package chap06.program06

class ColorError {
  val sky = "sky"
  def printColor(input: String) {
    input match {
      case sky => println("blue")
      case ambiguous => println(ambiguous + " is unknown!")
    }
  }
}

