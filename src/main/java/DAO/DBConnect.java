/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;

/**
 *
 * @author ADMIN
 */
public class DBConnect {

    public static int check = -1;
    private final static String JDBC = "com.mysql.cj.jdbc.Driver";
    public Connection con = null;
    public Connection connection() {
        try {
            Connection con = null;
            String DATA = "jdbc:mysql://localhost:3306/ltm";
            con = DriverManager.getConnection(DATA, "root", "");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
