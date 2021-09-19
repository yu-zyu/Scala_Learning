package chap06.program12

case class Apple(price: Int, num: Int)
case class Orange(price: Int, num: Int)
case class Strawberry(price: Int, num: Int)
object Example13 {
  def main(args: Array[String]) {
    val oneApple = Apple(100, 2)
    val fiveApples = Apple(100, 5)
    val oneOrage = Orange(50, 3)
    val tenOranges = Orange(50, 10)
    val oneStrawberry = Strawberry(10, 4)
    val thirtyStrawbetties = Strawberry(10, 30)
    for (fruit <- List(oneApple, fiveApples, oneOrage, tenOranges, oneStrawberry, thirtyStrawbetties)){
      fruit match {
        case Apple(price, num) if (num >= 5) => 
          printf("apple * %s: %s yen\n", num, (price * num * 0.9))

        case Apple(price, num) =>
          printf("apple * %s: %s yen\n", num, (price * num))
        case Orange(price, num) if (num >= 10) => 
          printf("orange * %s: %s yen\n", num, (price * num * 0.85))
        case Orange(price, num) => 
          printf("orange * %s: %s yen\n", num, (price * num ))
        case Strawberry(price, num) if (num >= 30) => 
          printf("strawberry * %s: %s yen\n", num, (price * num * 0.85))
        case Strawberry(price, num) => 
          printf("strawberry * %s: %s yen\n", num, (price * num))
      }
    }
  }
}

