package com.cts.srcmed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/welcome")
    public String Home() {
        return "welcome";
    }
    
    @GetMapping("/prescription")
    public String prescription() {
        return "upload-precription";
    }
}
