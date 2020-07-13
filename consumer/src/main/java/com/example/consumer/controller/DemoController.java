package com.example.consumer.controller;

import com.example.consumer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/home")
    public String home() {
        return demoService.home();
    }

    @GetMapping("/user")
    public String user() {
        return demoService.user();
    }

    @GetMapping("/admin")
    public String admin() {
        return demoService.admin();
    }


}
