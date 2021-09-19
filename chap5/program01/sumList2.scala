package chap05.program01Recursion

object Main {
  def main(args: Array[String]) :Unit = {
    var list = 1::2::3::Nil

    var amount = sumList(list)
    println(amount) //6と表示
  }

  def sumList(list:List[Int]) :Int = {
    list match {
      case Nil => 0
      case x::xs => x + sumList(xs)
    }
  }
}
