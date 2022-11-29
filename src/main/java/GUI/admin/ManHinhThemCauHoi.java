package GUI.admin;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ManHinhThemCauHoi extends javax.swing.JFrame {

    public static int dapAn = 0;

    public ManHinhThemCauHoi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelManHinhCapNhatCauHoi = new javax.swing.JPanel();
        labelThemCauHoi = new javax.swing.JLabel();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        labelMaCauHoi = new javax.swing.JLabel();
        labelMaCauHoiTuCSDL = new javax.swing.JLabel();
        labelNoiDungCauHoi = new javax.swing.JLabel();
        textFieldTenNguoiChoi = new javax.swing.JTextField();
        labelPhuongAn1 = new javax.swing.JLabel();
        textFieldPhuongAn1 = new javax.swing.JTextField();
        labelGioiTinh = new javax.swing.JLabel();
        comboBoxPhuongAnDung = new javax.swing.JComboBox<>();
        buttonLuu = new javax.swing.JButton();
        labelPhuongAn2 = new javax.swing.JLabel();
        textFieldPhuongAn2 = new javax.swing.JTextField();
        labelPhuongAn3 = new javax.swing.JLabel();
        textFieldPhuongAn3 = new javax.swing.JTextField();
        labelPhuongAn4 = new javax.swing.JLabel();
        textFieldPhuongAn4 = new javax.swing.JTextField();
        comboBoxPhuongAnDung1 = new javax.swing.JComboBox<>();
        labelGioiTinh1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHinhCapNhatCauHoi.setBackground(new java.awt.Color(255, 255, 255));

        labelThemCauHoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelThemCauHoi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelThemCauHoi.setText("THÊM CÂU HỎI");

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

        labelMaCauHoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMaCauHoi.setText("Mã câu hỏi :");

        labelMaCauHoiTuCSDL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelMaCauHoiTuCSDL.setText("[Sẽ tự động sinh ra sau khi nhấn Lưu]");

        labelNoiDungCauHoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNoiDungCauHoi.setText("Nội dung câu hỏi :");

        textFieldTenNguoiChoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldTenNguoiChoi.setToolTipText("Nội dung câu hỏi");

        labelPhuongAn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPhuongAn1.setText("Phương án 1 :");

        textFieldPhuongAn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldPhuongAn1.setToolTipText("Phương án 1");

        labelGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelGioiTinh.setText("Phương án đúng :");

        comboBoxPhuongAnDung.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxPhuongAnDung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        comboBoxPhuongAnDung.setToolTipText("Phương án đúng");

        buttonLuu.setBackground(new java.awt.Color(34, 139, 34));
        buttonLuu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonLuu.setForeground(new java.awt.Color(255, 255, 255));
        buttonLuu.setText("Lưu");
        buttonLuu.setToolTipText("Lưu");
        buttonLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLuuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLuuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLuuMouseExited(evt);
            }
        });

        labelPhuongAn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPhuongAn2.setText("Phương án 2 :");

        textFieldPhuongAn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldPhuongAn2.setToolTipText("Phương án 2");

        labelPhuongAn3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPhuongAn3.setText("Phương án 3 :");

        textFieldPhuongAn3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldPhuongAn3.setToolTipText("Phương án 3");

        labelPhuongAn4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPhuongAn4.setText("Phương án 4 :");

        textFieldPhuongAn4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldPhuongAn4.setToolTipText("Phương án 4");

        comboBoxPhuongAnDung1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxPhuongAnDung1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        comboBoxPhuongAnDung1.setToolTipText("Loại câu hỏi");

        labelGioiTinh1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelGioiTinh1.setText("Loại câu hỏi :");

        javax.swing.GroupLayout panelManHinhCapNhatCauHoiLayout = new javax.swing.GroupLayout(panelManHinhCapNhatCauHoi);
        panelManHinhCapNhatCauHoi.setLayout(panelManHinhCapNhatCauHoiLayout);
        panelManHinhCapNhatCauHoiLayout.setHorizontalGroup(
            panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(panelManHinhCapNhatCauHoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelManHinhCapNhatCauHoiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelThemCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhCapNhatCauHoiLayout.createSequentialGroup()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhCapNhatCauHoiLayout.createSequentialGroup()
                        .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNoiDungCauHoi)
                            .addComponent(labelPhuongAn1)
                            .addComponent(labelMaCauHoi)
                            .addComponent(labelGioiTinh)
                            .addComponent(labelPhuongAn2)
                            .addComponent(labelPhuongAn3)
                            .addComponent(labelPhuongAn4))
                        .addGap(130, 130, 130)
                        .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldPhuongAn4)
                            .addComponent(textFieldPhuongAn3)
                            .addComponent(textFieldPhuongAn2)
                            .addComponent(textFieldPhuongAn1)
                            .addComponent(textFieldTenNguoiChoi)
                            .addGroup(panelManHinhCapNhatCauHoiLayout.createSequentialGroup()
                                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxPhuongAnDung, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMaCauHoiTuCSDL))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelManHinhCapNhatCauHoiLayout.createSequentialGroup()
                        .addComponent(labelGioiTinh1)
                        .addGap(173, 173, 173)
                        .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxPhuongAnDung1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelManHinhCapNhatCauHoiLayout.setVerticalGroup(
            panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhCapNhatCauHoiLayout.createSequentialGroup()
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTranhTai)
                    .addComponent(labelKienThuc))
                .addGap(18, 18, 18)
                .addComponent(labelThemCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaCauHoi)
                    .addComponent(labelMaCauHoiTuCSDL))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoiDungCauHoi)
                    .addComponent(textFieldTenNguoiChoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhuongAn1)
                    .addComponent(textFieldPhuongAn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhuongAn2)
                    .addComponent(textFieldPhuongAn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhuongAn3)
                    .addComponent(textFieldPhuongAn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhuongAn4)
                    .addComponent(textFieldPhuongAn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPhuongAnDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGioiTinh))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPhuongAnDung1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGioiTinh1))
                .addGap(18, 18, 18)
                .addComponent(buttonLuu)
                .addGap(41, 41, 41)
                .addComponent(labelBanQuyenThuocVe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhCapNhatCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhCapNhatCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void buttonLuuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLuuMouseEntered
        buttonLuu.setBackground(new Color(0, 128, 0));
    }//GEN-LAST:event_buttonLuuMouseEntered

    private void buttonLuuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLuuMouseExited
        buttonLuu.setBackground(new Color(34, 139, 34));
    }//GEN-LAST:event_buttonLuuMouseExited

    private void buttonLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLuuMouseClicked
        String noiDungThongBao = "Thêm thành công";
        JOptionPane.showMessageDialog(null, noiDungThongBao, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonLuuMouseClicked

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
            java.util.logging.Logger.getLogger(ManHinhThemCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhThemCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhThemCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhThemCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ManHinhThemCauHoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLuu;
    private javax.swing.JComboBox<String> comboBoxPhuongAnDung;
    private javax.swing.JComboBox<String> comboBoxPhuongAnDung1;
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelGioiTinh;
    private javax.swing.JLabel labelGioiTinh1;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelMaCauHoi;
    private javax.swing.JLabel labelMaCauHoiTuCSDL;
    private javax.swing.JLabel labelNoiDungCauHoi;
    private javax.swing.JLabel labelPhuongAn1;
    private javax.swing.JLabel labelPhuongAn2;
    private javax.swing.JLabel labelPhuongAn3;
    private javax.swing.JLabel labelPhuongAn4;
    private javax.swing.JLabel labelThemCauHoi;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhCapNhatCauHoi;
    private javax.swing.JTextField textFieldPhuongAn1;
    private javax.swing.JTextField textFieldPhuongAn2;
    private javax.swing.JTextField textFieldPhuongAn3;
    private javax.swing.JTextField textFieldPhuongAn4;
    private javax.swing.JTextField textFieldTenNguoiChoi;
    // End of variables declaration//GEN-END:variables
}
