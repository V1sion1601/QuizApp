/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.UserDAO;
import DTO.UserDTO;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class UserBUS {
    private static ArrayList<UserDTO> arrUser = new ArrayList<>();
    private UserDAO userDAO = new UserDAO();
    
    public UserBUS(){
        arrUser = userDAO.readDB();
    }
    
    public void readDB(){
        arrUser = userDAO.readDB();
    }
    
    public Boolean add(UserDTO user){
        Boolean check = userDAO.add(user);
        if(check){
            arrUser.add(user);
        }
        return check;
    }
    
    public Boolean del(int idUser){
        Boolean check = userDAO.del(idUser);
        if(check){
            for(UserDTO user :arrUser){
                if(user.getIdUser() == idUser){
                    arrUser.remove(user);
                    break;
                }
            }
        }
        return check;
    }
    
    public Boolean upd(UserDTO user){
        Boolean check = userDAO.upd(user);
        if(check){
            for(UserDTO upd: arrUser){
                if(upd.getIdUser() == user.getIdUser()){
                    arrUser.set(arrUser.indexOf(upd), user);
                    break;
                }
            }
        }
        return check;
    }
    
    public ArrayList<UserDTO> getArrUser(){
        readDB();
        return arrUser;
    }
    
    public UserDTO tryLogin(String name, String password){
        for(UserDTO userDTO : arrUser){
            if(userDTO.getName().equals(name) && userDTO.getPassword().equals(password)){
                return userDTO;
            }
        }
        return null;
    }
}
