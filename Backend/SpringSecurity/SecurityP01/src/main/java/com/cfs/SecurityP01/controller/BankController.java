package com.cfs.SecurityP01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    int bal = 1000;
    @GetMapping("/bal")
    public int getBalance() {
        return bal;
    }

    @PostMapping("/add")
    public int updateDetails(@RequestParam String AccNo, @RequestParam int num) {
        return bal + num;
    }

    @GetMapping("/contact")
    private String contactUS() {
        return "you can contact us at: 87487458458";
    }
}
