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
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(fibonacci(10)); // Output: 55
    }
}