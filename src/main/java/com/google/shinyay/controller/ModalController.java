package com.google.shinyay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/modal")
public class ModalController {
    @GetMapping("/simple")
    public String simple() {
        return "modal";
    }
}
