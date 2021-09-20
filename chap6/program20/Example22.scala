package chap06.program20

object Example22 {
  def main(args: Array[String]) {
    val inventoryList = List(
      "Normal, 001, ItemA, 1000, 50",
      "Special, 002, ItemB, 1500, 25",
      "Normal, 003, ItemC, 500, 30",
      "Special, 004, ItemD, 2000, 10",
      "Other, 005, ItemE, 3000, 120",
      "Normal, 006, ItemF, 300, 5"
    )
    val normalExtractor = """Normal, (.+),(.+),(.+),(.+)""".r
    val specialExtractor = """Special, (.+),(.+),(.+),(.+)""".r
    for (item <- inventoryList) {
      item match {
        case normalExtractor(no, name, price, quantity) =>
          printf("[No]:%s [Quantity]:%s\n", no, quantity)
        case specialExtractor(no, name, price, quantity) =>
          printf("[No]:%s [Name]:%s [Quantity]:%s\n", no, name, quantity)
        case _ => printf("")
      }
    }
  }
}

