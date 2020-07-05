package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo01HelloJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
        String sql = "UPDATE student SET NAME = 'sy' WHERE id = 100441;";
        Statement statement = connection.createStatement();
        int out = statement.executeUpdate(sql);
        System.out.println(out);
        statement.close();
        connection.close();


    }
}
