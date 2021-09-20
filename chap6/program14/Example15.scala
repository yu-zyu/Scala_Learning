package chap06.program14

abstract class Day(val price: Double) {
  def salePrice() : Double = {
    price * 0.9
  }
}

case class Monday(override val price: Double) extends Day(price)
case class Friday(override val price: Double) extends Day(price)
case class Sunday(override val price: Double) extends Day(price)
class FruitsShop {
  def sale(day: Day) {
    day match {
      case day @ Monday(price) => printf("Price: %s\n", day.salePrice)
      case day @ Friday(price) => printf("Price: %s\n", day.salePrice)
      case day => printf("Price: %s\n", day.price)
    }
  }
}
object Example15 {
  def main(args: Array[String]) {
    new FruitsShop sale Monday(500) 
    new FruitsShop sale Friday(1000) 
    new FruitsShop sale Sunday(2000) 
  }
}

