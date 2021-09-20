package chap07.program01
import scala.language.postfixOps

trait Abstract {
  val name: String
  var version: String
}

class Concrete extends Abstract {
  val name = "scala"
  var inner = "2.7.7"
  def version_= (value:String) {inner = value}
  def version:String={inner}
}
object Main{
  def main(args: Array[String]) {
    val cv = new Concrete
    cv version = "2.8"
    print(cv name, cv version)
  }
}
