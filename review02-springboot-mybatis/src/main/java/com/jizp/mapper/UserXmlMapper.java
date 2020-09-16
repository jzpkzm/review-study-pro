package com.jizp.mapper;

import com.jizp.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserXmlMapper {
    List<User> findAll();

    User findUserById(int id);

    int addUser(User user);
}
