package com.controller;

import com.dao.UserMapper;
import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyong on 16-10-19.
 */
@RestController
public class HomeController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public String home() {
        return "hello,springboot...";
    }

    @RequestMapping("/user")
    public User userinfo() {
        User user = userMapper.getUser("admin");

        return user;
    }
}
