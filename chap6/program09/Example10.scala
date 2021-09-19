package chap06.program09

object Example10 {
  def main(args: Array[String]) {
    val fruits= List("apple", "orange", "peach")
    val vegetables = List("tomato", "cucumber", "apinach", "cabbage")
    val empty = List()
    for ( list <- List(fruits, vegetables, empty )) {
      list match {
        case List ( first, "orange", last) =>
          printf ("Fruits list: %s, orange, %s\n", first, last)
        case List ( "tomato", remains @ _*) =>
          printf ("Vegetables list: tomato, %s\n", remains)
        case List(_*) => println("Empty list")
      }
    }
  }
}
