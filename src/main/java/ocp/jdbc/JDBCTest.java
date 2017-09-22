package ocp.jdbc;

import java.sql.*;

/**
 * Created by dia on 12.9.2017 г..
 */
public class JDBCTest {
    public static void main(String args[]) throws SQLException {
       //use Drivermanager Connection conn = new Connection(url, userName, password);
        String url = "";
        String userName = "";
        String password = "";
        Connection conn = DriverManager.getConnection(url, userName, password);

        Statement stmt = conn.createStatement();
        stmt.setMaxRows(2);///!!!! other
         ResultSet rs = stmt.executeQuery("select count(*) from animal");
         if (rs.next()) System.out.println(rs.getInt(1));


    }
    }
