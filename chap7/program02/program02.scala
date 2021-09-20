package chap07.program02
import scala.language.postfixOps

trait AbstractDef {
  def walk():String
}

class DuckDef extends AbstractDef {
  def walk = {"It walks like a duck."}
}

class TurkeyDef extends AbstractDef {
  val walk = "It walks like a turkey."
}

class ChickenDef extends AbstractDef {
  var walk = "It walks like a chicken."
}

object DefMain{
  def main(args: Array[String]) {
    println(new DuckDef walk)
    println(new TurkeyDef walk)
    println(new ChickenDef walk)
  }
}


