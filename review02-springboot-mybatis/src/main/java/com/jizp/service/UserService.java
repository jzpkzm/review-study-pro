package com.jizp.service;

import com.jizp.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    //xml
    List<User> xmlFindAll();

    User findUserById(int id);

    List<User> findUserORByName(String name);

    List<User> findUserByNameOrSex(Map<String, String> conditionMap);

    List<User> findUserBySex(List<Integer> sexList);

    int addUser(User user);

    List<User> annotationFindAll();
}
