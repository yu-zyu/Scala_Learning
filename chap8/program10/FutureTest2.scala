package chap08.program10

import java.util.concurrent._
import java.lang.Thread._

object FutureTest2 {
  def main(args: Array[String]) : Unit = {
    val es = Executors.newCachedThreadPool()
    println("main: getting the future value...")
    val future = es.submit(new Callable[Int]() {
      def call() = {
        println("calc: begin")
        sleep(10000L) //10秒かかる処理
        println("calc: end")
        100 //処理結果を固定値として返す
      }
    });

    println("main: executing some other task...")
    sleep(5000L)

    println("main: getting the result...")
    print("result: " + future.get)

    es.shutdown
    }
}
