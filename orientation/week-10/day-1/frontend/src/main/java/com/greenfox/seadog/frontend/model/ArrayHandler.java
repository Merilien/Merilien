package com.greenfox.seadog.frontend.model;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler {
    private String what;
    private int[] numbers;

    public ArrayHandler() {
    }

    public ArrayHandler(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }


    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

}
