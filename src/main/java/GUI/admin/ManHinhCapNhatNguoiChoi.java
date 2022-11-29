package GUI.admin;


import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ManHinhCapNhatNguoiChoi extends javax.swing.JFrame {

    public static int dapAn = 0;

    public ManHinhCapNhatNguoiChoi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelManHinhCapNhatNguoiChoi = new javax.swing.JPanel();
        labelQuanLyNguoiChoi = new javax.swing.JLabel();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        labelMaNguoiChoi = new javax.swing.JLabel();
        labelMaNguoiChoiTuCSDL = new javax.swing.JLabel();
        labelTenNguoiChoi = new javax.swing.JLabel();
        textFieldTenNguoiChoi = new javax.swing.JTextField();
        labelDiaChiEmail = new javax.swing.JLabel();
        textFieldDiaChiEmail = new javax.swing.JTextField();
        labelGioiTinh = new javax.swing.JLabel();
        comboBoxGioiTinh = new javax.swing.JComboBox<>();
        labelNgaySinh = new javax.swing.JLabel();
        textFieldNgaySinh = new javax.swing.JTextField();
        labelTinhTrang = new javax.swing.JLabel();
        labelTinhTrangTuCSDL = new javax.swing.JLabel();
        buttonLuuThayDoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHinhCapNhatNguoiChoi.setBackground(new java.awt.Color(255, 255, 255));

        labelQuanLyNguoiChoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelQuanLyNguoiChoi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelQuanLyNguoiChoi.setText("CẬP NHẬT NGƯỜI CHƠI");

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

        labelMaNguoiChoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMaNguoiChoi.setText("Mã người chơi :");

        labelMaNguoiChoiTuCSDL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelMaNguoiChoiTuCSDL.setText("PLAYER1");

        labelTenNguoiChoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTenNguoiChoi.setText("Tên người chơi :");

        textFieldTenNguoiChoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldTenNguoiChoi.setToolTipText("Tên người chơi");

        labelDiaChiEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDiaChiEmail.setText("Địa chỉ Email :");

        textFieldDiaChiEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldDiaChiEmail.setToolTipText("Địa chỉ Email");

        labelGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelGioiTinh.setText("Giới tính :");

        comboBoxGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        comboBoxGioiTinh.setToolTipText("Giới tính");

        labelNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNgaySinh.setText("Ngày sinh :");

        textFieldNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldNgaySinh.setToolTipText("Ngày sinh");

        labelTinhTrang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTinhTrang.setText("Tình trạng :");

        labelTinhTrangTuCSDL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTinhTrangTuCSDL.setText("HOẠT ĐỘNG");

        buttonLuuThayDoi.setBackground(new java.awt.Color(34, 139, 34));
        buttonLuuThayDoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonLuuThayDoi.setForeground(new java.awt.Color(255, 255, 255));
        buttonLuuThayDoi.setText("Lưu thay đổi");
        buttonLuuThayDoi.setToolTipText("Lưu thay đổi");
        buttonLuuThayDoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLuuThayDoiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLuuThayDoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLuuThayDoiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelManHinhCapNhatNguoiChoiLayout = new javax.swing.GroupLayout(panelManHinhCapNhatNguoiChoi);
        panelManHinhCapNhatNguoiChoi.setLayout(panelManHinhCapNhatNguoiChoiLayout);
        panelManHinhCapNhatNguoiChoiLayout.setHorizontalGroup(
            panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(panelManHinhCapNhatNguoiChoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelManHinhCapNhatNguoiChoiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelQuanLyNguoiChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhCapNhatNguoiChoiLayout.createSequentialGroup()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhCapNhatNguoiChoiLayout.createSequentialGroup()
                        .addGroup(panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTenNguoiChoi)
                            .addComponent(labelDiaChiEmail)
                            .addComponent(labelGioiTinh)
                            .addComponent(labelNgaySinh)
                            .addComponent(labelMaNguoiChoi)
                            .addComponent(labelTinhTrang))
                        .addGap(148, 148, 148)
                        .addGroup(panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNgaySinh)
                            .addComponent(textFieldDiaChiEmail)
                            .addComponent(textFieldTenNguoiChoi)
                            .addGroup(panelManHinhCapNhatNguoiChoiLayout.createSequentialGroup()
                                .addGroup(panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTinhTrangTuCSDL)
                                    .addComponent(labelMaNguoiChoiTuCSDL)
                                    .addComponent(comboBoxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonLuuThayDoi, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelManHinhCapNhatNguoiChoiLayout.setVerticalGroup(
            panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhCapNhatNguoiChoiLayout.createSequentialGroup()
                .addGroup(panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTranhTai)
                    .addComponent(labelKienThuc))
                .addGap(18, 18, 18)
                .addComponent(labelQuanLyNguoiChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaNguoiChoi)
                    .addComponent(labelMaNguoiChoiTuCSDL))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTenNguoiChoi)
                    .addComponent(textFieldTenNguoiChoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDiaChiEmail)
                    .addComponent(textFieldDiaChiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGioiTinh))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNgaySinh)
                    .addComponent(textFieldNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTinhTrang)
                    .addComponent(labelTinhTrangTuCSDL))
                .addGap(18, 18, 18)
                .addComponent(buttonLuuThayDoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(labelBanQuyenThuocVe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhCapNhatNguoiChoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhCapNhatNguoiChoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void buttonLuuThayDoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLuuThayDoiMouseEntered
        buttonLuuThayDoi.setBackground(new Color(0,128,0));
    }//GEN-LAST:event_buttonLuuThayDoiMouseEntered

    private void buttonLuuThayDoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLuuThayDoiMouseExited
        buttonLuuThayDoi.setBackground(new Color(34,139,34));
    }//GEN-LAST:event_buttonLuuThayDoiMouseExited

    private void buttonLuuThayDoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLuuThayDoiMouseClicked
        String noiDungThongBao = "Cập nhật thành công";
        JOptionPane.showMessageDialog(null, noiDungThongBao, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonLuuThayDoiMouseClicked

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
            java.util.logging.Logger.getLogger(ManHinhCapNhatNguoiChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhCapNhatNguoiChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhCapNhatNguoiChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhCapNhatNguoiChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhCapNhatNguoiChoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLuuThayDoi;
    public static javax.swing.JComboBox<String> comboBoxGioiTinh;
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelDiaChiEmail;
    private javax.swing.JLabel labelGioiTinh;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelMaNguoiChoi;
    public static javax.swing.JLabel labelMaNguoiChoiTuCSDL;
    private javax.swing.JLabel labelNgaySinh;
    private javax.swing.JLabel labelQuanLyNguoiChoi;
    private javax.swing.JLabel labelTenNguoiChoi;
    private javax.swing.JLabel labelTinhTrang;
    public static javax.swing.JLabel labelTinhTrangTuCSDL;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhCapNhatNguoiChoi;
    private javax.swing.JTextField textFieldDiaChiEmail;
    private javax.swing.JTextField textFieldNgaySinh;
    public static javax.swing.JTextField textFieldTenNguoiChoi;
    // End of variables declaration//GEN-END:variables
}
