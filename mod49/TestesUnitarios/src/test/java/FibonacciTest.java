import org.junit.Test;

import static org.example.fibonacci.Fibonacci.fibonacci;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void fibonacciTestPos0() {
        assertEquals(0, fibonacci(0));
    }

    @Test
    public void fibonacciTestPos1() {
        assertEquals(1, fibonacci(1));
    }

    @Test
    public void fibonacciTestPos2() {
        assertEquals(1, fibonacci(2));
    }

    @Test
    public void fibonacciTestPos3() {
        assertEquals(2, fibonacci(3));
    }

    @Test
    public void fibonacciTestPos4() {
        assertEquals(3, fibonacci(4));
    }

    @Test
    public void fibonacciTestPos5() {
        assertEquals(5, fibonacci(5));
    }

    @Test
    public void fibonacciTestPos6() {
        assertEquals(8, fibonacci(6));
    }
}
