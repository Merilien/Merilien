package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    private static AtomicLong callCount = new AtomicLong(0);

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " Seadog");
        model.addAttribute("calls", callCount.incrementAndGet());
        return "greeting";
    }

}
