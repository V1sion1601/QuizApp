/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author admin
 */
public class UserDTO {
    private int idUser;
    private String name;
    private int tongDiem;
    private String status;
    private String password;
    private String role; //admin or simple user

    public UserDTO(){
        
    }

    public UserDTO(int idUser, String name, int tongDiem, String status, String password, String role) {
        this.idUser = idUser;
        this.name = name;
        this.tongDiem = tongDiem;
        this.status = status;
        this.password = password;
        this.role = role;
    }
    
    
    
    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tongDiem
     */
    public int getTongDiem() {
        return tongDiem;
    }

    /**
     * @param tongDiem the tongDiem to set
     */
    public void setTongDiem(int tongDiem) {
        this.tongDiem = tongDiem;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    
}
