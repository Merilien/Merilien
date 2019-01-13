package com.greenfox.simba.controllers;

import com.greenfox.simba.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    private List<BankAccount> accounts;

    public BankController() {
        accounts = new ArrayList<>();
        accounts.add(new BankAccount("Simba", 2000., "lion", true, false));
        accounts.add(new BankAccount("Pumba", 200., "warthog", false, false));
        accounts.add(new BankAccount("Timon", 5000., "meerkat", false, false));
        accounts.add(new BankAccount("Zazu", 6000., "some kind of bird", false, false));
        accounts.add(new BankAccount("Scar", 16000., "lion", true, true));
    }

    @GetMapping("/show")
    public String show(Model model) {
        BankAccount simba = new BankAccount("Simba", 2000., "lion", true, false);
        model.addAttribute("account", simba);
        return "show";
    }

    @GetMapping("/show_table")
    public String showTable(Model model) {
        model.addAttribute("accounts", accounts);
        return "showtable";
    }

    @GetMapping("/raise_balance")
    public String displayBalanceForm(Model model) {
        model.addAttribute("accounts", accounts);
        return "balanceform";
    }


    @PostMapping("/thx")
    public String addToBalance(@ModelAttribute(name = "selectAccount") int index) {
        accounts.get(index).incrementBalance();
        return "thankyoupage";
    }

    @GetMapping("/add_account")
    public String displayAccountForm(Model model, @ModelAttribute(name = "account") BankAccount account) {
        model.addAttribute("account", account);
        return "accountform";
    }

    @PostMapping("/add_account")
    public String createAccount(@ModelAttribute(name = "account") BankAccount account) {
        accounts.add(account);
        return "redirect:/show_table";
    }

    @GetMapping("/HTMLception")
    public String htmlception(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlception";
    }

}
