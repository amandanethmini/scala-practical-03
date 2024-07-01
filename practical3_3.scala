object practical3_3 {
  def mean(x: Int, y: Int): Double = (x + y) / 2.0

  def main(args: Array[String]): Unit = {
    val a = 5
    val b = 4
    val out = mean(a, b)
    println(f"Average: $out%.2f")
  }
}
