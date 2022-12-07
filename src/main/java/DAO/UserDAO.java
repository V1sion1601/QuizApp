/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.UserDTO;
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
import javax.swing.JOptionPane;

public class UserDAO {

    // Lấy hết danh sách User
    public static ArrayList<DTO.UserDTO> getListUser() {
        ArrayList<DTO.UserDTO> UserList = new ArrayList<>();
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
                        rs.getString("Password"),
                        rs.getInt("TotalScore"),
                        rs.getString("Status"),
                        rs.getString("Role"),
                        rs.getInt("TotalMatch"),
                        rs.getInt("TotalMatchWin"),
                        rs.getInt("WinStreak"),
                        rs.getInt("HighestWinStreak"),
                        rs.getInt("totalMatchLose"),
                        rs.getInt("LoseStreak"),
                        rs.getInt("HighestLoseStreak")
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

    // Lấy hết danh sách User theo Status
    public static ArrayList<DTO.UserDTO> getListUserByStatus(String Status) {
        ArrayList<DTO.UserDTO> UserList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user WHERE Status=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, Status);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                DTO.UserDTO user1 = new DTO.UserDTO(
                        rs.getInt("ID_User"),
                        rs.getString("Name"),
                        rs.getString("Password"),
                        rs.getInt("TotalScore"),
                        rs.getString("Status"),
                        rs.getString("Role"),
                        rs.getInt("TotalMatch"),
                        rs.getInt("TotalMatchWin"),
                        rs.getInt("WinStreak"),
                        rs.getInt("HighestWinStreak"),
                        rs.getInt("totalMatchLose"),
                        rs.getInt("LoseStreak"),
                        rs.getInt("HighestLoseStreak")
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

    public static void UpdateStatus(String Name, String Status) {
        Connection connection = null;
        PreparedStatement statement = null;
        System.out.println(Status);
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE user SET Status = ? WHERE Name = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, Status);
            statement.setString(2, Name);

            statement.executeQuery();
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
        JOptionPane.showMessageDialog(null, "Status Updated");
    }

    // Lấy hết danh sách User theo Point
    public static ArrayList<DTO.UserDTO> getListUserByPoint() {
        ArrayList<DTO.UserDTO> UserList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user ORDER BY TotalScore DESC";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                DTO.UserDTO user1 = new DTO.UserDTO(
                        rs.getInt("ID_User"),
                        rs.getString("Name"),
                        rs.getString("Password"),
                        rs.getInt("TotalScore"),
                        rs.getString("Status"),
                        rs.getString("Role"),
                        rs.getInt("TotalMatch"),
                        rs.getInt("TotalMatchWin"),
                        rs.getInt("WinStreak"),
                        rs.getInt("HighestWinStreak"),
                        rs.getInt("totalMatchLose"),
                        rs.getInt("LoseStreak"),
                        rs.getInt("HighestLoseStreak")
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

    // Lấy hết danh sách User theo TotalMatchWin
    public static ArrayList<DTO.UserDTO> getListUserByTotalMatchWin() {
        ArrayList<DTO.UserDTO> UserList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user ORDER BY TotalMatchWin DESC";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                DTO.UserDTO user1 = new DTO.UserDTO(
                        rs.getInt("ID_User"),
                        rs.getString("Name"),
                        rs.getString("Password"),
                        rs.getInt("TotalScore"),
                        rs.getString("Status"),
                        rs.getString("Role"),
                        rs.getInt("TotalMatch"),
                        rs.getInt("TotalMatchWin"),
                        rs.getInt("WinStreak"),
                        rs.getInt("HighestWinStreak"),
                        rs.getInt("totalMatchLose"),
                        rs.getInt("LoseStreak"),
                        rs.getInt("HighestLoseStreak")
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

    // Lấy hết danh sách User theo WinStreak
    public static ArrayList<DTO.UserDTO> getListUserByWinStreak() {
        ArrayList<DTO.UserDTO> UserList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user ORDER BY WinStreak DESC";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                DTO.UserDTO user1 = new DTO.UserDTO(
                        rs.getInt("ID_User"),
                        rs.getString("Name"),
                        rs.getString("Password"),
                        rs.getInt("TotalScore"),
                        rs.getString("Status"),
                        rs.getString("Role"),
                        rs.getInt("TotalMatch"),
                        rs.getInt("TotalMatchWin"),
                        rs.getInt("WinStreak"),
                        rs.getInt("HighestWinStreak"),
                        rs.getInt("totalMatchLose"),
                        rs.getInt("LoseStreak"),
                        rs.getInt("HighestLoseStreak")
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

    // Lấy hết danh sách User theo TotalMatch
    public static ArrayList<DTO.UserDTO> getListUserByTotalMatch() {
        ArrayList<DTO.UserDTO> UserList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user ORDER BY TotalMatch DESC";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                DTO.UserDTO user1 = new DTO.UserDTO(
                        rs.getInt("ID_User"),
                        rs.getString("Name"),
                        rs.getString("Password"),
                        rs.getInt("TotalScore"),
                        rs.getString("Status"),
                        rs.getString("Role"),
                        rs.getInt("TotalMatch"),
                        rs.getInt("TotalMatchWin"),
                        rs.getInt("WinStreak"),
                        rs.getInt("HighestWinStreak"),
                        rs.getInt("totalMatchLose"),
                        rs.getInt("LoseStreak"),
                        rs.getInt("HighestLoseStreak")
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

    //get User Online
    public static ArrayList<DTO.UserDTO> getListUserOnline(String status) {
        System.out.println("Status: " + status);
        String sql = "";

        ArrayList<DTO.UserDTO> UserList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            if (status.equals("All")) {
                sql = "SELECT * FROM user ";
                statement = connection.prepareStatement(sql);
            } else {
                sql = "SELECT * FROM user Where Status=?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, status);
            }
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                DTO.UserDTO user1 = new DTO.UserDTO(
                        rs.getInt("ID_User"),
                        rs.getString("Name"),
                        rs.getString("Status"),
                        rs.getString("Role"),
                        rs.getInt("TotalScore"),
                        rs.getInt("TotalMatch"),
                        rs.getInt("TotalMatchWin"),
                        rs.getInt("HighestWinStreak")
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
    public static UserDTO findtaikhoan(DTO.UserDTO user) {
        Connection connection = null;
        PreparedStatement statement = null;
        UserDTO user1 = new UserDTO();
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user WHERE Name=? AND Password=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, user.getName());
            statement.setString(2, user.getPassword());
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                user1 = new UserDTO();
                user1.setName(rs.getString("Name"));
                user1.setPassword(rs.getString("Password"));
                user1.setRole(rs.getString("Role"));
                user1.setStatus(rs.getString("Status"));
                GUI.user.ManHinhDangNhap.checktk = 1;
            } else {
                GUI.user.ManHinhDangNhap.checktk = 0;
            }
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user1;
    }

    /* Kiểm tra username để đăng kí */
    public static boolean checkUserName(String username) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user WHERE Name=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                BUS.UserBUS.checktk = 0;
                return false;
            } else {
                BUS.UserBUS.checktk = 1;
                return true;
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
        return false;
    }

    /* Thêm tài khoản */
    public static void insert(DTO.UserDTO user) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "Insert into user value(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1, user.getIdUser());
            statement.setString(2, user.getName());
            statement.setString(3, user.getPassword());
            statement.setInt(4, user.getTongDiem());
            statement.setString(5, user.getStatus());
            statement.setString(6, user.getRole());
            statement.setInt(7, user.getTotalMatch());
            statement.setInt(8, user.getTotalMatchWin());
            statement.setInt(9, user.getWinStreak());
            statement.setInt(10, user.getHighestWinStreak());
            statement.setInt(11, user.getTotalMatchLose());
            statement.setInt(12, user.getLoseStreak());
            statement.setInt(13, user.getHighestLoseStreak());
            statement.setString(14, user.getEmail());

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
        JOptionPane.showMessageDialog(null, "Đăng kí thành công");
    }

    // Lấy ra 1 user trong bảng
    public static DTO.UserDTO getUserByName(String Name) {
        DTO.UserDTO user = new UserDTO();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                user = new DTO.UserDTO(
                        rs.getInt("ID_User"),
                        rs.getString("Name"),
                        rs.getString("Password"),
                        rs.getInt("TotalScore"),
                        rs.getString("Status"),
                        rs.getString("Role"),
                        rs.getInt("TotalMatch"),
                        rs.getInt("TotalMatchWin"),
                        rs.getInt("WinStreak"),
                        rs.getInt("HighestWinStreak"),
                        rs.getInt("totalMatchLose"),
                        rs.getInt("LoseStreak"),
                        rs.getInt("HighestLoseStreak")
                );
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
        return user;
    }

    // Update tổng trận
    public static void UpdateToTalMatch(DTO.UserDTO user) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE user SET TotalMatch = ? WHERE Name = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, user.getTotalMatch() + 1);
            statement.setString(2, user.getName());

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

    // Update tổng trận thắng
    public static void UpdateTotalMatchWin(DTO.UserDTO user) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE user SET TotalMatchWin = ? WHERE Name = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, user.getTotalMatchWin() + 1);
            statement.setString(2, user.getName());

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

    // Update người chơi   
    public static void Update(DTO.UserDTO user) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE user SET Name = ?, Status = ?, Role = ? WHERE ID_User = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, user.getName());
            statement.setString(2, user.getStatus());
            statement.setString(3, user.getRole());
            statement.setInt(4, user.getIdUser());

