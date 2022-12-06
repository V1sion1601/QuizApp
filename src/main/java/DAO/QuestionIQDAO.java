/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.QuestionDTO;
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
 * @author admin
 */
public class QuestionIQDAO {
    public static int quantityQuestion = 10;

    public static ArrayList<DTO.QuestionDTO> getListQuestion() {
        ArrayList<DTO.QuestionDTO> QuestionList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM questioniq WHERE Type=?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "IQ");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                DTO.QuestionDTO Question = new DTO.QuestionDTO(
                        rs.getInt("ID_Question"),
                        rs.getString("Content"),
                        rs.getString("Option1"),
                        rs.getString("Option2"),
                        rs.getString("Option3"),
                        rs.getString("Option4"),
                        rs.getString("OptionTrue"),
                        rs.getString("Type")
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
    
    public static ArrayList<DTO.QuestionDTO> getListQuestionByQuantity(int quantityQuestion) {
        ArrayList<DTO.QuestionDTO> QuestionListByQuantity = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM questioniq ORDER BY RAND() LIMIT ? ";
            statement = connection.prepareCall(sql);
            statement.setInt(1, quantityQuestion);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                DTO.QuestionDTO Question = new DTO.QuestionDTO(
                        rs.getInt("ID_Question"),
                        rs.getString("Content"),
                        rs.getString("Option1"),
                        rs.getString("Option2"),
                        rs.getString("Option3"),
                        rs.getString("Option4"),
                        rs.getString("OptionTrue"),
                        rs.getString("Type")
                );
                QuestionListByQuantity.add(Question);

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
        return QuestionListByQuantity;
    }
    
    public static DTO.QuestionDTO getQuestionIQByID(int ID) {
        DTO.QuestionDTO Question = new QuestionDTO();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "SELECT * FROM questioniq WHERE ID_Question = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, ID);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Question = new DTO.QuestionDTO(
                        rs.getInt("ID_Question"),
                        rs.getString("Content"),
                        rs.getString("Option1"),
                        rs.getString("Option2"),
                        rs.getString("Option3"),
                        rs.getString("Option4"),
                        rs.getString("OptionTrue"),
                        rs.getString("Type")
                );
                

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
        return Question;
    }
    
     /* Thêm câu hỏi */
    public static void insert(DTO.QuestionDTO qt) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "INSERT INTO questioniq VALUE(?,?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            statement.setInt(1, qt.getID_Question());
            statement.setString(2, qt.getContent());
            statement.setString(3, qt.getOption1());
            statement.setString(4, qt.getOption2());
            statement.setString(5, qt.getOption3());
            statement.setString(6, qt.getOption4());
            statement.setString(7, qt.getOptionTrue());
            statement.setString(8, qt.getType());
            statement.execute();

        } catch (SQLException ex) {
//            Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);         
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
        JOptionPane.showMessageDialog(null, "Thêm thành công");
    }
    
    /* Sửa câu hỏi */
    public static DTO.QuestionDTO update(DTO.QuestionDTO qt) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "UPDATE questioniq SET Content=?, Option1=?, Option2=?, Option3=?, Option4=?, OptionTrue=?, Type=? WHERE ID_Question = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, qt.getContent());
            statement.setString(2, qt.getOption1());
            statement.setString(3, qt.getOption2());
            statement.setString(4, qt.getOption3());
            statement.setString(5, qt.getOption4());
            statement.setString(6, qt.getOptionTrue());
            statement.setString(7, qt.getType());
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
        JOptionPane.showMessageDialog(null, "Cập nhật thành công");
        return qt;
    }
    
    /* Xoá câu hỏi */
    public static void delete(int ID_Question) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DAO.Connection.connection();
            String sql = "DELETE FROM questioniq WHERE ID_Question=?";
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
