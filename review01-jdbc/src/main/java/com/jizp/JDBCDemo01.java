package com.jizp;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/9 16:45
 * @Version: 1.0
 * @Description:
 */
public class JDBCDemo01 {

    @Test
    public void test01() {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            //1、加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2、获取链接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&serverTimezone=UTC", "root", "");

            //3、获取预处理，查询
            //3.1 无参数
            String sql_param = "select * from user where id = ?";
            ps = connection.prepareStatement(sql_param);
            ps.setInt(1, 1);

            //3.2 有参数
//            String sql_no_param = "select * from user";
//            ps = connection.prepareStatement(sql_no_param);

            //4、执行
            rs = ps.executeQuery();

            //5、遍历结果集
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id + "::" + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放资源
            if (Objects.nonNull(rs)) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if (Objects.nonNull(ps)) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if (Objects.nonNull(connection)) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
