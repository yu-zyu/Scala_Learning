package chap08.program11

import scala.concurrent.ops._
import java.util.Random

object ReplicateTest {
  val rand = new Random

  def main(args: Array[String]) : Unit = {
    //10スレッドを生成して並行処理を行う
    replicate(1, 11) { (i: Int) =>
      sleepRandomly
      println("Thread-" + i + ": " + "Hello replicate!")
    }
  }

  //0~900msの間でランダムな時間スリープする
  def sleepRandomly() = Thread.sleep(100 * rand.nextInt(10))
}

