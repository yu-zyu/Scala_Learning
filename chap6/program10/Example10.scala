package chap06.program10

object Example11 {
  def main(args: Array[String]) {
    val fruits = List("apple", "orange", "melon", "strawberry")
    val sweets = List("shortcake", "tiramisu", "apple-pie", "chocolate")
    val empty = List()
    for( list <- List(fruits, sweets, empty)) {
      list match {
        case head :: tail => println("head of " + list + " is " + head)
        case List() => println("Empty list: " + list)
      }
    }
  }
}
