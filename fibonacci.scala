// Calculates the Nth Fibonacci number.
//
// Args:
//   n: The index (non-negative integer) of the desired Fibonacci number.
//
// Returns:
//   The Nth Fibonacci number. Returns -1 for negative input.
object Fibonacci {
  def fibonacci(n: Int): Int = {
    if (n < 0) return -1
    if (n == 0) return 0
    if (n == 1) return 1
    var a = 0
    var b = 1
    for (_ <- 2 to n) {
      val temp = b
      b = a + b
      a = temp
    }
    b
  }
}

// Example usage:
// println(Fibonacci.fibonacci(10)) // Output: 55
