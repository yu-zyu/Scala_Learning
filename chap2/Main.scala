package chap02.program01

object Main{
  def main(args:Array[String]){
    val hello = new Hello
    println(hello.getMessage)
    var hello2 = new Hello
    hello2.printMessage
    hello2 = new Hello
    hello2.printMessage
  }
}
    