            statement.execute();
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

    // Update chuỗi thắng
    public static void UpdateWinStreak(DTO.UserDTO user) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE user SET WinStreak = ? WHERE Name = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, user.getWinStreak() + 1);
            statement.setString(2, user.getName());

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

    // Save chuỗi thắng cao nhất
    public static void UpdateHighestWinStreak(DTO.UserDTO user) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE user SET HighestWinStreak = ? WHERE Name = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, user.getHighestWinStreak());
            statement.setString(2, user.getName());

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

    // Update chuỗi thua
    public static void UpdateLoseStreak(DTO.UserDTO user) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE user SET WinStreak = ? WHERE Name = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, user.getWinStreak() + 1);
            statement.setString(2, user.getName());

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

    // Save chuỗi thua cao nhất
    public static void UpdateHighestLoseStreak(DTO.UserDTO user) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE user SET HighestWinStreak = ? WHERE Name = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, user.getHighestWinStreak());
            statement.setString(2, user.getName());

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

    // Update điểm
    public static void UpdateScore(DTO.UserDTO user, int diem) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE user SET TotalScore = ? WHERE Name = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, user.getTongDiem() + diem);
            statement.setString(2, user.getName());

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

    // Update Role
    public static void UpdateRole(DTO.UserDTO user, int role) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE user SET Role = ? WHERE Name = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, role);
            statement.setString(2, user.getName());

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

    // Khoá tài khoản
//    public static void blockandunblokUser(String Name, int Status) {
//
//        Connection connection = null;
//        PreparedStatement statement = null;
//        try {
//            connection = DAO.Connection.connection();
//            String sql = "UPDATE user SET Role = ? WHERE Name = ?";
//            statement = connection.prepareCall(sql);
//
//            statement.setInt(1, Status);
//            statement.setString(2, Name);
//
//            statement.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//        }
//    }
    // Update Status tài khoản
    public static void updateOnOffline(String Name, String Status) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE user SET Status = ? WHERE Name = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, Status);
            statement.setString(2, Name);

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

    // Xoá tài khoản
    public static boolean delete(int ID_User) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "DELETE FROM user WHERE ID_User=?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, ID_User);

            statement.execute();
            
        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO.QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO.QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return true;
    }
    
    public static boolean CheckEmailUsed(String email) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM user WHERE Email=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, email);

            ResultSet rs = statement.executeQuery();
            int count=0;
            while (rs.next()) {
            count++;
            }
            if(count == 0) return true;
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO.QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO.QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return false;
    }
}
