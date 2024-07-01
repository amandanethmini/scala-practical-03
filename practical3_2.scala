object Practical3_2 {
  def filterStringsByLength(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val inputStrings =
      List("apple", "banana", "cherry", "grape", "kiwi", "orange")
    val filteredStrings = filterStringsByLength(inputStrings)
    println(filteredStrings)

  }
}
