package ru.java.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String calculation(@RequestParam(value = "a", required = false) int a,
                              @RequestParam(value = "b", required = false) int b,
                              @RequestParam(value = "action", required = false) String action,
                              Model model) {

        int result;
        switch (action) {
            case ("multiplication"):
                result = a * b;
                break;
            case ("addition"):
                result = a + b;
                break;
            case ("substruction"):
                result = a - b;
                break;
            case ("division"):
                result = a / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + action);
        }

        model.addAttribute("message", "result = " + result);
        return "calculator/calculator";
    }
}

