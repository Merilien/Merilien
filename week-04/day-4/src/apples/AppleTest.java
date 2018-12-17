package apples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    Apple testApple = new Apple();

    @BeforeEach
    void setUp() {
        System.out.println("Testing getApple()...");
    }

    @Test
    void test1() {
        assertEquals("apple", testApple.getApple());
    }

    @Test
    void test2() {
        assertEquals("k", testApple.getApple());
    }
}