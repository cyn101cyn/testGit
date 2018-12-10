package spring.cloud.service;

import com.cloud.domain.User;
import com.cloud.service.IDemoApi;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoProvider implements IDemoApi {
    @Override
    public String test(String test) {
        return "test: " + test;
    }

    @Override
    public User user(@RequestBody User user) {
        if (user == null) {
            user = new User(10, "Joab-Y");
        }
        return user;
    }
}
