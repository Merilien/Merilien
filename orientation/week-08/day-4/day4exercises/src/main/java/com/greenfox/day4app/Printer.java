package com.greenfox.day4app;

import org.springframework.stereotype.Service;

@Service
public class Printer {
    public void log(MyColor color) {
        color.printColor();
    }
}