# frozen_string_literal: true

def fibonacci(n)
  # Calculates the Nth Fibonacci number.
  #
  # Args:
  #   n: The index (non-negative integer) of the desired Fibonacci number.
  #
  # Returns:
  #   The Nth Fibonacci number. Returns nil for negative input.
  return nil if n < 0
  return 0 if n == 0
  return 1 if n == 1

  a = 0
  b = 1
  (2..n).each do
    a, b = b, a + b
  end
  b
end

# Example usage:
# puts fibonacci(10) # Output: 55
