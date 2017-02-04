package coll


object PatternMatch {
  def main(args: Array[String]): Unit = {
    def get(x: Any) = x match {
      case y: Int => x
      case s: String => s.toInt
      case _: BigInt => Int.MaxValue
      case _ => 0
    }

    //    println(get("10"))
    //    println(get(1))
    //    println(get(BigInt(23)))
    //    println(get(List(1)))

    def head(ls: Seq[Int]) = ls match {
      case x :: Nil =>
        println("first")
        x
      case x :: xs =>
        println("second")
        x
      case Nil => "none"
    }

    println(head(Seq(1, 2, 3, 4)))
    println(head(Seq(2, 1)))
    println(head(Seq(3)))
    println(head(Seq()))


    /*
    If the first value of pair is an Int, then it must return Int Value.

    If the first value of pair is an String, then it must return the Int value of String

    If the first value is something else, then it must return 0
     */
    def getNum(pair: (Any, Any)): Int = pair match {
      case (n:Int, _) => n
      case (n:String, _) => n.toInt
      case _ => 0
    }
  }

}
