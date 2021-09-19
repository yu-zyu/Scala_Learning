package chap05.program02

object Main {
  def main(args: Array[String]) :Unit = {
    var list = (1 to 100000).toList // １から１０００００までのリストを作成

    var amount = sumList(list)
    println(amount) 
  }

  def sumList(list:List[Int]) :Int = {
    list match {
      case Nil => 0
      case x::xs => x + sumList(xs)
    }
  }
}
