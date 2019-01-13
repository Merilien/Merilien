package com.greenfox.seadog.frontend.controllers;

import com.greenfox.seadog.frontend.model.*;
import com.greenfox.seadog.frontend.services.LogService;
import com.greenfox.seadog.frontend.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BackendController {

    private ResultService resultService;
    private LogService logService;

    @Autowired
    public BackendController(ResultService resultService, LogService logService) {
        this.resultService = resultService;
        this.logService = logService;
    }

    @GetMapping("/doubling")
    public DoubleAmount doubleNumber(@RequestParam(required = false) Integer input) {
        logService.saveLog("input=" + input, "/doubling");
        if (input == null) {
            throw new UnsupportedOperationException("Please provide an input!");
        }
        return new DoubleAmount(input);
    }

    @GetMapping("/greeter")
    public Greeting greet(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        logService.saveLog("name=" + name + ", title=" + title, "/greeter");
        if (name == null) {
            throw new UnsupportedOperationException("Please provide a name!");
        } else if (title == null) {
            throw new UnsupportedOperationException("Please provide a title!");
        }
        return new Greeting(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public AppendA appendA(@PathVariable String appendable) {
        logService.saveLog("appendable=" + appendable, "/appenda/" + appendable);
        return new AppendA(appendable);
    }

    @PostMapping("/dountil/{action}")
    public Result doUntil(@PathVariable String action, @RequestBody DoUntil dountil) {
        logService.saveLog("action=" + action + ", doUntil.until=" + dountil.getUntil(), "/dountil/" + action);
        if (dountil == null) {
            throw new UnsupportedOperationException("Please provide a number!");
        } else if (action.equals(null)) {
            throw new UnsupportedOperationException("Please provide an action!");
        } else if (action.equals("sum")) {
            return new Result(dountil.sum());
        } else if (action.equals("factor")) {
            return new Result(dountil.multiply());
        } else {
            throw new UnsupportedOperationException("Invalid operation");
        }
    }

    @PostMapping("/arrays")
    public Result handleArray(@RequestBody ArrayHandler handler) {
        logService.saveLog("handler.what=" + handler.getWhat() + ", handler.numbers=" + handler.getNumbers().toString(), "/arrays");
        if (handler.getNumbers() == null) {
            throw new UnsupportedOperationException("Please provide numbers!");
        } else if (handler.getWhat() == null) {
            throw new UnsupportedOperationException("Please provide what to do with the numbers!");
        } else if (handler.getWhat().equals("sum")) {
            return resultService.sumArray(handler.getNumbers());
        } else if (handler.getWhat().equals("multiply")) {
            return resultService.multiplyArray(handler.getNumbers());
        } else if (handler.getWhat().equals("double")) {
            return resultService.doubleArray(handler.getNumbers());
        } else {
            throw new UnsupportedOperationException("Invalid operation");
        }
    }

}
