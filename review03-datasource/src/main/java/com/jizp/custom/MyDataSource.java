package com.jizp.custom;

import com.mysql.cj.jdbc.Driver;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.lang.module.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/27 16:56
 * @Version: 1.0
 * @Description: 自定义数据库连接池--数据源
 */
public class MyDataSource implements DataSource {
    private LinkedList<Connection> dataSources = new LinkedList<>();

    //初始化连接数量
    public MyDataSource() {
        //一次性创建10个连接
        for (int i = 0; i < 10; i++) {
            try {
                //1.装载mysql驱动对象
                DriverManager.deregisterDriver(new Driver());
                //2、获取链接
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&serverTimezone=UTC", "root", "");
                dataSources.add(connection);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        //删除第一个连接并返回
        return dataSources.removeFirst();
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    public void releaseConnection(Connection connection) {
        dataSources.add(connection);
    }
}
