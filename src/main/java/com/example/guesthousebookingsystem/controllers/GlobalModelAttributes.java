package com.example.guesthousebookingsystem.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalModelAttributes {

    private final String customerServiceBaseUrl;

    public GlobalModelAttributes(@Value("${customer-service.base-url}") String customerServiceBaseUrl) {
        this.customerServiceBaseUrl = customerServiceBaseUrl;
    }

    @ModelAttribute("customerServiceBaseUrl")
    public String customerServiceBaseUrl() {
        return customerServiceBaseUrl;
    }
}