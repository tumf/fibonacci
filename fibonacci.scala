// Calculates the Nth Fibonacci number.
//
// Args:
//   n: The index (non-negative integer) of the desired Fibonacci number.
//
// Returns:
//   The Nth Fibonacci number. Returns -1 for negative input.
object Fibonacci {
  def fibonacci(n: Int): Int = {
    if (n < 0) -1
    else if (n == 0) 0
    else if (n == 1) 1
    else {
      var a = 0
      var b = 1
      for (_ <- 2 to n) {
        val tmp = a + b
        a = b
        b = tmp
      }
      b
    }
  }

  // Example usage
  def main(args: Array[String]): Unit = {
    println(fibonacci(10)) // Output: 55
  }
}
    if (n < 0) -1
    else if (n == 0) 0
    else if (n == 1) 1
    else {
      var a = 0
      var b = 1
      for (_ <- 2 to n) {
        val tmp = a + b
        a = b
        b = tmp
      }
      b
    }
  }

  // Example usage
  def main(args: Array[String]): Unit = {
    println(fibonacci(10)) // Output: 55
  }
}
>>>>>>> 5ccdc5d (Add Scala implementation and tests for Fibonacci sequence)
