package GUI.user;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ManHinhDangKy extends javax.swing.JFrame {

    public static int dapAn = 0;

    public ManHinhDangKy() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelManHinhQuanLyNguoiDung = new javax.swing.JPanel();
        labelDangKyNguoiChoiMoi = new javax.swing.JLabel();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        labelXacNhanMatKhau = new javax.swing.JLabel();
        buttonDangKy = new javax.swing.JButton();
        textFieldTenNguoiChoi = new javax.swing.JTextField();
        labelTenNguoiChoi = new javax.swing.JLabel();
        passwordFieldXacNhanMatKhau = new javax.swing.JPasswordField();
        labelMatKhau = new javax.swing.JLabel();
        passwordFieldMatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHinhQuanLyNguoiDung.setBackground(new java.awt.Color(255, 255, 255));

        labelDangKyNguoiChoiMoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDangKyNguoiChoiMoi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDangKyNguoiChoiMoi.setText("ĐĂNG KÝ NGƯỜI CHƠI MỚI");

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

        labelXacNhanMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelXacNhanMatKhau.setText("Xác nhận mật khẩu :");

        buttonDangKy.setBackground(new java.awt.Color(34, 139, 34));
        buttonDangKy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonDangKy.setForeground(new java.awt.Color(255, 255, 255));
        buttonDangKy.setText("Đăng ký");
        buttonDangKy.setToolTipText("Đăng ký");
        buttonDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDangKyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDangKyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDangKyMouseExited(evt);
            }
        });

        textFieldTenNguoiChoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldTenNguoiChoi.setToolTipText("Tên người chơi");

        labelTenNguoiChoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTenNguoiChoi.setText("Tên người chơi :");

        passwordFieldXacNhanMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordFieldXacNhanMatKhau.setToolTipText("Xác nhận mật khẩu");

        labelMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMatKhau.setText("Mật khẩu :");

        passwordFieldMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordFieldMatKhau.setToolTipText("Mật khẩu");
        passwordFieldMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldMatKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelManHinhQuanLyNguoiDungLayout = new javax.swing.GroupLayout(panelManHinhQuanLyNguoiDung);
        panelManHinhQuanLyNguoiDung.setLayout(panelManHinhQuanLyNguoiDungLayout);
        panelManHinhQuanLyNguoiDungLayout.setHorizontalGroup(
            panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(panelManHinhQuanLyNguoiDungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelManHinhQuanLyNguoiDungLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelDangKyNguoiChoiMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhQuanLyNguoiDungLayout.createSequentialGroup()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhQuanLyNguoiDungLayout.createSequentialGroup()
                        .addComponent(labelTenNguoiChoi)
                        .addGap(148, 148, 148)
                        .addComponent(textFieldTenNguoiChoi))
                    .addGroup(panelManHinhQuanLyNguoiDungLayout.createSequentialGroup()
                        .addGroup(panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelXacNhanMatKhau)
                            .addComponent(labelMatKhau))
                        .addGap(115, 115, 115)
                        .addGroup(panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordFieldXacNhanMatKhau, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordFieldMatKhau)
                            .addGroup(panelManHinhQuanLyNguoiDungLayout.createSequentialGroup()
                                .addComponent(buttonDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelManHinhQuanLyNguoiDungLayout.setVerticalGroup(
            panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhQuanLyNguoiDungLayout.createSequentialGroup()
                .addGroup(panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTranhTai)
                    .addComponent(labelKienThuc))
                .addGap(18, 18, 18)
                .addComponent(labelDangKyNguoiChoiMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTenNguoiChoi)
                    .addComponent(textFieldTenNguoiChoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatKhau)
                    .addComponent(passwordFieldMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelXacNhanMatKhau)
                    .addComponent(passwordFieldXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(buttonDangKy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(labelBanQuyenThuocVe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhQuanLyNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhQuanLyNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelButtonKetThucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonKetThucMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelButtonKetThucMouseClicked

    private void labelButtonKetThucMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonKetThucMouseEntered
        labelButtonKetThuc.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_labelButtonKetThucMouseEntered

    private void labelButtonKetThucMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonKetThucMouseExited
        labelButtonKetThuc.setBackground(new Color(255, 0, 51));
    }//GEN-LAST:event_labelButtonKetThucMouseExited

    private void buttonDangKyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDangKyMouseEntered
        buttonDangKy.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_buttonDangKyMouseEntered

    private void buttonDangKyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDangKyMouseExited
        buttonDangKy.setBackground(new Color(34, 139, 34));
    }//GEN-LAST:event_buttonDangKyMouseExited

    private void buttonDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDangKyMouseClicked
        String a = textFieldTenNguoiChoi.getText();
        String b = String.valueOf(passwordFieldMatKhau.getPassword());
        String c = String.valueOf(passwordFieldXacNhanMatKhau.getPassword());
        if (b.equals(c)) {
            BUS.UserBUS.insert1();
            this.setVisible(false);
            GUI.user.ManHinhDangNhap frame = new ManHinhDangNhap();
            frame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Mật khẩu không trùng khớp");
        }
    }//GEN-LAST:event_buttonDangKyMouseClicked

    private void passwordFieldMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldMatKhauActionPerformed

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
            java.util.logging.Logger.getLogger(ManHinhDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhDangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDangKy;
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelDangKyNguoiChoiMoi;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelMatKhau;
    private javax.swing.JLabel labelTenNguoiChoi;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JLabel labelXacNhanMatKhau;
    private javax.swing.JPanel panelManHinhQuanLyNguoiDung;
    public static javax.swing.JPasswordField passwordFieldMatKhau;
    public static javax.swing.JPasswordField passwordFieldXacNhanMatKhau;
    public static javax.swing.JTextField textFieldTenNguoiChoi;
    // End of variables declaration//GEN-END:variables
}
