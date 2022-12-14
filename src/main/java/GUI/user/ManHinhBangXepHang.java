package GUI.user;

import DTO.UserDTO;
import static GUI.user.ManHinhDangNhap.socket;
import ServerConfig.DataTransfer;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ManHinhBangXepHang extends javax.swing.JFrame {

    public static DefaultTableModel model;
    public static int selectedRow = -1;
    public static int dapAn = 0;
    public static DTO.UserDTO user = new DTO.UserDTO();

    public static void showinfo() {
        try {
            DataTransfer transfer = new DataTransfer();
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));

            Thread sendThread = new Thread(() -> {
                System.out.println("Send thread total matches all");
                transfer.setSend(socket, out, "total," + ManHinhDangNhap.nameClient);
                transfer.send.run();
            });
            Thread receiveThread = new Thread(() -> {
                ObjectInputStream inObject = null;
                try {
                    System.out.println("Receive thread questions");
                    inObject = new ObjectInputStream(ManHinhDangNhap.socket.getInputStream());
                    transfer.setReceiveUser(socket, inObject);
                    transfer.receiveUser.run();
                } catch (IOException ex) {
                    Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            sendThread.start();
            receiveThread.start();
            sendThread.join();
            receiveThread.join();
            ArrayList<UserDTO> totalMatches = transfer.receiveUser.listUsers;
            GUI.user.ManHinhBangXepHang.model.setRowCount(0);
            totalMatches.forEach(User -> {
                GUI.user.ManHinhBangXepHang.model.addRow(new Object[]{
                    User.getName(),
                    User.getTongDiem(),
                    User.getTotalMatch(),
                    User.getTotalMatchWin(),
                    User.getWinStreak()});
            });
        } catch (InterruptedException ex) {
            Logger.getLogger(ManHinhBangXepHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhBangXepHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showInfoByTotalMatchWin() {
        try {
            DataTransfer transfer = new DataTransfer();
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));

            Thread sendThread = new Thread(() -> {
                System.out.println("Send thread total matches win");
                transfer.setSend(socket, out, "listWin," + ManHinhDangNhap.nameClient);
                transfer.send.run();
            });
            Thread receiveThread = new Thread(() -> {
                ObjectInputStream inObject = null;
                try {
                    System.out.println("Receive thread questions");
                    inObject = new ObjectInputStream(ManHinhDangNhap.socket.getInputStream());
                    transfer.setReceiveUser(socket, inObject);
                    transfer.receiveUser.run();
                } catch (IOException ex) {
                    Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            sendThread.start();
            receiveThread.start();
            sendThread.join();
            receiveThread.join();
            ArrayList<UserDTO> totalWinMatches = transfer.receiveUser.listUsers;
            System.out.println("Total win matches length: " + totalWinMatches.size());
            GUI.user.ManHinhBangXepHang.model.setRowCount(0);
            totalWinMatches.forEach(User -> {
                GUI.user.ManHinhBangXepHang.model.addRow(new Object[]{
                    User.getName(),
                    User.getTongDiem(),
                    User.getTotalMatch(),
                    User.getTotalMatchWin(),
                    User.getWinStreak()});
            });
        } catch (InterruptedException ex) {
            Logger.getLogger(ManHinhBangXepHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhBangXepHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showinfoByWinStreak() {
        try {
            DataTransfer transfer = new DataTransfer();
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));

            Thread sendThread = new Thread(() -> {
                System.out.println("Send thread total matches win");
                transfer.setSend(socket, out, "streak," + ManHinhDangNhap.nameClient);
                transfer.send.run();
            });
            Thread receiveThread = new Thread(() -> {
                ObjectInputStream inObject = null;
                try {
                    System.out.println("Receive thread strak");
                    inObject = new ObjectInputStream(ManHinhDangNhap.socket.getInputStream());
                    transfer.setReceiveUser(socket, inObject);
                    transfer.receiveUser.run();
                } catch (IOException ex) {
                    Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            sendThread.start();
            receiveThread.start();
            sendThread.join();
            receiveThread.join();
            ArrayList<UserDTO> totalStreaks = transfer.receiveUser.listUsers;
            System.out.println("Total win matches length: " + totalStreaks.size());
            GUI.user.ManHinhBangXepHang.model.setRowCount(0);
            totalStreaks.forEach(User -> {
                GUI.user.ManHinhBangXepHang.model.addRow(new Object[]{
                    User.getName(),
                    User.getTongDiem(),
                    User.getTotalMatch(),
                    User.getTotalMatchWin(),
                    User.getWinStreak()});
            });
        } catch (InterruptedException ex) {
            Logger.getLogger(ManHinhBangXepHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhBangXepHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ManHinhBangXepHang() {
        initComponents();
        cacChinhSuaGiaoDienBangCode();

        model = (DefaultTableModel) tableBangXepHang.getModel();
        tableBangXepHang.setModel(model);
        showinfo();
//        tableBangXepHang.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                selectedRow = tableBangXepHang.getSelectedRow();
//                if (selectedRow > -1) {
//                    ArrayList<DTO.UserDTO> userList = BUS.UserBUS.showUserByTotalMatch();
//                    user = userList.get(selectedRow);
//                }
//
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });
    }

    private void cacChinhSuaGiaoDienBangCode() {
        // Chỉnh sửa về bảng danh sách người dùng
        JLabel headerLabel = (JLabel) tableBangXepHang.getTableHeader().getDefaultRenderer();
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        tableBangXepHang.getTableHeader().setPreferredSize(new Dimension(50, 50));
        tableBangXepHang.getTableHeader().setFont(new Font("Segoe UI", 18, 18));
        tableBangXepHang.getTableHeader().setBackground(Color.gray);
        tableBangXepHang.setBackground(new Color(255, 255, 255));
        tableBangXepHang.setFillsViewportHeight(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelManHinhBangXepHang = new javax.swing.JPanel();
        labelBangXepHangNguoiChoi = new javax.swing.JLabel();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        scrollPaneBangXepHang = new javax.swing.JScrollPane();
        tableBangXepHang = new javax.swing.JTable();
        labelSapXepTheo = new javax.swing.JLabel();
        comboBoxTieuChiSapXep = new javax.swing.JComboBox<>();
        labelButtonTroVe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHinhBangXepHang.setBackground(new java.awt.Color(255, 255, 255));

        labelBangXepHangNguoiChoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelBangXepHangNguoiChoi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelBangXepHangNguoiChoi.setText("BẢNG XẾP HẠNG NGƯỜI CHƠI");

        labelTranhTai.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelTranhTai.setText("TRANH TÀI");

        labelKienThuc.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelKienThuc.setText("KIẾN THỨC");

        labelButtonKetThuc.setBackground(new java.awt.Color(255, 0, 51));
        labelButtonKetThuc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelButtonKetThuc.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonKetThuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonKetThuc.setText("x");
        labelButtonKetThuc.setToolTipText("Thoát");
        labelButtonKetThuc.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelButtonKetThuc.setOpaque(true);
        labelButtonKetThuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelButtonKetThucMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonKetThucMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonKetThucMouseExited(evt);
            }
        });

        labelBanQuyenThuocVe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelBanQuyenThuocVe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBanQuyenThuocVe.setText("Bản quyền thuộc về Trường Đại học Sài Gòn - 2022");

        tableBangXepHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableBangXepHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên người chơi", "Tổng điểm", "Số lần chơi", "Số lần thắng", "Chuỗi thắng dài nhất"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableBangXepHang.setRowHeight(50);
        scrollPaneBangXepHang.setViewportView(tableBangXepHang);

        labelSapXepTheo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSapXepTheo.setText("Sắp xếp theo :");

        comboBoxTieuChiSapXep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxTieuChiSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Số lần chơi", "Số lần thắng", "Chuỗi thắng dài nhất" }));
        comboBoxTieuChiSapXep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxTieuChiSapXepMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboBoxTieuChiSapXepMousePressed(evt);
            }
        });
        comboBoxTieuChiSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTieuChiSapXepActionPerformed(evt);
            }
        });
        comboBoxTieuChiSapXep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboBoxTieuChiSapXepKeyPressed(evt);
            }
        });

        labelButtonTroVe.setBackground(new java.awt.Color(204, 204, 204));
        labelButtonTroVe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelButtonTroVe.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonTroVe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonTroVe.setText("<---");
        labelButtonTroVe.setToolTipText("Trở về");
        labelButtonTroVe.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelButtonTroVe.setOpaque(true);
        labelButtonTroVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelButtonTroVeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonTroVeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonTroVeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelManHinhBangXepHangLayout = new javax.swing.GroupLayout(panelManHinhBangXepHang);
        panelManHinhBangXepHang.setLayout(panelManHinhBangXepHangLayout);
        panelManHinhBangXepHangLayout.setHorizontalGroup(
            panelManHinhBangXepHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(panelManHinhBangXepHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManHinhBangXepHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneBangXepHang)
                    .addGroup(panelManHinhBangXepHangLayout.createSequentialGroup()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelButtonTroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManHinhBangXepHangLayout.createSequentialGroup()
                        .addComponent(labelSapXepTheo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxTieuChiSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelBangXepHangNguoiChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelManHinhBangXepHangLayout.setVerticalGroup(
            panelManHinhBangXepHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhBangXepHangLayout.createSequentialGroup()
                .addGroup(panelManHinhBangXepHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTranhTai)
                    .addComponent(labelKienThuc)
                    .addComponent(labelButtonTroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhBangXepHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelBangXepHangNguoiChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelManHinhBangXepHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelSapXepTheo)
                        .addComponent(comboBoxTieuChiSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneBangXepHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(labelBanQuyenThuocVe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhBangXepHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhBangXepHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelButtonKetThucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonKetThucMouseClicked
        try {
            int decision = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất không");
            if (decision == JOptionPane.YES_OPTION) {
                DataTransfer transfer = new DataTransfer();
                BufferedWriter testOut = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
                transfer.setSend(ManHinhDangNhap.socket, testOut, "bye");
                transfer.send.run();
            }
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ManHinhDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelButtonKetThucMouseClicked

    private void labelButtonKetThucMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonKetThucMouseEntered
        labelButtonKetThuc.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_labelButtonKetThucMouseEntered

    private void labelButtonKetThucMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonKetThucMouseExited
        labelButtonKetThuc.setBackground(new Color(255, 0, 51));
    }//GEN-LAST:event_labelButtonKetThucMouseExited

    private void comboBoxTieuChiSapXepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxTieuChiSapXepMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_comboBoxTieuChiSapXepMouseClicked

    private void comboBoxTieuChiSapXepMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxTieuChiSapXepMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_comboBoxTieuChiSapXepMousePressed

    private void comboBoxTieuChiSapXepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxTieuChiSapXepKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_comboBoxTieuChiSapXepKeyPressed

    private void comboBoxTieuChiSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTieuChiSapXepActionPerformed
//         TODO add your handling code here:
        System.out.println("Test action performed");
        if (comboBoxTieuChiSapXep.getSelectedItem().equals("Số lần thắng")) {
            showInfoByTotalMatchWin();
        }
        if (comboBoxTieuChiSapXep.getSelectedItem().equals("Số lần chơi")) {
            showinfo();
        }
        if (comboBoxTieuChiSapXep.getSelectedItem().equals("Chuỗi thắng dài nhất")) {
            showinfoByWinStreak();
        }
    }//GEN-LAST:event_comboBoxTieuChiSapXepActionPerformed

    private void labelButtonTroVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTroVeMouseClicked
        try {
            // TODO add your handling code here:
            this.dispose();
            new ManHinhChonCheDoChoi().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhBangXepHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelButtonTroVeMouseClicked

    private void labelButtonTroVeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTroVeMouseEntered
        labelButtonTroVe.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_labelButtonTroVeMouseEntered

    private void labelButtonTroVeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTroVeMouseExited
        labelButtonTroVe.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_labelButtonTroVeMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManHinhBangXepHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhBangXepHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhBangXepHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhBangXepHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhBangXepHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> comboBoxTieuChiSapXep;
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelBangXepHangNguoiChoi;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelButtonTroVe;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelSapXepTheo;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhBangXepHang;
    private javax.swing.JScrollPane scrollPaneBangXepHang;
    public static javax.swing.JTable tableBangXepHang;
    // End of variables declaration//GEN-END:variables
}
