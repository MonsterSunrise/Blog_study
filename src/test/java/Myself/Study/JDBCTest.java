package Myself.Study;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.aspectj.bridge.MessageUtil.fail;

public class JDBCTest {
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testConnection(){
        try(Connection con =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/blog_study?createDatabaseIfNotExit=true&useUnicode=true&characterEncoding=UTF-8&useSSL=true",
                        "root",
                        "tlsdmschd55")) {
            System.out.println(con);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
