package chap08.program03

object ReservationTest {
  var seats: Int = 100 //残り座席数

  def getSeats = seats //座席数取得
  def setSeats(seats: Int) = this.seats = seats // 座席数更新

  def main(args: Array[String]) : Unit = {
    printStatus

    val t1 = new ReservationThread("Thread no.1", 2)
    t1.start
    val t2 = new ReservationThread("Thread no.2", 4)
    t2.start

    t1.join
    t2.join

    printStatus
  }

  //予約可能な残りの座席数を表示
  def printStatus = println("Remaining seats: " + getSeats)

  class ReservationThread(name: String, num: Int)
  extends Thread(name) {
    override def run() : Unit =  {
      val seats = getSeats //座席数取得
      println(getName() + ": Remaining seats=> " + seats)
      Thread sleep(100L) //処理実行
      println(getName() + ": Remaining seats reserved=> " + num)
      ReservationTest setSeats(seats - num) //座席数更新
    }
  }
}
