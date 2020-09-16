package com.jizp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/16 17:06
 * @Version: 1.0
 * @Description:
 */
@Configuration
@MapperScan("com.jizp.mapper") //使用MapperScan批量扫描所有的Mapper接口
//@MapperScans({@MapperScan("com.jizp.mapper"), @MapperScan("com.jizp.mapper")})  加载多个mapper包
public class AppConfig {
}
