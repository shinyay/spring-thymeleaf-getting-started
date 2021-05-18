package com.google.shinyay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homeGet(Model model) {
        model.addAttribute("th_greet", "Hello");
        return "home";
    }

    @PostMapping("/")
    public String homePost(Model model, @RequestBody String name) {
        model.addAttribute("th_greet", "Hello, "+ name);
        return "home";
    }
}
