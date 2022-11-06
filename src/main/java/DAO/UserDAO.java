/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO {
    public static List<DTO.UserDTO> getListUser() {
        List<DTO.UserDTO> UserList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                DTO.UserDTO user1 = new DTO.UserDTO(
                        rs.getInt("ID_User"),
                        rs.getString("Name"),
                        rs.getInt("TotalScore"),
                        rs.getString("Status"),
                        rs.getString("Password"),
                        rs.getString("Role")
                );
                UserList.add(user1);
            }
        } catch (SQLException ex) {

        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return UserList;
    }
    /* Tìm tài khoản */
    public static void findtaikhoan(DTO.UserDTO user) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user WHERE Name=? AND Password=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, user.getName());
            statement.setString(2, user.getPassword());
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                GUI.ManHinhChaoMung.checktk = 1;
            } else {
                GUI.ManHinhChaoMung.checktk = 0;
            }
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /* Kiểm tra username để đăng kí */
    public static void checkUserName(String username) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user WHERE Name=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                BUS.UserBUS.check = 0;
            } else {
                BUS.UserBUS.check = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }
    /* Thêm tài khoản */
    public static void insert(DTO.UserDTO user) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "Insert into user value(?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);

            statement.setInt(1, user.getIdUser());
            statement.setString(2, user.getName());
            statement.setInt(3, user.getTongDiem());
            statement.setString(4, user.getStatus());
            statement.setString(5, user.getPassword());
            statement.setString(6, user.getRole());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }
}
