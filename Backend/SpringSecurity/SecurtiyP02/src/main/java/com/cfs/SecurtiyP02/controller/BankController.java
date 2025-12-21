package com.cfs.SecurtiyP02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    @GetMapping("/contactUs")
    public String contactUs() {
        return "Contact US at: 870800487494";
    }

    @GetMapping("/transfer")
    public String transfer() {
        return "money Transfer successful";
    }

    @GetMapping("/admin")
    public String admin() {
        return "welcome admin";
    }

    @GetMapping("/about")
    public String about() {
        return "Rohit Grover founder of grover bank";
    }
}
