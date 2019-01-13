package com.greenfox.seadog.frontend.model;

public class DoUntil {

    private int until;

    public DoUntil() {
    }

    public DoUntil(int until) {
        this.until = until;
    }

    public int sum() {
        int result = 0;
        for (int i = 1; i <= until; i++) {
            result += i;
        }
        return result;
    }

    public int multiply() {
        int result = 1;
        for (int i = 2; i <= until; i++) {
            result *= i;
        }
        return result;
    }

    public int getUntil() {
        return until;
    }

    public void setUntil(int until) {
        this.until = until;
    }
}
