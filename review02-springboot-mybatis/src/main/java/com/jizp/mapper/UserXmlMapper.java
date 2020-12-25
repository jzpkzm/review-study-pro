package com.jizp.mapper;

import com.jizp.entity.User;

import java.util.List;
import java.util.Map;

public interface UserXmlMapper {
    List<User> findAll();

    User findUserById(int id);

    List<User> findUserORByName(String name);

    List<User> findUserBySex(List<Integer> sexList);

    List<User> findUserByNameOrSex(Map<String, String> conditionMap);

    int addUser(User user);
}
