package com.example.consumer.hystrix;

import com.example.consumer.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class HelloHystrix implements DemoService {
    @Override
    public String showHello(String name) {
        return "服务异常，熔断请求";
    }

    @Override
    public String home() {
        return "服务异常，熔断请求";
    }

    @Override
    public String bye() {
        return "服务异常，熔断请求";
    }
}
