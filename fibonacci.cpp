#include <iostream>
#include <stdexcept>

// Calculates the Nth Fibonacci number.
// Returns -1 for negative input.
long long fibonacci(int n) {
    if (n < 0) return -1;
    if (n == 0) return 0;
    if (n == 1) return 1;
    long long a = 0, b = 1;
    for (int i = 2; i <= n; ++i) {
        long long next = a + b;
        a = b;
        b = next;
    }
    return b;
}

int main(int argc, char* argv[]) {
    if (argc != 2) {
        std::cerr << "Usage: " << argv[0] << " <n>" << std::endl;
        return 1;
    }
    int n = std::stoi(argv[1]);
    std::cout << fibonacci(n) << std::endl;
    return 0;
}