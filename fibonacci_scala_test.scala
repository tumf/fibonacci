object FibonacciScalaTest {
  def main(args: Array[String]): Unit = {
    val testCases = Seq(
      (-1, -1),
      (0, 0),
      (1, 1),
      (2, 1),
      (5, 5),
      (10, 55),
      (20, 6765)
    )
    var allPassed = true
    for ((input, expected) <- testCases) {
      val result = Fibonacci.fibonacci(input)
      if (result != expected) {
        println(s"Test failed: fibonacci($input) = $result, expected $expected")
        allPassed = false
      }
    }
    if (allPassed) println("All tests passed.")
  }
}
