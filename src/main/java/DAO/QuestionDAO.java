/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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

/**
 *
 * @author ADMIN
 */
public class QuestionDAO {
    public static List<DTO.QuestionDTO> getListQuestion() {
        List<DTO.QuestionDTO> QuestionList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM question";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                DTO.QuestionDTO Question = new DTO.QuestionDTO(
                        rs.getInt("ID_Question"), 
                        rs.getString("Content"), 
                        rs.getString("Option1"),
                        rs.getString("Option2"),
                        rs.getString("Option3"),
                        rs.getString("Option4"),
                        rs.getString("OptionTrue"),
                        rs.getInt("ID_QuestionSet")
                );
                QuestionList.add(Question);

            }
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
        return QuestionList;
    }
    
    /* Thêm câu hỏi */
    public static void insert(DTO.QuestionDTO qt) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "INSERT INTO question VALUE(?,?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);

            statement.setInt(1, qt.getID_Question());
            statement.setString(2, qt.getContent());
            statement.setString(3, qt.getOption1());
            statement.setString(4, qt.getOption2());
            statement.setString(5, qt.getOption3());
            statement.setString(6, qt.getOption4());
            statement.setString(7, qt.getOptionTrue());
            statement.setInt(8, qt.getID_QuestionSet());

            statement.execute();
        } catch (SQLException ex) {
//            Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, "Không tìm thấy lớp hoặc giáo viên này trong cơ sở dữ liệu, vui lòng kiểm tra lại !");
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

    }
    /* Sửa câu hỏi */
    public static void update(DTO.QuestionDTO qt) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE question SET Content=?, Option1=?, Option2=?, Option3=?, Option4=?, OptionTrue=?, ID_QuestionSet=? WHERE ID_Question = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, qt.getContent());
            statement.setString(2, qt.getOption1());
            statement.setString(3, qt.getOption2());
            statement.setString(4, qt.getOption3());
            statement.setString(5, qt.getOption4());
            statement.setString(6, qt.getOptionTrue());
            statement.setInt(7, qt.getID_QuestionSet());
            statement.setInt(8, qt.getID_Question());

            statement.execute();
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

    }
    /* Xoá câu hỏi */
    public static void delete(int ID_Question) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "DELETE FROM question WHERE ID_Question=?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, ID_Question);

            statement.execute();
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

    }
}
