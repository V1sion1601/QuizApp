/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class DBConnect {

    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    private String DBName = null;
    private String username = null;
    private String password = null;

    private final String ipAddress = "localhost:3306";

    public static String dbUrl = "jdbc:mysql://hostname:3306/laptrinhmang";

    public DBConnect() {
        if (checkDriver() == true) {
            this.DBName = "LTM";
            this.username = "root";
            this.password = null;
            getConnection();
        }
    }

    public DBConnect(String DBName) {
        if (checkDriver() == true) {
            this.DBName = "databaseName";
            getConnection();
        }
    }

    private boolean checkDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return true;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Lỗi!!! Không tìm thấy MySql Driver.");
            System.err.print(e);
            return false;
        }
    }

    public void getConnection() {
        try {
            String username = "root";
            String password = null;
            conn = DriverManager.getConnection(dbUrl);
            Connection conn = DriverManager.getConnection(dbUrl);
            stmt = conn.createStatement();
            System.out.println("connect successfully!");
        } catch (SQLException e) {
            System.out.println("Lỗi!!! Không thể kết nối tới " + DBName);
            System.err.println(e);
        }
    }

    private boolean checkConnection() {
        if (conn == null || stmt == null) {
            System.out.println("Lỗi!!! Chưa thiết lập kết nối tới " + DBName + ". Vui lòng đăng nhập để thiết lập kết nối!");
            return false;
        } else {
            return true;
        }
    }

    public ResultSet SQLQuery(String query) {
        if (checkConnection()) {
            try {
                rs = stmt.executeQuery(query);
                System.out.println(query + " truy vấn thành công!");
                return rs;
            } catch (SQLException e) {
                System.out.println("Lỗi!!! Không thể truy vấn dữ liệu");
                return null;
            }
        } else {
            return null;
        }
    }

    public boolean SQLUpdate(String update) {
        try {
            stmt.executeUpdate(update);
            System.out.println(update + " cập nhật thành công!");
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            System.out.println("Lỗi!!! Không thể cập nhật dữ liệu");
            return false;
        }
    }

    public void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            System.out.println("Đã ngắt kết nối tới Database.");
        } catch (SQLException e) {
            System.out.println("Lỗi!!! Không thể đóng kết nối tới " + DBName);
        }
    }
}
