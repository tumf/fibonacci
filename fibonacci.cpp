#include <iostream>
#include <vector>

// Calculates the Nth Fibonacci number.
// Args:
//   n: The index (non-negative integer) of the desired Fibonacci number.
// Returns:
//   The Nth Fibonacci number. Returns -1 for negative input.
int fibonacci(int n) {
    if (n < 0) return -1;
    if (n == 0) return 0;
    if (n == 1) return 1;
    int a = 0, b = 1;
    for (int i = 2; i <= n; ++i) {
        int next = a + b;
        a = b;
        b = next;
    }
    return b;
}

int main() {
    std::vector<int> test_cases = {10, 0, 1, 2, 5, 20, -1};
    for (int n : test_cases) {
        std::cout << "fibonacci(" << n << ") = " << fibonacci(n) << std::endl;
    }
    return 0;
}