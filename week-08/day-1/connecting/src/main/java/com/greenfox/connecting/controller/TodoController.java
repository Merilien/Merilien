package com.greenfox.connecting.controller;

import com.greenfox.connecting.model.Todo;
import com.greenfox.connecting.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository repository;

    @Autowired
    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value={"", "/", "/list"})
    public String list(Model model, @RequestParam(required = false, name= "isActive") Boolean isActive) {
        if (isActive != null) {
            if (isActive) {
                model.addAttribute("todos", repository.findAllByDoneIsTrue());
            }
        } else {
            model.addAttribute("todos", repository.findAll());
        }
        return "todolist";
    }

}
