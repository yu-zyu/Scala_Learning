class Money(value:Int, currency:String){
  val v = value
  val c = currency
  override def toString: String = {
    "Money(value:" + v + " currency: " + c + ")"
  }
}

class Account{
  var balance:List[Money] = List()
  def deposit(money:Money) {
    balance = balance ::: List(money)
  }
}

val account = new Account
account deposit new Money(1,"JPY")
println(account.balance)
