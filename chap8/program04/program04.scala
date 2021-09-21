package chap08.program04

import scala.concurrent._

object HelloThreadWorld2 {
  def main(args: Array[String]): Unit = {
    val num = 10
    for ( i <- 0 until num ) {
      spawn { //コードブロック部分がrun()メソッドの処理として実行される
        println("Hello Thread no." + i)
      }
    }
  }
}

