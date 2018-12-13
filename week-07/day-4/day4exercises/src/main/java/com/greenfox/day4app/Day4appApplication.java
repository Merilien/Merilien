package com.greenfox.day4app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day4appApplication implements CommandLineRunner {

    Printer printer;
    MyColor color;

    @Autowired
    public Day4appApplication(Printer printer, MyColor color) {
        this.printer = printer;
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(Day4appApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log(color);
    }
}

