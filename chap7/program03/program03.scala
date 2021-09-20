package chap07.program03
import scala.language.postfixOps

trait Abstract {
  type T
  val v: T
}

class ConcreteInt extends Abstract {
  type T = Int
  val v = 1
}

class ConcreteString extends Abstract {
  type T = String
  val v = "Hello Abstract Type!"
}

object Main{
  def main(args: Array[String]) {
    println(new ConcreteInt v)
    println(new ConcreteString v)
    val anon = new Abstract {
      type T = String
      val v = ""
    }
    val inner:anon.T = "Hello path-dependent type!"
    println (inner)
  }
}


