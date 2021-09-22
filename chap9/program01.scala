package chap09.program01

import scala.concurrent.MailBox
import scala.concurrent.ops._
import java.util.Random

case class End()
object MailBoxTest {
  def main(args: Array[String]) : Unit = {
    val mailBox = new MailBox()
    val rand = new Random()

    for (i <- 0 to 2) { //スレッドプール
      val id = "Worker-" + i
      spawn { //ワーカースレッド
        while (true) {
          mailBox receive { //メッセージの受信
            case task: String => 
              println(id + " => My current task: " + task)
            case End =>
              println("Let's call it a day!")
              System.exit(0)
          }
        }
      }
    }

    spawn { //メッセージ送信スレッド
      val tasks: Array[String] = Array(
        "Wash a Car.", "Do the dishes.", "Do homework.",
        "Take a rest."
      )
      def pickOneTask : String = {
        tasks(rand.nextInt(tasks.length))
      }
      for (i <- 1 to 10) {
        Thread.sleep(rand.nextInt(3) * 1000L) // 0~2000msスリープ
        mailBox send pickOneTask //メッセージの送信
      }
      mailBox send End //終了メッセージ
    }
  }
}


