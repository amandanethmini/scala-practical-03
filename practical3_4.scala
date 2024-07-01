object practical3_4 {
  def sum(x: Array[Int]) = x match {
    case x if (x % 2 == 0) => x + sum(x - 1)
  }

  def main(args: Array[String]): Unit = {
    val list = Array(1, 2, 3, 4, 5, 6, 7)
    val out = sum(list)
    println("Sum pf even numbers $out")
  }
}
