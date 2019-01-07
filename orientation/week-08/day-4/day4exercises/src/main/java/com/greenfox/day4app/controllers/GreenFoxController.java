package com.greenfox.day4app.controllers;

import com.greenfox.day4app.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxController {

    @Autowired
    StudentService service;

    @GetMapping("/gfa")
    public String listPages(Model model) {
        model.addAttribute("studentCount", service.getCount());
        model.addAttribute("studentList", "/gfa/list");
        model.addAttribute("addStudent", "/gfa/add");
        return "home";
    }

    @GetMapping("/gfa/list")
    public String listStudents(Model model) {
        model.addAttribute("students", service.findAll());
        return "students";
    }

    @GetMapping("/gfa/add")
    public String addStudent(Model model) {
        model.addAttribute("title", "Add Form");
        model.addAttribute("action", "/gfa/save");
        model.addAttribute("button", "Add student");
        return "form";
    }

    @GetMapping("/gfa/save")
    public String saveStudent(@RequestParam String name) {
        service.save(name);
        return "redirect:/gfa";
    }

    @GetMapping("/gfa/check")
    public String checkStudentForm(Model model) {
        model.addAttribute("title", "Check Student Form");
        model.addAttribute("action", "/gfa/check_result");
        model.addAttribute("button", "Check student");
        return "form";
    }

    @GetMapping("/gfa/check_result")
    public String checkStudent(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("statusText", (service.checkStudent(name) ? " is " : " is not ") + "a student here.");
        return "result";
    }


}
