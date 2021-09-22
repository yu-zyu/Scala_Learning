package chap09.program05

import scala.actors._
import scala.actors.Actor._

object FutureActorTest {
  def main(args: Array[String]) : Unit = {
    val receiver = actor {
      react {
        case m:String => {
          Thread.sleep(5000L)
          println("receiver: sending the reply...")
          reply("reply(Future) => " + m)
        }
      }
    }
    reciver.start

    val sender = actor {
      println("sender: sending a message...")
      val value = receiver !! "Hello!" // フューチャーによるメッセージ送信
      println("sender: executing some other task...")
      Thread.sleep(2000L)
      println("sender: got the reply... ")
      val reply = value() //フューチャーを呼び出して結果を取得
      println("sender: got the reply... " + reply)
      Thread.sleep(2000L)
    }
    sender.start
  }
}

