package JDBC.Druid;

import JDBC.JDBCUtils.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo02Utils {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn =  DruidUtils.getConnection();
            String sql = "insert into student value(?, ?, ?, ?, null, null)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 100442);
            pstmt.setString(2, "nihao");
            pstmt.setInt(3, 24);
            pstmt.setInt(4, 85);
            int count = pstmt.executeUpdate();

            System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DruidUtils.close(pstmt, conn);
        }
    }
}
