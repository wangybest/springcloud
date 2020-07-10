package com.example.serverproducer.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello-----" + name + "------" + new Date();
    }

    @GetMapping
    public String home() {
        return "这里是home";
    }

    @GetMapping("/bye")
    public String bye() {
        return "再见，byebye";
    }
}
