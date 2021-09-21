package chap08.program09

import scala.concurrent.ops._
import java.lang.Thread._

object FutureTest {
  def main(args: Array[String]) : Unit = {

    println("main: getting the future value ...")
    val value = future {
      println("calc: begin")
      sleep(10000L) // 10秒かかる処理
      println("calc: end")
      100 // 処理結果を固定値として返す
    }

    println("main: eexecuting some other task ...")
    sleep(5000L) // 5秒間別の処理を実行

    println("main: getting the result ...")
    println("result: " + value())
  }
}

