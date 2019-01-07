package countletters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
    int result;

    @Test
    void counterTest1() {
        result = CountLetters.counter("apples").get("p");
        assertEquals(2, result);
    }

    @Test
    void counterTest2() {
        result = CountLetters.counter("apples").get("a");
        assertEquals(1, result);
    }

    @Test
    void counterTest3() {
        result = CountLetters.counter("apppppppleees").get("p");
        assertEquals(7, result);
    }

}