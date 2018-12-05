package animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal cat = new Animal();

    @Test
    void eatTest() {
        int h = cat.getHunger();
        cat.eat();
        assertEquals(h - 1, cat.getHunger());
    }

    @Test
    void drinkTest() {
        int t = cat.getThirst();
        cat.drink();
        assertEquals(t - 1, cat.getThirst());
    }

    @Test
    void playTest() {
        int h = cat.getHunger();
        int t = cat.getThirst();
        cat.play();
        assertEquals(h + 1, cat.getHunger());
        assertEquals(t + 1, cat.getThirst());
    }
}