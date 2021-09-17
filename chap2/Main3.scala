package chap02.program03

object Main {
  def main(args:Array[String]){
    val mg:AbstractGreeting = new MorningGreeting
    println(mg.getMessage)
    val eg:AbstractGreeting = new EveningGreeting
    println(eg.getMessage)
  }
}

    
