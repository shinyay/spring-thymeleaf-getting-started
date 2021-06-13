package com.google.shinyay.controller;

import com.google.shinyay.config.ConfigProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    private final ConfigProperties props;

    public HomeController(ConfigProperties props) {
        this.props = props;
    }

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/hello")
    public String helloPage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("author", props.getAuthor());
        return "home";
    }

}
