#include <stdio.h>

// Iterative Fibonacci function
unsigned long long fibonacci(int n) {
    if (n <= 1) return n;
    unsigned long long a = 0, b = 1, temp;
    for (int i = 2; i <= n; ++i) {
        temp = a + b;
        a = b;
        b = temp;
    }
    return b;
}

int main(void) {
    int n = 10;
    printf("Fibonacci sequence up to n=%d:\n", n);
    for (int i = 0; i <= n; ++i) {
        printf("fib(%d) = %llu\n", i, fibonacci(i));
    }
    return 0;
}
