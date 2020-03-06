package com.wlf;

import com.wlf.util.DBAccess;

import java.sql.Connection;

public class ShellRun {

    public static void main(String[] args) {
        //连接数据库
        Connection connection = DBAccess.getConnection();
        //查询元数据
        //使用模板
        //生成文件
    }
}
