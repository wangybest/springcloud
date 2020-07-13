package com.example.serverproducer.controllerapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello implements HelloApi {

    @GetMapping("/admin")
    @Override
    public String admin() {
        return "admin页面，需要admin权限";
    }

    @GetMapping("/home")
    @Override
    public String home() {
        return "这里是home,不需要权限";
    }

    @GetMapping("/user")
    @Override
    public String user() {
        return "user页面，需要user权限";
    }
}
