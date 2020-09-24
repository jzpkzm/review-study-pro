package com.jizp.service.impl;

import com.jizp.entity.Person;
import com.jizp.mapper.PersonXmlMapper;
import com.jizp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/24 19:22
 * @Version: 1.0
 * @Description:
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonXmlMapper personXmlMapper;
    @Override
    public List<Person> findAll() {
        return personXmlMapper.findAll();
    }
}
