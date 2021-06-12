package com.google.shinyay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class IndexController {

    @GetMapping("/")
    public String indexGet(Model model) {
        String currentTime = ZonedDateTime.now(ZoneId.of("Japan")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        model.addAttribute("th_current", currentTime);
        model.addAttribute("th_greet", "Hello");
        return "index";
    }

    @PostMapping("/")
    public String indexPost(Model model, @RequestBody String name) {
        String currentTime = ZonedDateTime.now(ZoneId.of("Japan")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        model.addAttribute("th_current", currentTime);
        model.addAttribute("th_greet", "Hello, "+ name);
        return "index";
    }
}
