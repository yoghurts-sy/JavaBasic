package JDBC.JDBCTemplate;

import JDBC.JDBCUtils.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo01HelloJDBCTemplate {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());
        String sql = "update student set score = ? where id = ?";
        int count = template.update(sql, 666, 100442);
        System.out.println(count);
    }
}
