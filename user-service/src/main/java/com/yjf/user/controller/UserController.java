package com.yjf.user.controller;

import com.yjf.user.mapper.UserMapper;
import com.yjf.user.pojo.User;
import com.yjf.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("{id}")
    public User queryById(@PathVariable Long id) {
        User user = userService.queryById(id);
        return user;
    }

}
