package chap09.program07

import scala.actors._
import scala.actors.Actor._
import scala.actors.remote.Node
import scala.actors.remote.RemoteActor._
import scala.actors.ops

case class MapOutput(val entries:List[(String, Int)])
case class ReduceInput(val key:String,
  val entries:List[(String, Int)])
case class ReduceOutput(val key:String, val value:Int)

case class Begin()

object RemoteWordCount {
  def main(args: Array[String]) : Unit = {
    val data = List(
      "Hello World",
      "Hello Scala World",
      "Hello Java World",
      "Hello Java Hello",
      "Hello Scala Scala",
      "Scala World World World",
      "Scala World Scala World",
      "Hello Groovy")

    val remoteMapAcotr = select(Node("localhost", 10000),
      'remoteMapActor)
    val remoteReduceActor = select(Node("localhost", 11000),
      'remoteReduceActor)
    val masterActor = 
      new MasterActor(remoteMapActor,
        remoteReduceAtor, data).start

    spawn {
      println("RemoteWordCount: Begin")
      masterAtor ! Begin
      while(true) {
        println("RemoteWordCount: processing...")
        Thread.sleep(1000L)
      }
    }
  }
}

