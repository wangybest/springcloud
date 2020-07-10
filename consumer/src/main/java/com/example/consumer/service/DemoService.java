package com.example.consumer.service;

import com.example.consumer.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "server-producer", fallback = HelloHystrix.class)
public interface DemoService {

    @GetMapping("hello/{name}")
    String showHello(@PathVariable String name);

    @GetMapping
    String home();

    @GetMapping("/bye")
    String bye();
}
