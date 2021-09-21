package chap08.program08

import scala.concurrent.ops._

object ReadWriteLockTest {
  def main(args: Array[String]) : Unit = {
    val sharedValue = new HelloReadWriteLock() //リスト13で定義したクラス
    
    for ( i <- 1 to 8) { //値を読み込むスレッドを８つ生成
      spawn {
        sharedValue.read("[read]: Thread-" + i)
      }
    }
    for (i <- 1 to 2) { //値を書き込むメソッドを2つ生成
      spawn {
        sharedValue.write("[write]: Thread-" + i )
      }
    }
  }
}


