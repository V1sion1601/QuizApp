/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import GUI.admin.*;
import GUI.user.*;
import DTO.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.IOException;

public class UserBUS  {

    public static int checktk;
    public static GUI.user.ManHinhChonCheDoChoi ManHinhChonCheDoChoi = new GUI.user.ManHinhChonCheDoChoi();
    public static GUI.user.ManHinhDangNhap ManHinhDangNhap = new GUI.user.ManHinhDangNhap();
    public static GUI.admin.ManHinhChonCheDoQuanLyAdmin ManHinhChonCheDoQuanLyAdmin = new GUI.admin.ManHinhChonCheDoQuanLyAdmin();
    public static DTO.UserDTO user;
    public static DTO.UserDTO usersavelogin;

    public static void findtaikhoan (String a, String b) {
        user = new DTO.UserDTO(a, b);
        user = DAO.UserDAO.findtaikhoan(user);
        if (GUI.user.ManHinhDangNhap.checktk == 1) {
            if (user.getRole().toLowerCase().equals("admin") && !user.getStatus().toLowerCase().equals("block")) {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công với quyền Admin");
                usersavelogin = user;
                UserBUS.BlockUser(usersavelogin.getName(), "Online");
                ManHinhChonCheDoQuanLyAdmin.setVisible(true);
                ManHinhChonCheDoQuanLyAdmin.setLocationRelativeTo(null);
                ManHinhDangNhap.setVisible(false);
            } else if (user.getRole().toLowerCase().equals("user") && !user.getStatus().toLowerCase().equals("block")) {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                usersavelogin = user;
                UserBUS.BlockUser(usersavelogin.getName(), "Online");
                ManHinhChonCheDoChoi.setVisible(true);
                ManHinhChonCheDoChoi.setLocationRelativeTo(null);
                ManHinhDangNhap.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Tài khoản của bạn đã bị khoá");
                GUI.user.ManHinhDangNhap.checktk = 0;
            }
//            {
//                JOptionPane.showMessageDialog(null, "Tài khoản của bạn đã bị khoá");
//                GUI.ManHinhDangNhap.checktk=0;
//            }

        } else {
            JOptionPane.showMessageDialog(null, "Tài khoản/Mật khẩu không đúng");
        }

    }

    public static void winRate(String username) {
        DTO.UserDTO userRate = new UserDTO();
        userRate = DAO.UserDAO.getUserByName(username);
        float winrate = user.getTotalMatchWin() % user.getTotalMatch();
        float loserate = user.getTotalMatchLose() % user.getTotalMatch();
    }

    public static void BlockUser(String username, String Status) {
        DAO.UserDAO.updateOnOffline(username, Status);
    }

    public static void showInfoUser(DTO.UserDTO user) {
        GUI.admin.ManHinhCapNhatNguoiChoi frame = new GUI.admin.ManHinhCapNhatNguoiChoi();
        frame.setVisible(true);

        frame.labelMaNguoiChoiTuCSDL.setText(String.valueOf(user.getIdUser()));
        frame.textFieldTenNguoiChoi.setText(user.getName());
        frame.labelTinhTrangTuCSDL.setText(user.getStatus());
        if (user.getRole().toLowerCase().equals("Nam")) {
            frame.comboBoxGioiTinh.addItem("Nam");
            frame.comboBoxGioiTinh.setSelectedItem("Nam");
        } else {
            frame.comboBoxGioiTinh.addItem("Nam");
        }
        if (user.getRole().toLowerCase().equals("Nữ")) {
            frame.comboBoxGioiTinh.addItem("Nữ");
            frame.comboBoxGioiTinh.setSelectedItem("Nữ");
        } else {
            frame.comboBoxGioiTinh.addItem("Nữ");
        }
    }

