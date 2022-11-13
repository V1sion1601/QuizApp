/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UserBUS {
    public static int checktk;
    public static GUI.ManHinhChonCheDoChoi ManHinhChonCheDoChoi = new GUI.ManHinhChonCheDoChoi();
    public static GUI.ManHinhDangNhap ManHinhDangNhap = new GUI.ManHinhDangNhap();
    public static GUI.ManHinhQuanLyCauHoi ManHinhQuanLyCauHoi = new GUI.ManHinhQuanLyCauHoi();
    public static DTO.UserDTO user;
    public static DTO.UserDTO usersavelogin;

    
    public static void findtaikhoan(String a, String b) {      
        user = new DTO.UserDTO(a, b);
        user = DAO.UserDAO.findtaikhoan(user);
        if (GUI.ManHinhDangNhap.checktk == 1) {
            if(user.getRole().toLowerCase().equals("admin") && !user.getStatus().toLowerCase().equals("block"))
            {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công với quyền Admin");
                usersavelogin = user;
                UserBUS.BlockUser(usersavelogin.getName(), "Online");
                ManHinhQuanLyCauHoi.setVisible(true);
                ManHinhQuanLyCauHoi.setLocationRelativeTo(null);
                ManHinhDangNhap.setVisible(false);
            }
            else if(user.getRole().toLowerCase().equals("user") && !user.getStatus().toLowerCase().equals("block"))
            {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                usersavelogin = user;
                UserBUS.BlockUser(usersavelogin.getName(), "Online");
                ManHinhQuanLyCauHoi.setVisible(true);
                ManHinhQuanLyCauHoi.setLocationRelativeTo(null);  
                ManHinhDangNhap.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Tài khoản của bạn đã bị khoá");
                GUI.ManHinhDangNhap.checktk=0;
            } 
//            {
//                JOptionPane.showMessageDialog(null, "Tài khoản của bạn đã bị khoá");
//                GUI.ManHinhDangNhap.checktk=0;
//            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Tài khoản/Mật khẩu không đúng");
        }

    }
    
    public static void winRate(String username){
        DTO.UserDTO userRate = new UserDTO();
        userRate = DAO.UserDAO.getUserByName(username);
        float winrate = user.getTotalMatchWin() % user.getTotalMatch();
        float loserate = user.getTotalMatchLose()% user.getTotalMatch();
    }
    
    public static void BlockUser(String username, String Status){
        DAO.UserDAO.updateOnOffline(username, Status);
    }
    
    public static void showInfoUser(DTO.UserDTO user)
    {
        GUI.ManHinhCapNhatNguoiChoi frame = new GUI.ManHinhCapNhatNguoiChoi();
            frame.setVisible(true);
            
            frame.labelMaNguoiChoiCSDL.setText(String.valueOf(user.getIdUser()));
            frame.textFieldTenNguoiChoi.setText(user.getName());
            frame.labelTinhTrangTuCSDL.setText(user.getStatus());
            if (user.getRole().toLowerCase().equals("admin")) {
                frame.comboBoxQuyenHan.addItem("admin");
                frame.comboBoxQuyenHan.setSelectedItem("admin");
            } else {
                frame.comboBoxQuyenHan.addItem("admin");
            }
            if (user.getRole().toLowerCase().equals("user")) {
                frame.comboBoxQuyenHan.addItem("user");
                frame.comboBoxQuyenHan.setSelectedItem("user");
            } else {
                frame.comboBoxQuyenHan.addItem("user");
            }
    }

    public static ArrayList showUserByID() {
        ArrayList<DTO.UserDTO> UserList = DAO.UserDAO.getListUser();
        System.out.println(UserList);
        GUI.ManHinhQuanLyNguoiChoi.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.ManHinhQuanLyNguoiChoi.model.addRow(new Object[]{
                User.getIdUser(),
                User.getName(), 
                User.getStatus(),
                User.getRole(),
                User.getTongDiem(),
                User.getTotalMatch(), 
                User.getTotalMatchWin(), 
                User.getWinStreak()});
        });
        return UserList;
    }
    
    public static ArrayList showUserByStatus() {
        ArrayList<DTO.UserDTO> UserList = DAO.UserDAO.getListUserByStatus(GUI.ManHinhQuanLyNguoiChoi.comboBoxTieuChiSapXep.getSelectedItem().toString());
        System.out.println(UserList);
        GUI.ManHinhQuanLyNguoiChoi.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.ManHinhQuanLyNguoiChoi.model.addRow(new Object[]{
                User.getIdUser(),
                User.getName(), 
                User.getStatus(),
                User.getRole(),
                User.getTongDiem(),
                User.getTotalMatch(), 
                User.getTotalMatchWin(), 
                User.getWinStreak()});
        });
        return UserList;
    }
    
    public static ArrayList showUserByPoint() {
        ArrayList<DTO.UserDTO> UserList = DAO.UserDAO.getListUserByPoint();
        System.out.println(UserList);
        GUI.ManHinhBangXepHang.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.ManHinhBangXepHang.model.addRow(new Object[]{
                User.getName(), 
                User.getTongDiem(),
                User.getTotalMatch(), 
                User.getTotalMatchWin(), 
                User.getWinStreak()});
        });
        return UserList;
    }
    
     public static ArrayList showUserByTotalMatchWin() {
        ArrayList<DTO.UserDTO> UserList = DAO.UserDAO.getListUserByTotalMatchWin();
        System.out.println(UserList);
        GUI.ManHinhBangXepHang.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.ManHinhBangXepHang.model.addRow(new Object[]{
                User.getName(), 
                User.getTongDiem(),
                User.getTotalMatch(), 
                User.getTotalMatchWin(), 
                User.getWinStreak()});
        });
        return UserList;
    }
    
    public static ArrayList showUserByTotalMatch() {
        ArrayList<DTO.UserDTO> UserList = DAO.UserDAO.getListUserByTotalMatch();
        System.out.println(UserList);
        GUI.ManHinhBangXepHang.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.ManHinhBangXepHang.model.addRow(new Object[]{
                User.getName(), 
                User.getTongDiem(),
                User.getTotalMatch(), 
                User.getTotalMatchWin(), 
                User.getWinStreak()});
        });
        return UserList;
    }
    
    public static ArrayList showUserByWinStreak() {
        ArrayList<DTO.UserDTO> UserList = DAO.UserDAO.getListUserByWinStreak();
        System.out.println(UserList);
        GUI.ManHinhBangXepHang.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.ManHinhBangXepHang.model.addRow(new Object[]{
                User.getName(), 
                User.getTongDiem(),
                User.getTotalMatch(), 
                User.getTotalMatchWin(), 
                User.getWinStreak()});
        });
        return UserList;
    }

    public static void insert1() {
        DAO.UserDAO.checkUserName(GUI.ManHinhDangKy.textFieldTenNguoiChoi.getText());
        if(checktk==1){
            if (GUI.ManHinhDangKy.textFieldTenNguoiChoi.getText().equals("") ||
            GUI.ManHinhDangKy.passwordFieldMatKhau.getPassword().equals("") ||
            GUI.ManHinhDangKy.passwordFieldXacNhanMatKhau.getPassword().equals("")
                ) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            DTO.UserDTO user = new DTO.UserDTO(
                    GUI.ManHinhDangKy.textFieldTenNguoiChoi.getText(),
                    DAO.MD5.MD5(String.valueOf(GUI.ManHinhDangKy.passwordFieldMatKhau.getPassword())),
                    0,
                    "Offline",    
                    "user",
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
            );
            if (user != null) {
                DAO.UserDAO.insert(user);
            } else {
                JOptionPane.showMessageDialog(null, "Đăng kí thất bại");
            }
        }
        }else
        {
            JOptionPane.showMessageDialog(null, "Tên người chơi đã tồn tại");
        }
    }

    public static DTO.UserDTO update1() {
        DTO.UserDTO user = new DTO.UserDTO();
        if (GUI.ManHinhCapNhatNguoiChoi.textFieldTenNguoiChoi.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            user = new DTO.UserDTO(
                    Integer.parseInt(GUI.ManHinhCapNhatNguoiChoi.labelMaNguoiChoiCSDL.getText()),
                    GUI.ManHinhCapNhatNguoiChoi.textFieldTenNguoiChoi.getText(),
                    GUI.ManHinhCapNhatNguoiChoi.labelTinhTrangTuCSDL.getText(),
                    GUI.ManHinhCapNhatNguoiChoi.comboBoxQuyenHan.getSelectedItem().toString()
            );
            if (user != null) {
                DAO.UserDAO.Update(user);
                showUserByID();
                return user;
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }
        return null;
    }

      public static void delete1() {
        int selectedRow = GUI.ManHinhQuanLyNguoiChoi.tableDanhSachNguoiChoi.getSelectedRow();
        if (selectedRow >= 0) {
            ArrayList<DTO.UserDTO> userList = DAO.UserDAO.getListUser();
            //lấy dữ liệu của câu hỏi cần xoá ra 1 obj
            DTO.UserDTO user = userList.get(selectedRow);
            DAO.UserDAO.delete(user.getIdUser());
            showUserByID();
        }
        selectedRow = -1;
    }
}
