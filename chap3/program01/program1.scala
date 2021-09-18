package chap03.program01

object Driver {
  def main(args: Array[String]) : Unit = {
    val double = (value: Int) => value * 2
    println(double(10))

    myLoop(10, double)
    myLoop(10, (value: Int) => value * 3)

    myLoop(10, nTimes(5))
  }

  def myLoop(max: Int, func:(Int) => Int) = {
    for (i <- 1 to max)
      print(func(i) + " ")
   println
  }

  def nTimes(times: Int) : (Int) => Int = {
    (value: Int) => value * times
  }
}
