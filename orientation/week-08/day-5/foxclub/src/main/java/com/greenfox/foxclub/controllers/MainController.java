package com.greenfox.foxclub.controllers;

import com.greenfox.foxclub.models.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private FoxService service;

    @GetMapping("/")
    public String loadIndex(Model model, @RequestParam(required = false) String name) {
        if (name == null) {
            return "redirect:/login";
        }
        if (service.isNewName(name)) {
            service.addFox(name);
        }
        service.activateFox(name);
        model.addAttribute("fox", service.getActiveFox());
        model.addAttribute("trickcount", service.getActiveFox().getSkills().size());
        return "index";
    }

    @GetMapping("/login")
    public String renderLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String sendLogin(@ModelAttribute("name") String name) {
        return "redirect:/?name=" + name;
    }

    @GetMapping("/nutrition-store")
    public String showStore(Model model, @RequestParam String name, @ModelAttribute("food") String food,
                            @ModelAttribute("drink") String drink) {
        if (name == null || service.isNewName(name)) {
            return "redirect:/login";
        }
        model.addAttribute("name", name);
        model.addAttribute("food", food);
        model.addAttribute("drink", drink);
        model.addAttribute("foodlist", service.getFoodoptions());
        model.addAttribute("drinklist", service.getDrinkoptions());
        return "nutrition";
    }

    @PostMapping("/nutrition-store")
    public String changeFood(Model model, @RequestParam String name, @ModelAttribute("food") String food,
                             @ModelAttribute("drink") String drink) {
        service.activateFox(name);
        service.getActiveFox().setFood(food);
        service.getActiveFox().setDrink(drink);
        return "redirect:/?name=" + name;
    }

}
