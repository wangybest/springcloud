package com.example.consumer.service;

import com.example.consumer.hystrix.DemoHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "server-producer", fallback = DemoHystrix.class)
public interface DemoService {

    @GetMapping("/home")
    String home();

    @GetMapping("/user")
    String user();

    @GetMapping("/admin")
    String admin();

}
