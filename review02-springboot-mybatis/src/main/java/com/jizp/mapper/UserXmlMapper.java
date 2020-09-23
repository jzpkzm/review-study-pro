package com.jizp.mapper;

import com.jizp.entity.User;

import java.util.List;

public interface UserXmlMapper {
    List<User> findAll();

    User findUserById(int id);

    int addUser(User user);
}
