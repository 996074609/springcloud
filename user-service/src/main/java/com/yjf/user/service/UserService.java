package com.yjf.user.service;

import com.yjf.user.mapper.UserMapper;
import com.yjf.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
