package JDBC;

import JDBC.JDBCUtils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo03Utils {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "SELECT * from student";
            rs = statement.executeQuery(sql);
            while(rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt("age");

                System.out.println(id + "--->name:" + name + " age:" + age);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //JDBCUtils.close(rs, statement, connection);
        }
    }
}
