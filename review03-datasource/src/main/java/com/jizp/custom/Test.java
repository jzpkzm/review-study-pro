package com.jizp.custom;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/27 17:06
 * @Version: 1.0
 * @Description:
 */
public class Test {
    //查询所有用户
    @org.junit.Test
    public void FindAllUsers() throws SQLException {
        //1、使用连接池建立数据库连接
        MyDataSource dataSource = new MyDataSource();
        Connection conn =dataSource.getConnection();
        //2、创建状态
        Statement state = conn.createStatement();
        //3、查询数据库并返回结果
        ResultSet result =state.executeQuery("select * from user");
        //4、输出查询结果
        while(result.next()){
            System.out.println(result.getString("name"));
        }
        //5、断开数据库连接
        result.close();
        state.close();
        //6、归还数据库连接给连接池
        dataSource.releaseConnection(conn);
    }
}
