/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.QuestionDTO;
import DTO.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class QuestionDAO {
    DBConnect conn;
    
    public ArrayList<QuestionDTO> readDB() {
        conn = new DBConnect();
        ArrayList<UserDTO> arrQuestion = new ArrayList<>();

        try {
            String query = "SELECT * FROM `question`";
            ResultSet rs = conn.SQLQuery(query);
            if (rs != null) {
                while (rs.next()) {
                    int idUser = rs.getInt("idUser");
                    String name = rs.getString("name");
                    int tongDiem = rs.getInt("tongDiem");
                    String status = rs.getString("status");
                    String password = rs.getString("password");
                    String role = rs.getString("role");
                    
                    arrUser.add(new UserDTO(idUser, name, tongDiem, status, password, role));
                }
            }
        } catch(SQLException e)  {
            System.out.println("Lỗi!!! Lỗi đọc dữ liệu bảng User");
        }finally{
            conn.closeConnection();
        }
        return arrUser;
    }
}
