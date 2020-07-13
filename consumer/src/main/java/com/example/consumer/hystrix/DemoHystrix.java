package com.example.consumer.hystrix;

import com.example.consumer.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoHystrix implements DemoService {


    @Override
    public String home() {
        return "home熔断触发";
    }

    @Override
    public String user() {
        return "user熔断触发";
    }

    @Override
    public String admin() {
        return "admin熔断触发";
    }
}
