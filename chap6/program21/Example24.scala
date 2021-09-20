package chap06.program21
import scala.xml._

object Example24 {
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
    val priceNode = myXML \ "fruit" \ "price"
    println(priceNode mkString("\n"))
  }
}
