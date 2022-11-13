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

     int idUser;
     String name;
     int tongDiem, totalMatch, totalMatchWin, winStreak, HighestWinStreak,totalMatchLose, loseStreak, HighestLoseStreak;
     String status;
     String password;
     String role; //admin or simple users
    
    public UserDTO() {
    }
    

    public UserDTO(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public UserDTO(int idUser, String name, String status, String role) {
        this.name = name;
        this.idUser = idUser;
        this.status = status;
        this.role = role;
    }
    

    public UserDTO(String name,String password, int tongDiem, String status,  String role, int totalMatch,
            int totalMatchWin, int winStreak, int HighestWinStreak,int totalMatchLose , int loseStreak, int HighestLoseStreak) {
        this.name = name;
        this.tongDiem = tongDiem;
        this.status = status;
        this.password = password;
        this.role = role;
        this.totalMatch = totalMatch;
        this.totalMatchWin = totalMatchWin;
        this.winStreak = winStreak;
        this.HighestWinStreak = HighestWinStreak;
        this.loseStreak = loseStreak;
        this.HighestLoseStreak = HighestLoseStreak;
        this.totalMatchLose = totalMatchLose;
    }
    
    public UserDTO(int idUser, String name, String status, String role, int tongDiem, int totalMatch,
            int totalMatchWin, int winStreak, int HighestWinStreak,int totalMatchLose, int loseStreak, int HighestLoseStreak) {
        this.idUser = idUser;
        this.name = name;
        this.tongDiem = tongDiem;
        this.status = status;
        this.role = role;
        this.totalMatch = totalMatch;
        this.totalMatchWin = totalMatchWin;
        this.winStreak = winStreak;
        this.HighestWinStreak = HighestWinStreak;
        this.loseStreak = loseStreak;
        this.HighestLoseStreak = HighestLoseStreak;
        this.totalMatchLose = totalMatchLose;
    }
    
    public UserDTO(int idUser, String name, String password, int tongDiem, String status, String role, int totalMatch,
            int totalMatchWin, int winStreak, int HighestWinStreak,int totalMatchLose , int loseStreak, int HighestLoseStreak) {
        this.idUser = idUser;
        this.name = name;
        this.tongDiem = tongDiem;
        this.status = status;
        this.password = password;
        this.role = role;
        this.totalMatch = totalMatch;
        this.totalMatchWin = totalMatchWin;
        this.winStreak = winStreak;
        this.HighestWinStreak = HighestWinStreak;
        this.loseStreak = loseStreak;
        this.HighestLoseStreak = HighestLoseStreak;
        this.totalMatchLose = totalMatchLose;
    }

    public int getTotalMatchLose() {
        return totalMatchLose;
    }

    public void setTotalMatchLose(int totalMatchLose) {
        this.totalMatchLose = totalMatchLose;
    }

    
    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(int tongDiem) {
        this.tongDiem = tongDiem;
    }

    public int getTotalMatch() {
        return totalMatch;
    }

    public void setTotalMatch(int totalMatch) {
        this.totalMatch = totalMatch;
    }

    public int getTotalMatchWin() {
        return totalMatchWin;
    }

    public void setTotalMatchWin(int totalMatchWin) {
        this.totalMatchWin = totalMatchWin;
    }

    public int getWinStreak() {
        return winStreak;
    }

    public void setWinStreak(int winStreak) {
        this.winStreak = winStreak;
    }

    public int getHighestWinStreak() {
        return HighestWinStreak;
    }

    public void setHighestWinStreak(int HighestWinStreak) {
        this.HighestWinStreak = HighestWinStreak;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getLoseStreak() {
        return loseStreak;
    }

    public void setLoseStreak(int loseStreak) {
        this.loseStreak = loseStreak;
    }

    public int getHighestLoseStreak() {
        return HighestLoseStreak;
    }

    public void setHighestLoseStreak(int HighestLoseStreak) {
        this.HighestLoseStreak = HighestLoseStreak;
    }

    

}
