package JDBC;

import JDBC.JDBCUtils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo04pstmt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("«Î ‰»Îid£∫");
        String id = sc.next();
        System.out.println("«Î ‰»Îname£∫");
        String name = sc.next();
        boolean flag = new Demo04pstmt().login(id, name);
        if (flag) {
            System.out.println("µ«¬º≥…π¶£°");
        } else {
            System.out.println("µ«¬º ß∞‹£°");
        }
        sc.close();
    }

    public boolean login(String id, String name) {
        if (id == null || name == null) {
            return false;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from student where id = ? and name = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.valueOf(id));
            pstmt.setString(2, name);
            rs =  pstmt.executeQuery();
            return rs.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(rs, pstmt, conn);
        }
        return false;
    }
}
