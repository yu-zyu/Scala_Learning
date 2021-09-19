package chap06.program08

object Example9 {
  def main(args: Array[String]) {
    val tupP = (10, 5)
    val tupM = (-10, 5)
    for (tup <- List(tupP, tupM)) {
         tup match {
           case (t1, t2) if (t1 + t2) > 0 =>
             printf ("%s + %s is plus.\n", t1, t2)
           case (t1, t2) => 
             printf ("%s + %s is minus.\n", t1, t2)
         }
    }
  }
}
