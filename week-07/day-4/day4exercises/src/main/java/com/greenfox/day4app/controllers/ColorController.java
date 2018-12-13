package com.greenfox.day4app.controllers;

import com.greenfox.day4app.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ColorController {
    @Autowired
    UtilityService service;

    @GetMapping("/useful")
    public String listAvailable(Model model) {
        model.addAttribute("colorService", "/useful/colored");
        model.addAttribute("emailService", "/useful/email?inputString=is@this.valid");
        model.addAttribute("caesarEncodeService", "/useful/caesar/encode?text=abCd&num=1");
        model.addAttribute("caesarDecodeService", "/useful/caesar/decode?text=abCd&num=1");
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String colorBackground(Model model) {
        model.addAttribute("backgroundColor", service.randomColor());
        return "background";
    }

    @GetMapping("/useful/email")
    public String checkEmail(Model model, @RequestParam String inputString) {
        model.addAttribute("input", inputString);
        model.addAttribute("color", service.validateEmail(inputString) ? "green" : "red");
        return "email";
    }

    @GetMapping("/useful/caesar/encode")
    public String caesarEncode(Model model, @RequestParam String text, int num) {
        model.addAttribute("text", service.caesar(text, num));
        return "caesar";
    }

    @GetMapping("/useful/caesar/decode")
    public String caesarDecode(Model model, @RequestParam String text, int num) {
        model.addAttribute("text", service.caesar(text, -num));
        return "caesar";
    }

}
