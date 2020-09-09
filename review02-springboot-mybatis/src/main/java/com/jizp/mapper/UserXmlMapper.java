package com.jizp.mapper;

import com.jizp.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserXmlMapper {
    List<User> findAll();
}
