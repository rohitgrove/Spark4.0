package com.cfs.SecurityP02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    @GetMapping("/contactUs")
    public String contactUS() {
        return "Contact US At : 85974854588";
    }

    @GetMapping("/transfer")
    public String transfer() {
        return "Your Money transfer successful";
    }

    @GetMapping("/admin")
    public String admin() {
        return "welcome admin";
    }

    @GetMapping("/about")
    public String about() {
        return "Suresh founder of Lakshmi Chit fund";
    }
}
