package com.jizp.service.impl;

import com.jizp.entity.User;
import com.jizp.mapper.UserAnnotationMapper;
import com.jizp.mapper.UserXmlMapper;
import com.jizp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
    public User findUserById(int id) {
        return userXmlMapper.findUserById(id);
    }

    @Override
    public List<User> findUserORByName(String name) {
        return userXmlMapper.findUserORByName(name);
    }

    @Override
    public List<User> findUserByNameOrSex(Map<String, String> conditionMap) {
        return userXmlMapper.findUserByNameOrSex(conditionMap);
    }

    @Override
    public List<User> findUserBySex(List<Integer> sexList) {
        return userXmlMapper.findUserBySex(sexList);
    }

    @Override
    public List<User> annotationFindAll() {
        return userAnnotationMapper.findAll();
    }

    @Override
    public int addUser(User user) {
        return userXmlMapper.addUser(user);
    }


}
