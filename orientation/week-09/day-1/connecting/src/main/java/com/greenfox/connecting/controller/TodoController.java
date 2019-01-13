package com.greenfox.connecting.controller;

import com.greenfox.connecting.model.Todo;
import com.greenfox.connecting.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository repository;

    @Autowired
    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = {"", "/", "/list"})
    public String list(Model model, @RequestParam(required = false, name = "isActive") Boolean isActive,
                       @ModelAttribute("todo2delete") Todo todo) {
        if (isActive != null) {
            if (isActive) {
                model.addAttribute("todos", repository.findAllByDoneIsTrue());
            }
        } else {
            model.addAttribute("todos", repository.findAll());
        }
        model.addAttribute("todo2delete", todo);
        return "todolist";
    }

    @GetMapping("/add")
    public String addForm(Model model, @ModelAttribute("todo") Todo todo) {
        model.addAttribute("todo", todo);
        return "todoform";
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute("todo") Todo todo) {
        repository.save(todo);
        return "redirect:/todo";
    }

    @GetMapping("/delete")
    public String deleteTodo(@RequestParam Long id) {
        repository.deleteById(id);
        return "redirect:/todo";
    }

}
