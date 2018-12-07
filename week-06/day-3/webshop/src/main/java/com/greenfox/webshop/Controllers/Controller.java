package com.greenfox.webshop.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/webshop")
    public String home(Model model) {
//        model.addAttribute("name", " Seadog");
        return "webshop";
    }

}
