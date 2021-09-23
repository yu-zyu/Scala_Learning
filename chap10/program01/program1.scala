package chap10.program01

object HelloParsing {
  def main(args: Array[String]) {
    val phrase = "Hello Scala World"
    val words = phrase.split(' ')
    words.foreach {println _}
  }
}

