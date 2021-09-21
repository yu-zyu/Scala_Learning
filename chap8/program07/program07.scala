package chap08.program07

import java.util.concurrent.Semaphore
import java.lang.Thread._
import scala.concurrent.ops._

object SemaphoreTest {
  def main(args: Array[String]) : Unit = {
    val sharedValue = "*** valuable resource ***"

    val count = 3 //同時アクセス数の上限
    val semaphore = new Semaphore(count)
    for (i <- 1 to 12) {
      spawn {
        semaphore.acquire //セマフォの取得
        try {
          println("Thread-" + i + ": " + sharedValue + 
            " : queueLength -> " + semaphore.getQueueLength)
          sleep(1000L)
        } finally {
          semaphore.release //セマフォの解放
        }
      }
    }
  }
}

