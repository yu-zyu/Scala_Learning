package chap05.program02Fix

object Main {
  def main(args: Array[String]) :Unit = {
    var list = (1 to 100000).toList // １から１０００００までのリストを作成

    var amount = sumList(list)
    println(amount) 
  }

  def sumList(list:List[Int]) :Int = {
    def sumListLocal(accumulator:Int ,list:List[Int]) :Int = {
      list match {
        case Nil => accumulator
        case ::(x, xs) => sumListLocal(accumulator + x, xs)
      }
    }

    sumListLocal(0, list)
  }
}
