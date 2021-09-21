package chap08.program06

import scala.concurrent.SyncVar
import scala.concurrent.ops._
import java.lang.Thread._

object SyncVarTest {
  def main(args: Array[String]) : Unit = {
    val sharedValue = new SyncVar[Int]

    println("isSet -> " + sharedValue.isSet)
    spawn { //値を設定するスレッド
      sleep(1000L)
      sharedValue.set(10)
      sleep(3000L)
      sharedValue.unset
      sleep(3000L)
      sharedValue.set(100)
    }
    spawn { //値を取得するスレッド
      while (true) {
        println("get -> " + sharedValue.get)
        sleep(1000L)
      }
    }
  }
}

