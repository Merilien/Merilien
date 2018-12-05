package sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum summer = new Sum();
    ArrayList<Integer> list;

    @Test
    void sumTest1() {
        Integer[] l = {1, 2, 3, 4};
        list = new ArrayList<>(Arrays.asList(l));
        assertEquals(10, summer.sum(list));
    }

    @Test
    void sumTest2() {
        Integer[] l = {};
        list = new ArrayList<>(Arrays.asList(l));
        assertEquals(0, summer.sum(list));
    }

    @Test
    void sumTest3() {
        Integer[] l = null;
        list = new ArrayList<>(Arrays.asList(l));
        assertEquals(null, summer.sum(list));
    }

    @Test
    void sumTest4() {
        Integer[] l = {7};
        list = new ArrayList<>(Arrays.asList(l));
        assertEquals(7, summer.sum(list));
    }


}