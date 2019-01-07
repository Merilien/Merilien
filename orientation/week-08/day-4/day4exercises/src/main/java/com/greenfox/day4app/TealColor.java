package com.greenfox.day4app;

import org.springframework.stereotype.Service;

@Service
public class TealColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("I'm teal yaaay");
    }
}
