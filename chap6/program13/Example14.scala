package chap06.program13

sealed abstract class Fruit() {
  def getSalePrice:Double
}
case class Apple(price: Int, num: Int) extends Fruit {
  def getSalePrice:Double = {
    if(num >= 5) price * num * 0.9
    else price * num
  }
}

case class Orange(price: Int, num: Int) extends Fruit {
  def getSalePrice:Double = {
    if(num >= 10) price * num * 0.85
    else price * num
  }
}

case class Strawberry(price: Int, num: Int) extends Fruit {
  def getSalePrice:Double = {
    if(num >= 30) price * num * 0.85
    else price * num
  }
}

class PriceComputer {
  def compute(fruit: Fruit) {
    fruit match {
      case Apple(price, num) =>
        printf("apple * %s: %s yen\n", num, fruit.getSalePrice)
      case Orange(price, num) =>
        printf("orange * %s: %s yen\n", num, fruit.getSalePrice)
      case Strawberry(price, num) =>
        printf("strawberry * %s: %s yen\n", num, fruit.getSalePrice)
    }
  }
}

object Example14 {
  def main(args: Array[String]) {
    new PriceComputer().compute(Apple(100, 1))
    new PriceComputer().compute(Apple(100, 5))
    new PriceComputer().compute(Orange(50, 1))
    new PriceComputer().compute(Orange(50, 10))
    new PriceComputer().compute(Strawberry(10, 1))
    new PriceComputer().compute(Strawberry(10, 30))
  }
}

