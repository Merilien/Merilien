package com.greenfox.seadog.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping("/")
    public String renderIndex() {
        return "index";
    }

}
