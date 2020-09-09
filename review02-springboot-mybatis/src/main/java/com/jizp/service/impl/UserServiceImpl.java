package com.jizp.service.impl;

import com.jizp.entity.User;
import com.jizp.mapper.UserAnnotationMapper;
import com.jizp.mapper.UserXmlMapper;
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

    private final UserXmlMapper userXmlMapper;

    private final UserAnnotationMapper userAnnotationMapper;

    public UserServiceImpl(UserXmlMapper userXmlMapper, UserAnnotationMapper userAnnotationMapper) {
        this.userXmlMapper = userXmlMapper;
        this.userAnnotationMapper = userAnnotationMapper;
    }

    @Override
    public List<User> xmlFindAll() {
        return userXmlMapper.findAll();
    }

    @Override
    public List<User> annotationFindAll() {
        return userAnnotationMapper.findAll();
    }


}
