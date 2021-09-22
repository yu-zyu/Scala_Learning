package chap09.program04

import scala.actors._
import scala.actors.Actor._

object AsyncActorTest {
  def main(args: Array[String]) : Unit = {
    val receiver = actor {
      react {
        case m:String => {
          Thread.sleep(5000L)
          println("receiver: sending the reply...")
          reply("reply(Async) => " + m)
        }
      }
    }
    reciver.start

    val sender = actor {
      println("sender: sending a message...")
      val reply = receiver !? "Hello!" //同期メッセージ送信
      println("sender: got the reply: " + reply)
      println("sender: executing some other task...")
      Thread.sleep(2000L)
    }
    sender.start
  }
}

