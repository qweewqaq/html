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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmployeeOperation {
    private static  EmployeeOperation instance = null;
    
    public static EmployeeOperation getInstance() { //返回EmployeeOperation类实例的静态方法,单例模式！！！！
        if (instance == null) {
            instance = new EmployeeOperation();
        }    
        return instance;
    }
    
    public boolean saveEmployee(String a) {   //向数据库中加入数据
        boolean result = false;
        Connection conn = null;
        try {
            
        conn = DatabaseConnection.getCon();  //建立数据库连接
        String sqlInset = "insert into jbpm.table(ka) values(?)";
        PreparedStatement stmt = conn.prepareStatement(sqlInset);   //会抛出异常
        
        stmt.setString(1, a);         //设置SQL语句第一个“？”的值
             //设置SQL语句第四个“？”的值
        int i = stmt.executeUpdate();            //执行插入数据操作，返回影响的行数
        if (i == 1) {
            result = true;
        }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally { //finally的用处是不管程序是否出现异常，都要执行finally语句，所以在此处关闭连接
            try {
                conn.close(); //打开一个Connection连接后，最后一定要调用它的close（）方法关闭连接，以释放系统资源及数据库资源
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        
        return result;
        
    }
    
    
    public List<String> selectEmployee() {       //从数据库中查询所需数据
        List<String> empList = new ArrayList<String>();
        Connection conn = null;
        try {
            conn = DatabaseConnection.getCon();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from jbpm.table ");//执行SQL并返回结果集
            while (rs.next()) {
                
                empList.add(rs.getString("ka"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();                                         //关闭连接
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return empList;                                             //返回结果
    }
    
    
    public boolean updateEmployee(String emp) { //根据员工的编号更改员工的年龄信息
        boolean result = false;
        Connection conn = null;
        try {
            conn = DatabaseConnection.getCon();
            String sql = "update jbpm.table set ka=? where id=?";  //update语句
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, emp);                //设置SQL语句第一个"?"的参数值
                              //设置SQL语句第二个"?"的参数值    
            int flag = stmt.executeUpdate();                //执行修改操作，返回影响的行数
            if (flag == 1) {                                //修改成功返回true
                result = true;
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return result;
    }
    
    public boolean deleteEmployeeById(String a) {
        boolean result = false;
        Connection conn = null;
        try {
            conn = DatabaseConnection.getCon();
            String sql = "delete from jbpm.table where a = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, a);
            int i = stmt.executeUpdate();
            if (i == 1) {
                result = true;
            } 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return result;
    }

}
