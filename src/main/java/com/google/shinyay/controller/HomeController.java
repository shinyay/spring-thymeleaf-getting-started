package com.google.shinyay.controller;

import com.google.shinyay.config.ConfigProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    public HomeController(ConfigProperties props) {

    }
}
