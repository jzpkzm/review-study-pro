package com.jizp.service.impl;

import com.jizp.entity.User;
import com.jizp.mapper.UserMapper;
import com.jizp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/9 19:20
 * @Version: 1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
