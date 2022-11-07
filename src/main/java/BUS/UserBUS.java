/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UserBUS {

    public static int check = 0;
    public static GUI.ManHinhChonCheDoChoi ManHinhChonCheDoChoi = new GUI.ManHinhChonCheDoChoi();
    public static GUI.ManHinhChaoMung ManHinhChaoMung = new GUI.ManHinhChaoMung();

    public static void findtaikhoan(String a, String b) {

        DTO.UserDTO user = new DTO.UserDTO(a, b);
        DAO.UserDAO.findtaikhoan(user);
        if (GUI.ManHinhChaoMung.checktk == 1) {

            JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
            ManHinhChonCheDoChoi.setVisible(true);
            ManHinhChonCheDoChoi.setLocationRelativeTo(null);

//            
        } else {
            JOptionPane.showMessageDialog(null, "Tài khoản/Mật khẩu không đúng");
        }

    }

    public static List showUser() {
        List<DTO.UserDTO> UserList = DAO.UserDAO.getListUser();
        System.out.println(UserList);
        GUI.ManHinhQuanLyNguoiDung.model2.setRowCount(0);
        UserList.forEach(User -> {
            GUI.ManHinhQuanLyNguoiDung.model2.addRow(new Object[]{User.getIdUser(),
                User.getName(), User.getPassword(), User.getTongDiem(),User.getStatus(),
                User.getRole(), User.getTotalMatch(), User.getTotalMatchWin(), User.getWinStreak()});
        });
        return UserList;
    }

    public static void insert1() {
        if (GUI.UserInsert.tf_idUser.setText("").equals("") || GUI.UserInsert.tf_name.setText("").equals("")
                || GUI.UserInsert.tf_tongdiem.setText("").equals("") || GUI.UserInsert.tf_status.setText("").equals("")
                || GUI.UserInsert.tf_password.setText("").equals("") || GUI.UserInsert.tf_role.setText("").equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            DTO.UserDTO user = new DTO.UserDTO(
                    GUI.UserInsert.tf_idUser.setText(""),
                    GUI.UserInsert.tf_name.setText(""),
                    GUI.UserInsert.tf_tongdiem.setText(""),
                    GUI.UserInsert.tf_status.setText(""),
                    GUI.UserInsert.tf_password.setText(""),
                    GUI.UserInsert.tf_role.setText(""),
                    0,
                    0,
                    0
            );
            if (user != null) {
                DAO.UserDAO.insert(user);
                showUser();
                GUI.UserInsert.tf_idUser.setText("");
                GUI.UserInsert.tf_name.setText("");
                GUI.UserInsert.tf_tongdiem.setText("");
                GUI.UserInsert.tf_status.setText("");
                GUI.UserInsert.tf_password.setText("");
                GUI.UserInsert.tf_role.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }

    }

    public static void update1() {
        if (GUI.UserUpdate.tf_idUser.setText("").equals("") || GUI.UserUpdate.tf_name.setText("").equals("")
                || GUI.UserUpdate.tf_tongdiem.setText("").equals("") || GUI.UserUpdate.tf_status.setText("").equals("")
                || GUI.UserUpdate.tf_password.setText("").equals("") || GUI.UserUpdate.tf_role.setText("").equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            DTO.UserDTO user = new DTO.UserDTO(
                    GUI.UserUpdate.tf_idUser.setText(""),
                    GUI.UserUpdate.tf_name.setText(""),
                    GUI.UserUpdate.tf_tongdiem.setText(""),
                    GUI.UserUpdate.tf_status.setText(""),
                    GUI.UserUpdate.tf_password.setText(""),
                    GUI.UserUpdate.tf_role.setText(""),
            );
            if (user != null) {
                DAO.UserDAO.update(user);
                showUser();
                GUI.UserUpdate.tf_idUser.setText("");
                GUI.UserUpdate.tf_name.setText("");
                GUI.UserUpdate.tf_tongdiem.setText("");
                GUI.UserUpdate.tf_status.setText("");
                GUI.UserUpdate.tf_password.setText("");
                GUI.UserUpdate.tf_role.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
        }

    }

//    public static void delete() {
//
//        int selectedRow = GUI.UserGUI.table.getSelectedRow();
//        if (selectedRow >= 0) {
//            List<DTO.UserDTO> UserList = DAO.UserDAO.getListUser();
//            //lấy dữ liệu của câu hỏi cần xoá ra 1 obj
//            DTO.UserDTO user = UserList.get(selectedRow);
//            int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa câu hỏi này không ?");
//
//            if (option == 0) {
//                DAO.UserDAO.delete(user.getIdUser());
//                showUser();
//                GUI.UserGUI.tf_idquestion.setText("");
//                GUI.UserGUI.tf_content.setText("");
//                GUI.UserGUI.tf_Option1.setText("");
//                GUI.UserGUI.tf_Option2.setText("");
//                GUI.UserGUI.tf_Option3.setText("");
//                GUI.UserGUI.tf_Option4.setText("");
//                GUI.UserGUI.tf_Optiontrue.setText("");
//                GUI.UserGUI.tf_ID_questionset.setText("");
//            }
//
//        }
//        selectedRow = -1;
//    }
}
