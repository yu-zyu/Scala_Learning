package chap06.program22

object Example25 {
  val myXML = 
    <fruits>
      <fruit ticker="apple">
        <price>100</price>
      </fruit>
      <fruit ticker="orange">
        <price>50</price>
      </fruit>
    </fruits>
  def main(args: Array[String]) {
    val directEctractElem = myXML \\ "price"
    println(drectExtractElem(0) text)
    println(drectExtractElem(1) text)
  }
}


