package chap06.program04

object Example5 {
  def main(args: Array[String]):Unit = {
    val colors = List("sky", "cloud", "car")
    for (color <- colors) {
      color match {
        case "sky" => println("blue")
        case "cloud" => println("gray")
        case ambiguous => println(ambiguous + " is too ambiguous.")
      }
    }
  }
}
