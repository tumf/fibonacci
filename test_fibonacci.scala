// Batch test for Fibonacci.fibonacci
object TestFibonacci {
  def main(args: Array[String]): Unit = {
    val testCases = Seq(
      (-1, -1),
      (0, 0),
      (1, 1),
      (2, 1),
      (10, 55)
    )
    val results = testCases.map { case (input, expected) =>
      val result = Fibonacci.fibonacci(input)
      val ok = result == expected
      s"fibonacci($input) = $result (expected: $expected) => ${if (ok) "OK" else "FAIL"}"
    }
    results.foreach(println)
    if (results.exists(_.contains("FAIL"))) sys.exit(1)
  }
}