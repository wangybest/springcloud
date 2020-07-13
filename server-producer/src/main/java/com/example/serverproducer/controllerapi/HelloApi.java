package com.example.serverproducer.controllerapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface HelloApi {

    @GetMapping("/home")
    String home();

    @GetMapping("/user")
    String user();

    @GetMapping("/admin")
    String admin();
}
