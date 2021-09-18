class Account {
  var balance:List[(Int,String)] = List()
  def deposit(money:(Int,String)) {
    balance = balance ::: List(money)
  }
}

val account = new Account
account deposit (1,"USD")
println(account.balance)
