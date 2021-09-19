package chap05.program01

object Main {
  def main(args: Array[String]) :Unit = {
    var list = 1::2::3::Nil

    var amount = sumList(list)
    println(amount) //6と表示
  }

  def sumList(list:List[Int]) :Int = {
    var amount = 0
    for (i <- list) {
      amount += i
    }

    amount
  }
}
