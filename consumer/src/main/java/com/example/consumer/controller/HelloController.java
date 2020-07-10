package com.example.consumer.controller;

import com.example.consumer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    DemoService demoService;

    @GetMapping("hello/{name}")
    public String hello(@PathVariable String name) {
        return demoService.showHello(name);
    }

    @GetMapping
    public String home() {
        return demoService.home();
    }

    @GetMapping("/bye")
    public String bye() {
        return demoService.bye();
    }
}
