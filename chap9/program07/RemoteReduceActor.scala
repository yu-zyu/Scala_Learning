package chap09.program07

import scala.actors.Actor._
import scala.actors.remote.RemoteActor._

object RemoteReduceActor {
  def main(args: Array[String]) {
    println("RemoteReduceactor: Starting...")
    actor {
      alive(11000)
      register('remoteReduceActor, self)
      loop {
        react {
          case i: ReduceInput => reply(reduce(i))
          case _ => println("RemoteReduceActor: ???")
        }
      }
    }
  }

  def reduce(i: ReduceInput) = {
    val reduceOUtput = 
      ReduceOutput(i.key, i.entries.foldLeft(0)(_ + _._2))
    println("RemoteReduceActor: reduce : " + reduceOutput)
    reduceOutput
  }
}
