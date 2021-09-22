package chap09.program06

import scala.actors._
import scala.actors.Actor._
import scala.concurrent.ops._

case class MapOutput(val entries:List[(String, Int)])
case class ReduceInput(val key:String,val entries:List[(Strin,Int)])
case class ReduceOutput(val key:String, val value:Int)

case class Begin()
object WordCount {
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

    val mapActors = prepareMapActors(3)
    val reduceActors = prepareReduceActors(3)
    val masterActor = 
      new MasterActor(mapActors, reduceActors, data).start

    spawn {
      println("WordCount: Begin")
      masterActor ! Begin
      while(true) {
        println("WordCount: processing...")
        Thread.sleep(1000L)
      }
    }
  }

  def prepareMapActors(num:Int) = {
    val mapActors = new Array[Actor](num)
    for (i <- 0 to num-1)
      mapActors(i) = new MapActor().start
      mapActors
  }

  def prepareReduceActors(num:Int) = {
    val reduceActors = new Array[Actor](num)
    for (i <- 0 to num-1)
      reduceActors(i) = new ReduceActor().start
      reduceActors
  }
}

