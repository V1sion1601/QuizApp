/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author TUF
 */
public class ManHinhChaoMung extends javax.swing.JFrame {

    /**
     * Creates new form ManHinhDangNhap
     */
    public ManHinhChaoMung() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelManHinhChaoMung = new javax.swing.JPanel();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonDangNhap = new javax.swing.JLabel();
        labelButtonDangKy = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHinhChaoMung.setBackground(new java.awt.Color(255, 255, 255));

        labelTranhTai.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTranhTai.setText("TRANH TÀI");

        labelKienThuc.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelKienThuc.setText("KIẾN THỨC");

        labelButtonDangNhap.setBackground(new java.awt.Color(0, 102, 255));
        labelButtonDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelButtonDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonDangNhap.setText("Đăng nhập");
        labelButtonDangNhap.setToolTipText("Đăng nhập");
        labelButtonDangNhap.setOpaque(true);
        labelButtonDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonDangNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonDangNhapMouseExited(evt);
            }
        });

        labelButtonDangKy.setBackground(new java.awt.Color(220, 220, 220));
        labelButtonDangKy.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelButtonDangKy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonDangKy.setText("Đăng ký");
        labelButtonDangKy.setToolTipText("Đăng ký");
        labelButtonDangKy.setOpaque(true);
        labelButtonDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonDangKyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonDangKyMouseExited(evt);
            }
        });

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

        javax.swing.GroupLayout panelManHinhChaoMungLayout = new javax.swing.GroupLayout(panelManHinhChaoMung);
        panelManHinhChaoMung.setLayout(panelManHinhChaoMungLayout);
        panelManHinhChaoMungLayout.setHorizontalGroup(
            panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhChaoMungLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addGroup(panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelButtonDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelButtonDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKienThuc)
                    .addComponent(labelTranhTai))
                .addContainerGap(272, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManHinhChaoMungLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelManHinhChaoMungLayout.setVerticalGroup(
            panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhChaoMungLayout.createSequentialGroup()
                .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(labelTranhTai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelKienThuc)
                .addGap(71, 71, 71)
                .addComponent(labelButtonDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelButtonDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(labelBanQuyenThuocVe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhChaoMung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhChaoMung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void labelButtonDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonDangNhapMouseEntered
        labelButtonDangNhap.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_labelButtonDangNhapMouseEntered

    private void labelButtonDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonDangNhapMouseExited
        labelButtonDangNhap.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelButtonDangNhapMouseExited

    private void labelButtonDangKyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonDangKyMouseEntered
        labelButtonDangKy.setBackground(new Color(192, 192, 192));
    }//GEN-LAST:event_labelButtonDangKyMouseEntered

    private void labelButtonDangKyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonDangKyMouseExited
        labelButtonDangKy.setBackground(new Color(220, 220, 220));
       
    }//GEN-LAST:event_labelButtonDangKyMouseExited

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
            java.util.logging.Logger.getLogger(ManHinhChaoMung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhChaoMung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhChaoMung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhChaoMung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhChaoMung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonDangKy;
    private javax.swing.JLabel labelButtonDangNhap;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhChaoMung;
    // End of variables declaration//GEN-END:variables
}
