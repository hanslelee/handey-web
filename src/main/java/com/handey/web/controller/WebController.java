package com.handey.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("")
    public String home() {
        return "login";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }
}
