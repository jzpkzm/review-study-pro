package com.jizp.service;

import com.jizp.entity.User;

import java.util.List;

public interface UserService {
    List<User> xmlFindAll();
    List<User> annotationFindAll();
}
