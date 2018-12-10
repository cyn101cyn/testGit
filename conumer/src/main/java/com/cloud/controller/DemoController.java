package com.cloud.controller;

import com.cloud.domain.User;
import com.cloud.service.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    public DemoFeignService demoFeignService;

    @RequestMapping("/test")
    public String test() {
        return demoFeignService.test("test");
    }

    @RequestMapping("/user")
    public User user() {
        User user = new User();
        user.setAge(10);
        user.setName("Joab-Y");
        return demoFeignService.user(user);
    }
}
