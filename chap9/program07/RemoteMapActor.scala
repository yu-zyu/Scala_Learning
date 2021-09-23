package chap09.program07

import scala.actors.Actor._
import scala.actors.remote.RemoteActor._
import scala.collection.mutable.ListBuffer

object RemoteMapActor {
  def main(args: Array[String]) {
    println("RemoteMapActor: Starting...")
    actor {
      alive(10000)
      register('remoteMapActor, self)
      loop {
        react {
          case text:String => reply(map(text))
          case _ => println("RemoteMapActor: ???")
        }
      }
    }
  }

  def map(text: String) = {
    val words = new ListBuffer[(String, Int)]
    text.split(' ').foreach(words += _->1)
    val mapOutput = MapOutput(words.toList)
    println("RemoteMapActor: map : " + mapOutput)
    mapOutput
  }
}

