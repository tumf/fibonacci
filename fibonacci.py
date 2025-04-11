\
def fibonacci(n):
    """
    Calculates the Nth Fibonacci number.

    Args:
        n: The index (non-negative integer) of the desired Fibonacci number.

    Returns:
        The Nth Fibonacci number. Returns -1 for negative input.
    """
    if n < 0:
        return -1  # Or raise an error, depending on desired behavior
    elif n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        a, b = 0, 1
        for _ in range(2, n + 1):
            a, b = b, a + b
        return b

# Example usage:
# print(fibonacci(10))  # Output: 55
