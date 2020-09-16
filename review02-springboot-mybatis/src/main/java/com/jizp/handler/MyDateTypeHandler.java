package com.jizp.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @Author: jizongpeng
 * @Date: 2020/9/16 16:21
 * @Version: 1.0
 * @Description:
 */
@MappedJdbcTypes({JdbcType.VARCHAR})
@MappedTypes({Date.class})
public class MyDateTypeHandler extends BaseTypeHandler<Date> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Date date, JdbcType jdbcType) throws SQLException {
        System.out.println("set: " + i);
        preparedStatement.setString(i, String.valueOf(date.getTime()));
    }

    @Override
    public Date getNullableResult(ResultSet resultSet, String s) throws SQLException {
        System.out.println("get columnLabel: " + s);
        return new Date(resultSet.getLong(s));
    }

    @Override
    public Date getNullableResult(ResultSet resultSet, int i) throws SQLException {
        System.out.println("get index: " + i);
        return new Date(resultSet.getLong(i));
    }

    @Override
    public Date getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        System.out.println("get param: " + i);
        return callableStatement.getDate(i);
    }
}
