package com.wlf.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * 访问数据库
 */
public class DBAccess {

    public static Connection getConnection() {
        //加载配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driverClass = bundle.getString("driverClass");
        String username = bundle.getString("username");
        String password = bundle.getString("password");
        String url = bundle.getString("url");

        Connection connection = null;
        try {
            Class.forName(driverClass);
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("数据库连接成功");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到类：" + driverClass);
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("数据库连接失败");
            e.printStackTrace();
        }
        return connection;
    }
}
