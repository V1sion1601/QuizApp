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
/**
 *
 * @author ADMIN
 */
public class Connection {
    private final static String JDBC = "com.mysql.cj.jdbc.Driver";
    private final static String DATA = "jdbc:mysql://localhost:3306/ltm";
    
    public static java.sql.Connection connection() {
        java.sql.Connection con = null;
        java.beans.Statement sta = null;
        try {
            Class.forName(JDBC);
            con = DriverManager.getConnection(DATA, "root", "");
        } catch (ClassNotFoundException ex) {
            System.err.println("Không tìm thấy driver. Chi tiết:  " + ex.getMessage());
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return con;
    }

}
