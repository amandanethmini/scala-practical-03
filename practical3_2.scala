object practical3_2 {
  def filterLongStrings(strings: List[String]): List[String] = {
    strings match {
      case Nil => Nil
      case head :: tail =>
        if (head.length > 5) head :: filterLongStrings(tail)
        else filterLongStrings(tail)
    }
  }

  def main(args: Array[String]): Unit = {
    val originalList =
      List("apple", "banana", "cherry", "date", "elderberry", "fig", "grape")
    val filteredList = filterLongStrings(originalList)
    println(s"Original List: $originalList")
    println(s"Filtered List: $filteredList")
  }
}
