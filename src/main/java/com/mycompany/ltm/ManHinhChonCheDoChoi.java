/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ltm_detai11;

import java.awt.Color;

/**
 *
 * @author TUF
 */
public class ManHinhChonCheDoChoi extends javax.swing.JFrame {

    /**
     * Creates new form ManHinhDangNhap
     */
    public ManHinhChonCheDoChoi() {
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

        panelManHInhChonCheDoChoi = new javax.swing.JPanel();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonTimDoiThuOnline = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        labelButtonChoiVoiMay = new javax.swing.JLabel();
        labelVuiLongChonCheDoChoi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHInhChonCheDoChoi.setBackground(new java.awt.Color(255, 255, 255));

        labelTranhTai.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTranhTai.setText("TRANH TÀI");

        labelKienThuc.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelKienThuc.setText("KIẾN THỨC");

        labelButtonTimDoiThuOnline.setBackground(new java.awt.Color(0, 102, 255));
        labelButtonTimDoiThuOnline.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelButtonTimDoiThuOnline.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonTimDoiThuOnline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonTimDoiThuOnline.setText("Tìm đối thủ Online");
        labelButtonTimDoiThuOnline.setOpaque(true);
        labelButtonTimDoiThuOnline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonTimDoiThuOnlineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonTimDoiThuOnlineMouseExited(evt);
            }
        });

        labelButtonKetThuc.setBackground(new java.awt.Color(255, 0, 51));
        labelButtonKetThuc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelButtonKetThuc.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonKetThuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonKetThuc.setText("x");
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

        labelButtonChoiVoiMay.setBackground(new java.awt.Color(0, 102, 255));
        labelButtonChoiVoiMay.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelButtonChoiVoiMay.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonChoiVoiMay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonChoiVoiMay.setText("Chơi với máy");
        labelButtonChoiVoiMay.setOpaque(true);
        labelButtonChoiVoiMay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonChoiVoiMayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonChoiVoiMayMouseExited(evt);
            }
        });

        labelVuiLongChonCheDoChoi.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelVuiLongChonCheDoChoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVuiLongChonCheDoChoi.setText("Vui lòng chọn Chế độ chơi");

        javax.swing.GroupLayout panelManHInhChonCheDoChoiLayout = new javax.swing.GroupLayout(panelManHInhChonCheDoChoi);
        panelManHInhChonCheDoChoi.setLayout(panelManHInhChonCheDoChoiLayout);
        panelManHInhChonCheDoChoiLayout.setHorizontalGroup(
            panelManHInhChonCheDoChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManHInhChonCheDoChoiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelManHInhChonCheDoChoiLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addGroup(panelManHInhChonCheDoChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelButtonChoiVoiMay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelButtonTimDoiThuOnline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelKienThuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTranhTai)
                    .addComponent(labelVuiLongChonCheDoChoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        panelManHInhChonCheDoChoiLayout.setVerticalGroup(
            panelManHInhChonCheDoChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHInhChonCheDoChoiLayout.createSequentialGroup()
                .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(labelTranhTai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelKienThuc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(labelVuiLongChonCheDoChoi)
                .addGap(41, 41, 41)
                .addComponent(labelButtonTimDoiThuOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelButtonChoiVoiMay, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(labelBanQuyenThuocVe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHInhChonCheDoChoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHInhChonCheDoChoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void labelButtonTimDoiThuOnlineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTimDoiThuOnlineMouseEntered
        labelButtonTimDoiThuOnline.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_labelButtonTimDoiThuOnlineMouseEntered

    private void labelButtonTimDoiThuOnlineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTimDoiThuOnlineMouseExited
        labelButtonTimDoiThuOnline.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelButtonTimDoiThuOnlineMouseExited

    private void labelButtonChoiVoiMayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonChoiVoiMayMouseEntered
        labelButtonChoiVoiMay.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_labelButtonChoiVoiMayMouseEntered

    private void labelButtonChoiVoiMayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonChoiVoiMayMouseExited
        labelButtonChoiVoiMay.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelButtonChoiVoiMayMouseExited

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
            java.util.logging.Logger.getLogger(ManHinhChonCheDoChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhChonCheDoChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhChonCheDoChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhChonCheDoChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhChonCheDoChoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonChoiVoiMay;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelButtonTimDoiThuOnline;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JLabel labelVuiLongChonCheDoChoi;
    private javax.swing.JPanel panelManHInhChonCheDoChoi;
    // End of variables declaration//GEN-END:variables
}
