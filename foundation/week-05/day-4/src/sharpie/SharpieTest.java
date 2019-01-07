package sharpie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
    Sharpie sharpie;

    @Test
    void useTest() {
        sharpie = new Sharpie("red", 0.5f);
        assertEquals(100, sharpie.getInkAmount());
        for (int i = 0; i < 200; i++) {
            sharpie.use();
        }
        assertEquals(100 - 200 * 0.1f, sharpie.getInkAmount());
    }
}