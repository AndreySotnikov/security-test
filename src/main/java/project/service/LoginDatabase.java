package project.service;

import org.springframework.stereotype.Service;

import java.sql.*;

/**
 * Created by andrey on 23.03.15.
 */
@Service
public class LoginDatabase {
    Connection c = null;
    Statement stmt = null;
    ResultSet res = null;

    public boolean connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/pmsaccounts","root", "123456789");
            stmt = c.createStatement();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean insertData(String username, String password) {

        String sql = "INSERT INTO users(username,password,enabled)" +
                "VALUES ('" + username + "','" + password + "', TRUE);";
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            return false;
        }

        sql = "INSERT INTO user_roles (username, ROLE)" +
                "VALUES ('"+username+"', 'ROLE_USER');";

        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            return false;
        }

        return true;
    }

    public void closeDB() {
        try {
            c.close();
            stmt.close();
           // res.close();
        } catch (SQLException e) {
            return;
        }
    }
}

