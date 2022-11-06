/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class QuestionSetDAO {
    public static List<DTO.QuestionSetDTO> getListQuestionSet() {
        List<DTO.QuestionSetDTO> QuestionSetList = new ArrayList<>();

        java.sql.Connection connection = null;
        Statement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM questionset";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                DTO.QuestionSetDTO QuestionSet = new DTO.QuestionSetDTO(
                        rs.getInt("ID_Question"), 
                        rs.getInt("Time"), 
                        rs.getInt("Point")           
                );
                QuestionSetList.add(QuestionSet);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.QuestionSetDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO.QuestionSetDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAO.QuestionSetDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return QuestionSetList;
    }
    /* Sửa bộ câu hỏi */
    public static void update(DTO.QuestionSetDTO qss) {

        java.sql.Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE questionset SET Point=?,Time=? WHERE ID_QuestionSet=?";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, qss.getPoint().toString());
            statement.setString(2, qss.getTime().toString());

            statement.execute();
        } catch (SQLException ex) {
//            Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, "Cơ sở dữ liệu bảng lớp không hợp lệ hoặc không tồn tại mã lớp này, vui lòng kiểm tra lại");
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QuestionSetDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QuestionSetDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }
    /* Thêm bộ câu hỏi */
    public static void insert(DTO.QuestionSetDTO qss) {

        java.sql.Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "INSERT INTO questionset VALUE(?,?,?)";
            statement = connection.prepareCall(sql);

            statement.setInt(1, qss.getID_QuestionSet());
            statement.setInt(2, qss.getPoint());
            statement.setInt(3, qss.getTime());

            statement.execute();
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QuestionSetDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QuestionSetDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }
    /* Xoá bộ câu hỏi */
    public static void delete(int ID_QuestionSet) {

        java.sql.Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "DELETE FROM questionset WHERE ID_QuestionSET=?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, ID_QuestionSet);

            statement.execute();
        } catch (SQLException ex) {
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QuestionSetDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QuestionSetDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }
}
