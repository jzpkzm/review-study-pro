package com.jizp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/9 19:23
 * @Version: 1.0
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.jizp.mapper") //使用MapperScan批量扫描所有的Mapper接口
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }
}
