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
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class QuestionSetDAO {
    public static ArrayList<DTO.QuestionSetDTO> getListQuestionSet() {
        ArrayList<DTO.QuestionSetDTO> QuestionSetList = new ArrayList<>();

        java.sql.Connection connection = null;
        Statement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM questionset";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                DTO.QuestionSetDTO QuestionSet = new DTO.QuestionSetDTO(
                        rs.getInt("ID_QuestionSet"), 
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
    
    public static ArrayList<DTO.QuestionDTO> getAllQuestion(int ID_1) { // co ton tai mang
        java.sql.Connection connection = null;
        PreparedStatement statement = null;
        ArrayList<DTO.QuestionDTO> arr = new ArrayList<>();
            try {
                connection = DAO.Connection.connection();
                String sql = " select * from question where ID_QuestionSet=?;";
                statement = connection.prepareCall(sql);
                statement.setInt(1, ID_1);
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    DTO.QuestionDTO question = new DTO.QuestionDTO();
                    question.setContent(rs.getString("Content"));
                    question.setOption1(rs.getString("Option1"));
                    question.setOption2(rs.getString("Option2"));
                    question.setOption3(rs.getString("Option3"));
                    question.setOption4(rs.getString("Option4"));
                    question.setOptionTrue(rs.getString("OptionTrue"));
                    arr.add(question);
                };
                    
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return arr;
    }

    
    public static DTO.QuestionSetDTO getQuestionSet(int ID) {

        java.sql.Connection connection = null;
        PreparedStatement statement = null;
        DTO.QuestionSetDTO newQuestionSet = new DTO.QuestionSetDTO();
        try {
            
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM questionset WHERE ID_QuestionSet=?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, ID);
            System.out.println("hello");
            System.out.println(statement);
            ResultSet rs = statement.executeQuery();
            
             while (rs.next()) {
                    newQuestionSet.setID_QuestionSet(rs.getInt("ID_QuestionSet"));
                    newQuestionSet.setPoint(rs.getInt("Point"));
                    newQuestionSet.setTime(rs.getInt("Time"));
                    newQuestionSet.setQuestionArrayList(getAllQuestion(rs.getInt("ID_QuestionSet")));
                }
             
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
        System.out.println(newQuestionSet.getQuestionArrayList().get(0).getContent());
        return newQuestionSet;
    }
    
}
