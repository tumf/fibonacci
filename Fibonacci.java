public class Fibonacci {
    /**
     * Calculates the Nth Fibonacci number.
     *
     * @param n The index (non-negative integer) of the desired Fibonacci number.
     * @return The Nth Fibonacci number. Returns -1 for negative input.
     */
    public static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] testCases = {-1, 0, 1, 2, 5, 10, 20};
        for (int n : testCases) {
            System.out.printf("fibonacci(%d) = %d\n", n, fibonacci(n));
        }
        // Expected output:
        // fibonacci(-1) = -1
        // fibonacci(0) = 0
        // fibonacci(1) = 1
        // fibonacci(2) = 1
        // fibonacci(5) = 5
        // fibonacci(10) = 55
        // fibonacci(20) = 6765
    }
}