    public static ArrayList showUserByID() {
        ArrayList<DTO.UserDTO> UserList = DAO.UserDAO.getListUser();
        System.out.println(UserList);
        GUI.admin.ManHinhQuanLyNguoiChoi.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.admin.ManHinhQuanLyNguoiChoi.model.addRow(new Object[]{
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

//    public static ArrayList showUserByStatus() {
//        ArrayList<DTO.UserDTO> UserList = DAO.UserDAO.getListUserByStatus(GUI.admin.ManHinhQuanLyNguoiChoi.comboBoxTieuChiSapXep.getSelectedItem().toString());
//        System.out.println(UserList);
//        GUI.admin.ManHinhQuanLyNguoiChoi.model.setRowCount(0);
//        UserList.forEach(User -> {
//            GUI.admin.ManHinhQuanLyNguoiChoi.model.addRow(new Object[]{
//                User.getIdUser(),
//                User.getName(),
//                User.getStatus(),
//                User.getRole(),
//                User.getTongDiem(),
//                User.getTotalMatch(),
//                User.getTotalMatchWin(),
//                User.getWinStreak()});
//        });
//        return UserList;
//    }

    public static ArrayList showUserByPoint() {
        ArrayList<DTO.UserDTO> UserList = DAO.UserDAO.getListUserByPoint();
        System.out.println(UserList);
        GUI.user.ManHinhBangXepHang.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.user.ManHinhBangXepHang.model.addRow(new Object[]{
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
        GUI.user.ManHinhBangXepHang.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.user.ManHinhBangXepHang.model.addRow(new Object[]{
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
        GUI.user.ManHinhBangXepHang.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.user.ManHinhBangXepHang.model.addRow(new Object[]{
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
        GUI.user.ManHinhBangXepHang.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.user.ManHinhBangXepHang.model.addRow(new Object[]{
                User.getName(),
                User.getTongDiem(),
                User.getTotalMatch(),
                User.getTotalMatchWin(),
                User.getWinStreak()});
        });
        return UserList;
    }

    
    public static ArrayList showUserOnline(String status) {
        ArrayList<DTO.UserDTO> UserList = DAO.UserDAO.getListUserOnline(status);
        System.out.println(UserList);
        GUI.admin.ManHinhQuanLyNguoiChoi.model.setRowCount(0);
        UserList.forEach(User -> {
            GUI.admin.ManHinhQuanLyNguoiChoi.model.addRow(new Object[]{
                User.getIdUser(),
                User.getName(),
                User.getStatus(),
                User.getRole(),
                User.getTongDiem(),
                User.getTotalMatch(),
                User.getTotalMatchWin(),
                User.getHighestWinStreak()});
        });
        return UserList;
    }
    
    public static void insert1() {
        DAO.UserDAO.checkUserName(GUI.user.ManHinhDangKy.textFieldTenNguoiChoi.getText());
        if (checktk == 1) {
            if (GUI.user.ManHinhDangKy.textFieldTenNguoiChoi.getText().equals("")
                    || GUI.user.ManHinhDangKy.passwordFieldMatKhau.getPassword().equals("")
                    || GUI.user.ManHinhDangKy.passwordFieldXacNhanMatKhau.getPassword().equals("")) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
            } else {
                DTO.UserDTO user = new DTO.UserDTO(
                        GUI.user.ManHinhDangKy.textFieldTenNguoiChoi.getText(),
                        DAO.MD5.MD5(String.valueOf(GUI.user.ManHinhDangKy.passwordFieldMatKhau.getPassword())),
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
        } else {
            JOptionPane.showMessageDialog(null, "Tên người chơi đã tồn tại");
        }
    }

    public static DTO.UserDTO update1() {
        DTO.UserDTO user = new DTO.UserDTO();
        if (GUI.admin.ManHinhCapNhatNguoiChoi.textFieldTenNguoiChoi.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            user = new DTO.UserDTO(
                    Integer.parseInt(GUI.admin.ManHinhCapNhatNguoiChoi.labelMaNguoiChoiTuCSDL.getText()),
                    GUI.admin.ManHinhCapNhatNguoiChoi.textFieldTenNguoiChoi.getText(),
                    GUI.admin.ManHinhCapNhatNguoiChoi.labelTinhTrangTuCSDL.getText(),
                    GUI.admin.ManHinhCapNhatNguoiChoi.comboBoxGioiTinh.getSelectedItem().toString()
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
        int selectedRow = GUI.admin.ManHinhQuanLyNguoiChoi.tableDanhSachNguoiChoi.getSelectedRow();
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
