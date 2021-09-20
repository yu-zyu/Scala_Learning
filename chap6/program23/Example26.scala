package chap06.program23

object Example26 {
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
    val priceElem = myXML \\ "price"
    priceElem(0) match {
      case <price>{targetPrice}</price> => println("Price:" + targetPrice)
    }
  }
}

