package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    public static final String URL = "jdbc:mysql://47.100.61.116:3306/mybatis";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    Connection conn = null;

    @Before
    public void before() throws ClassNotFoundException, SQLException {
        //1.加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2. 获得数据库连接
        this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
    }
    @After
    public void after() throws SQLException {
        conn.close();
        System.out.println("connection closed... ...");
    }



}
