package JDBC.JDBCUtils;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    /*文件的读取，只需要读取一次即可拿到这些值，使用静态代码块*/
    static {
        Properties pro = new Properties();
        ClassLoader classLoader = JDBCUtils.class.getClassLoader();
        URL resource = classLoader.getResource("jdbc.properties");
        String path = resource.getPath();
        try {
            pro.load(new FileReader(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Class.forName(pro.getProperty("driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        url = pro.getProperty("url");
        user = pro.getProperty("user");
        password = pro.getProperty("password");
        driver = pro.getProperty("driver");
    }

    /**
     * 获取连接
     * @return 连接对象
     */
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭流
     * @param pstmt
     * @param conn
     */
    public static void close(PreparedStatement pstmt, Connection conn) {
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    /**
     * 关闭流
     * @param rs
     * @param pstmt
     * @param conn
     */
    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
