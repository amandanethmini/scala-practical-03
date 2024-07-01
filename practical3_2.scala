object practical3_2 {
  def filter(strings: List[String]): List[String] = {
    strings match {
      case Nil => Nil
      case head :: tail =>
        if (head.length > 5) head :: filter(tail)
        else filter(tail)
    }
  }

  def main(args: Array[String]): Unit = {
    val originalList =
      List("apple", "banana", "cherry", "date", "elderberry", "fig", "grape")
    val filteredList = filter(originalList)
    println(f"Original List: $originalList")
    println(f"Filtered List: $filteredList")
  }
}
