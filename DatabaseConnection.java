/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chen1
 */


import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static Connection conn = null;
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //加载数据库连接驱动
            String user = "root";
            String psw = "123456";  //XXX为自己的数据库的密码
            String url = "jdbc:mysql://localhost:3306/jbpm?characterEncoding=utf-8";                   //ZZZ为连接的名字
            conn = DriverManager.getConnection(url, user, psw);  //获取连接
        } catch (Exception e) {
            System.out.println("连接数据库失败");
            e.printStackTrace();
        }
        return conn;
    }

}
