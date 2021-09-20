package chap06.program15

class FruitsShop {
  def niceSale(day: Day) {
    day match {
      case MySale(salePrice) => printf("Price: %s\n", salePrice)
    }
  }
}

abstract class Day(val price: Double) {
  def salePrice() : Double = {
    price * 0.9
  }
}

case class Monday(override val price: Double) extends Day(price)
case class Friday(override val price: Double) extends Day(price)
case class Sunday(override val price: Double) extends Day(price)
object SaleValidator {
  def unapply(day: Day) : Boolean = {
    day match {
      case friday: Friday => true
      case monday: Monday => true
      case _ => false
    }
  }
}
object MySale {
  def unapply(day: Day): Option[(Double)] = {
    day match {
      case SaleValidator() => Some(day.salePrice)
      case _ => Some(day.price)
    }
  }
}

object Example16 {
  def main(args: Array[String]) {
    new FruitsShop niceSale Monday(500) 
    new FruitsShop niceSale Friday(1000) 
    new FruitsShop niceSale Sunday(2000) 
  }
}

