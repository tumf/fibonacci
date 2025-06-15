#include <stdio.h>

// Calculates the Nth Fibonacci number.
// Returns -1 for negative input.
int fibonacci(int n) {
    if (n < 0) return -1;
    if (n == 0) return 0;
    if (n == 1) return 1;
    int a = 0, b = 1, i;
    for (i = 2; i <= n; ++i) {
        int tmp = a + b;
        a = b;
        b = tmp;
    }
    return b;
}

int main(void) {
    int test_cases[] = {-1, 0, 1, 2, 5, 10, 20};
    int expected[]   = {-1, 0, 1, 1, 5, 55, 6765};
    int n_cases = sizeof(test_cases) / sizeof(test_cases[0]);
    for (int i = 0; i < n_cases; ++i) {
        int n = test_cases[i];
        int result = fibonacci(n);
        printf("fibonacci(%d) = %d (expected: %d)%s\n", n, result, expected[i], result == expected[i] ? "" : " [NG]");
    }
    return 0;
}