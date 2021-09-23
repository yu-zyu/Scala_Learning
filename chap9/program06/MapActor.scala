package chap09.program06

import scala.actors._
import scala.actors.Actor._
import scala.collection.mutable.ListBuffer

class MapActor extends Actor {
  def act() {
    println("MapActor: Starting...")
    loop {
      react {
        case text:String => reply(map(text))
        case _ => println("MapActor: ???")
      }
    }
  }

  def map(text: String) = {
    val words = new ListBuffer[(String,Int)]
    text.split(' ').foreach(words += _->1)
    MapOutput(words.toList)
  }
}

