package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    int n;

    @Test
    void calculateFibTest1() {
        n = 3;
        assertEquals(2, Fibonacci.calculateFib(n));
    }

    @Test
    void calculateFibTest2() {
        assertEquals(8, Fibonacci.calculateFib(6));
    }

    @Test
    void calculateFibTest3() {
        n = -2;
        assertEquals(-2, Fibonacci.calculateFib(n));
    }
}