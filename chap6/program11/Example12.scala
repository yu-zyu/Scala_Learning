package chap06.program11

object Example12 {
  def main(args: Array[String]) {
    val intStrTpl = (1, " intStrTpl ")
    val dblStrTpl = (2.0, " dblStrTpl ")
    val anyInt = 12345
    val anyStr = "STRING"
    val anyChar = 'c'
    for ( aType <- List(intStrTpl, dblStrTpl, anyInt, anyStr, anyChar)) {
      aType match {
        case (i: Int, s: String) => printf("Tuple (%s, %s)\n", i, s)
        case (d: Double, s: String) => printf("Tuple (%s, %s)\n", d, s)
        case intValue : Int => println("Integer : " + intValue)
        case strValue : String => println("String : " + strValue)
        case other => println("Others : " + other)
      }
    }
  }
}
