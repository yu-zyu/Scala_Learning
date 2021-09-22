package chap09.program02

import scala.actors._
import scala.actors.Actor._

case class End()
object HelloActor {
  def main(args: Array[String]) : Unit = {
    val helloActor = actor {
      loop {
        react { //メッセージの受信　
          case m:String => println("Got amessage: " + m)
          case End => println("End."); System.exit(0)
        }
      }
    }
    helloActor.start //待ち受け側アクターの処理開始

    for(i <- 1 to 3) {
      //アクターへのメッセージの送信
      helloActor ! "Hello, Actor World! " + i
      Thread.sleep(1000L)
    }
    helloActor ! End // 「終了」メッセージの送信
  }
}

