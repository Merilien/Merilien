package com.greenfox.day2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLController {

    @GetMapping("/fancy")
    public String showFancyTable() {
        return "table";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "loginform";
    }

    @GetMapping("/newsletter")
    public String showNewsLetter() {
        return "newsletter";
    }

    @GetMapping("/signup")
    public String showSignUpPage() {
        return "signup";
    }

}
