package chap08.program08

import java.util.concurrent.locks._
import java.util.Random

class HelloReadWriteLock {
  val rand = new Random()
  val lock = new ReentrantReadWriteLock()
  val readLock = lock.readLock
  val writeLock = lock.writeLock

  def read(name: String) = {
    readLock.lock
    println(name + ": acquired the readLock")
    try {
      //共有リソースを読み込むコード
      // ...
      sleep()
    } finally {
      println(name + ": releasing the readLock")
      readLock.unlock
    }
  }

  def write(name: String) = {
    writeLock.lock
    println(name + ": acquired the writeLock")
    try {
      // 共有リソースに書き込むコード
      // ...
      sleep()
    } finally {
      println(name + ": releasing the writeLock")
      writeLock.unlock
    }
  }

  // 0~900msの間でランダムな時間スリープする
  def sleep() = Thread.sleep(100 * rand.nextInt(10))
}

