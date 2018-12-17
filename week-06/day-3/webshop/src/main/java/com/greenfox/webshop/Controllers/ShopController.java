package com.greenfox.webshop.Controllers;

import com.greenfox.webshop.ShopItem;
import com.greenfox.webshop.WebShop;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class ShopController {
    WebShop myShop;

    public ShopController(){
        myShop = new WebShop("HUF");
        myShop.addItem(new ShopItem("A single sock", "We don't know", 2000, 1));
        myShop.addItem(new ShopItem("Christmas cookie assortment", "Yum", 2500, 2800));
        myShop.addItem(new ShopItem("Christmas present", "???", 700, 900));
        myShop.addItem(new ShopItem("Santa's hat", "Warm & fuzzy", 8000000, 1));
        myShop.addItem(new ShopItem("Nikecell reindeer", "Not very impressive", 120, 70));
    }

    @GetMapping("/webshop/products")
    public String home(Model model) {
        model.addAttribute("items", myShop.getItems());
        return "webshop";
    }

    @GetMapping("/webshop/products/available")
    public String available(Model model) {
        model.addAttribute("items", myShop.listAvailable());
        return "webshop";
    }

    @GetMapping("/webshop/products/sort_by_price")
    public String byPrice(Model model) {
        model.addAttribute("items", myShop.listByPrice());
        return "webshop";
    }

    @GetMapping("/webshop/products/search_item")
    public String search(Model model, @RequestParam String keyword) {
        model.addAttribute("items", myShop.filterByKeyword(keyword));
        return "webshop";
    }

    @PostMapping("/webshop/products/search_item")
    public String acceptSearch(@RequestParam String search) {
       return "redirect:/webshop/products/search_item?keyword=" + search;
    }

    @GetMapping("/webshop/show/average_stock")
    public String averageStock(Model model) {
        model.addAttribute("thingToShow", myShop.getAverageStock());
        return "show";
    }

    @GetMapping("/webshop/show/most_expensive_item")
    public String mostExpansive(Model model) {
        model.addAttribute("thingToShow", myShop.getMostExpensive());
        return "show";
    }

}
