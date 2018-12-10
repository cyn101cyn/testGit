package com.cloud.service.impl;

import com.cloud.domain.User;
import com.cloud.service.DemoFeignService;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceFallback implements DemoFeignService {
    @Override
    public String test(String test) {
        return "error";
    }

    @Override
    public User user(User user) {
        return null;
    }
}
