package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void testCheckAnagram1() {
        assertFalse(Anagram.checkAnagram("apples", "pears"));
    }

    @Test
    void testCheckAnagram2() {
        assertTrue(Anagram.checkAnagram("spear", "pears"));
    }

    @Test
    void testCheckAnagram3() {
        assertFalse(Anagram.checkAnagram("apples", "apple"));
    }

    @Test
    void testCheckAnagram4() {
        assertTrue(Anagram.checkAnagram("000000000001", "000010000000"));
    }
    @Test

    void testCheckAnagram5() {
        assertFalse(Anagram.checkAnagram("apples", ""));
    }

    @Test
    void testCheckAnagram6() {
        assertTrue(Anagram.checkAnagram("", ""));
    }
}