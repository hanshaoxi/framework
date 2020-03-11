package com.zhanghao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author:zhangHao
 * @CreateDateTime : 2020/3/11  03 11 13:46
 * @Description:数据源
 */
public class DataSource {
    /**数据库连接驱动*/
    private String driverClassName;
    /**数据库连接地址*/
    private String url;
    /**数据库连接用户名*/
    private String username;
    /**数据库连接密码*/
    private String password;

    /**
     *
     * @param driverClassName
     * @param url
     * @param username
     * @param password
     * @return
     */
    public static Connection openConnection(String driverClassName,String url,String username,String password) throws ClassNotFoundException, SQLException {
        //实例化数据库连接驱动
        Class.forName(driverClassName);
        //获取数据库连接
        return DriverManager.getConnection(url,username,password);

    }
}
