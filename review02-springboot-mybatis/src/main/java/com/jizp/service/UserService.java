package com.jizp.service;

import com.jizp.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    //xml
    List<User> xmlFindAll();
    User findUserById(int id);
    int addUser(User user);

    List<User> annotationFindAll();
}
