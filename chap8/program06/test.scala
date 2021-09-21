package test

import scala.collection.mutable.ListBuffer
import java.util.concurrent.locks._

class HelloLock {
  val values = new ListBuffer[Int]
  val lock: Lock = new ReentrantLock()
  val cond: Condition = lock.newCondition()

  def take() = {
    lock.lock()
    try {
      while(values.size == 0) {
        cond.await()
      }
      values.remove(0)
    } finally {
      lock.unlock()
    }
  }

  def put(value: Int) = {
    lock.lock()
    try {
      values.append(value)
      cond.signalAll()
    } finally {
      lock.unlock()
    }
  }
}

