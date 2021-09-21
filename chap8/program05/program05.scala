package chap08.program05

import java.util.concurrent._

object ExecutorTest {
  def main(args: Array[String]) : Unit = {
    val num = 10 //ThreadpoolExecutorの生成
    val es = Executors.newCachedThreadPool()
    for (i <- 0 until num ) {
      // Runnableを無名インナークラスとして実装
      es.execute(new Runnable() {
        def run() = {
          println("Hello Thread no." + i )
        }
      });
    }
    es.shutdown
  }
}

