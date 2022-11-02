/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class UserDAO {

    DBConnect conn;

    public ArrayList<UserDTO> readDB() {
        conn = new DBConnect();
        ArrayList<UserDTO> arrUser = new ArrayList<>();

        try {
            String query = "SELECT * FROM `user`";
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
    
     public Boolean add(UserDTO user){
        conn = new DBConnect();
        Boolean check = conn.SQLUpdate("INSERT INTO `user`(`name`, `tongDiem`, `status`, `password`, `role`) "
                + "VALUES ('"+user.getName()+"','"
                +user.getStatus()+"','"
                +user.getTongDiem()+"','"
                +user.getPassword()+"','"
                +user.getRole()+"')"); 
        conn.closeConnection();
        return check;
    }
     
     public Boolean del(int idUser){
        conn = new DBConnect();
        Boolean check = conn.SQLUpdate("DELETE FROM `user` WHERE `idUser` = " + idUser);
        conn.closeConnection();
        return check;
    }
     
     public Boolean upd(UserDTO user){
        conn= new DBConnect();
        Boolean check = conn.SQLUpdate("UPDATE `user` SET "
                + "`name`='"+user.getName()
                +"',`tongDiem`='"+user.getTongDiem()
                +"',`status`='"+user.getStatus()
                +"',`password`='"+user.getPassword()
                +"',`role`='"+user.getRole()
                +"' WHERE `idUser`='"+user.getIdUser()+"'");
        conn.closeConnection();
        return check;
    }
     
     public Boolean hasUserID(int idUser) {
        conn = new DBConnect();
        boolean result = false;
        try {
            String query = "SELECT * FROM `user` WHERE `idUser`='"+idUser+"'";
            ResultSet rs = conn.SQLQuery(query);
            result = rs.next();
        } catch (SQLException e) {
            System.out.println("User không tồn tại!!!");
            System.err.print(e);
        } finally {
            conn.closeConnection();
        }
        return result;
    }
    
}
