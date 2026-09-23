package com.example.guesthousebookingsystem.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Value("${customer-service.base-url}")
    private String customerServiceBaseUrl;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("customerServiceBaseUrl", customerServiceBaseUrl);
        return "index";
    }
}
