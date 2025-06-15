import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void testNegative() {
        assertEquals(-1, Fibonacci.fibonacci(-5));
    }

    @Test
    public void testZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void testOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void testTwo() {
        assertEquals(1, Fibonacci.fibonacci(2));
    }

    @Test
    public void testTen() {
        assertEquals(55, Fibonacci.fibonacci(10));
    }

    @Test
    public void testLarge() {
        assertEquals(6765, Fibonacci.fibonacci(20));
    }
}