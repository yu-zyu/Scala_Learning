package chap08.program02

object HelloThreadWorld {
  def main(args: Array[String]) : Unit = {
    val num = 10
    val threads: Array[Thread] = new Array(num)
    for (i <- 0 until num) {
      threads(i) = new HelloThread("Hello Thread no." + i)
      threads(i).start
    }

    for (i <- 0 until num) {
      threads(i).join
    }
    println("HelloThreadWorld: Done.");
  }
}

  class HelloThread(name: String) extends Thread(name) {
    override def run() : Unit = {
      println(getName() + ": Hello Thread World!");
    }
  }
