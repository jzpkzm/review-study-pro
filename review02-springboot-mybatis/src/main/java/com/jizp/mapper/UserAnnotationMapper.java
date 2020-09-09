package com.jizp.mapper;

import com.jizp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserAnnotationMapper {

    @Select("select * from user")
    List<User> findAll();
}
