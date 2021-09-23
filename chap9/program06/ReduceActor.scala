package chap09.program06

import scala.actors._
import scala.actors.Actor._

class ReduceActor extends Actor {
  def act() {
    println("ReduceActor: Starting...")
    loop {
      react {
        case i: ReduceInput => reply(reduce(i))
        case _ => println("ReduceActor: ???")
      }
    }
  }

  def reduce(i: ReduceInput) = {
    ReduceOutput(i.key, i.entries.foldLeft(0)(_ + _._2))
    }
}

