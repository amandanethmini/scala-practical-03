object practical3_4 {
  def sumEvenNumbers(numbers: List[Int]): Int = {
    numbers match {
      case Nil => 0
      case head :: tail =>
        if (head % 2 == 0)
          head + sumEvenNumbers(tail)
        else
          sumEvenNumbers(tail)
    }
  }

  def main(args: Array[String]): Unit = {
    val originalList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumOfEvens = sumEvenNumbers(originalList)
    println(s"Original List: $originalList")
    println(s"Sum of Even Numbers: $sumOfEvens")
  }
}
