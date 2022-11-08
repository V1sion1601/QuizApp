/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ltm;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author TUF
 */
public class ManHinhCauHoi extends javax.swing.JFrame {

    public static int dapAn = 0;
    int counter = 10;
    boolean isIt = false;
    Timer timer = new Timer();

    /**
     * Creates new form ManHinhDangNhap
     */
    public ManHinhCauHoi() {
        initComponents();
        cacChinhSuaGiaoDienBangCode();
    }
    
    private void cacChinhSuaGiaoDienBangCode() {
        // Đồng hồ đếm ngược
        TimerTask task = new TimerTask() {
            public void run() {
                labelDemNguocCauHoi.setText(Integer.toString(counter));
                counter = counter - 1;
                if (counter == -1) {
                    timer.cancel();
                } else if (isIt) {
                    timer.cancel();
                    isIt = false;
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelManHinhCauHoi = new javax.swing.JPanel();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        labelCauHoi = new javax.swing.JLabel();
        buttonDapAnA = new javax.swing.JButton();
        buttonDapAnB = new javax.swing.JButton();
        buttonDapAnC = new javax.swing.JButton();
        buttonDapAnD = new javax.swing.JButton();
        labelDemNguocCauHoi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelDiem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHinhCauHoi.setBackground(new java.awt.Color(255, 255, 255));

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

        labelCauHoi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelCauHoi.setText("[Vị trí đặt câu hỏi]");

        buttonDapAnA.setBackground(new java.awt.Color(0, 102, 255));
        buttonDapAnA.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonDapAnA.setForeground(new java.awt.Color(255, 255, 255));
        buttonDapAnA.setText("[Đáp án A]");
        buttonDapAnA.setToolTipText("");
        buttonDapAnA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDapAnAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDapAnAMouseExited(evt);
            }
        });
        buttonDapAnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDapAnAActionPerformed(evt);
            }
        });

        buttonDapAnB.setBackground(new java.awt.Color(0, 102, 255));
        buttonDapAnB.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonDapAnB.setForeground(new java.awt.Color(255, 255, 255));
        buttonDapAnB.setText("[Đáp án B]");
        buttonDapAnB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDapAnBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDapAnBMouseExited(evt);
            }
        });
        buttonDapAnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDapAnBActionPerformed(evt);
            }
        });

        buttonDapAnC.setBackground(new java.awt.Color(0, 102, 255));
        buttonDapAnC.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonDapAnC.setForeground(new java.awt.Color(255, 255, 255));
        buttonDapAnC.setText("[Đáp án C]");
        buttonDapAnC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDapAnCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDapAnCMouseExited(evt);
            }
        });
        buttonDapAnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDapAnCActionPerformed(evt);
            }
        });

        buttonDapAnD.setBackground(new java.awt.Color(0, 102, 255));
        buttonDapAnD.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonDapAnD.setForeground(new java.awt.Color(255, 255, 255));
        buttonDapAnD.setText("[Đáp án D]");
        buttonDapAnD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDapAnDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDapAnDMouseExited(evt);
            }
        });
        buttonDapAnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDapAnDActionPerformed(evt);
            }
        });

        labelDemNguocCauHoi.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelDemNguocCauHoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDemNguocCauHoi.setText("10");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Điểm hiện tại :");

        labelDiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDiem.setText("0");

        javax.swing.GroupLayout panelManHinhCauHoiLayout = new javax.swing.GroupLayout(panelManHinhCauHoi);
        panelManHinhCauHoi.setLayout(panelManHinhCauHoiLayout);
        panelManHinhCauHoiLayout.setHorizontalGroup(
            panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addComponent(buttonDapAnA, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDapAnB, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addComponent(buttonDapAnC, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDapAnD, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addComponent(labelCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDemNguocCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addGap(552, 552, 552)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelManHinhCauHoiLayout.setVerticalGroup(
            panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTranhTai)
                    .addComponent(labelKienThuc))
                .addGap(31, 31, 31)
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelDiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(labelDemNguocCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDapAnA, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDapAnB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDapAnC, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDapAnD, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(labelBanQuyenThuocVe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void buttonDapAnAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnAMouseEntered
        if (dapAn != 1)
            buttonDapAnA.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_buttonDapAnAMouseEntered

    private void buttonDapAnAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnAMouseExited
        if (dapAn != 1)
            buttonDapAnA.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_buttonDapAnAMouseExited

    private void buttonDapAnBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnBMouseEntered
        if (dapAn != 2)
            buttonDapAnB.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_buttonDapAnBMouseEntered

    private void buttonDapAnBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnBMouseExited
        if (dapAn != 2)
            buttonDapAnB.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_buttonDapAnBMouseExited

    private void buttonDapAnCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnCMouseEntered
        if (dapAn != 3)
            buttonDapAnC.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_buttonDapAnCMouseEntered

    private void buttonDapAnCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnCMouseExited
        if (dapAn != 3)
            buttonDapAnC.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_buttonDapAnCMouseExited

    private void buttonDapAnDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnDMouseEntered
        if (dapAn != 4)
            buttonDapAnD.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_buttonDapAnDMouseEntered

    private void buttonDapAnDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnDMouseExited
        if (dapAn != 4)
            buttonDapAnD.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_buttonDapAnDMouseExited

    private void buttonDapAnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDapAnAActionPerformed
        dapAn = 1;
        buttonDapAnA.setBackground(new Color(255, 255, 0));
        buttonDapAnA.setForeground(new Color(0, 0, 0));
        buttonDapAnB.setEnabled(false);
        buttonDapAnC.setEnabled(false);
        buttonDapAnD.setEnabled(false);
        timer.cancel();
    }//GEN-LAST:event_buttonDapAnAActionPerformed

    private void buttonDapAnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDapAnBActionPerformed
        dapAn = 2;
        buttonDapAnB.setBackground(new Color(255, 255, 0));
        buttonDapAnB.setForeground(new Color(0, 0, 0));
        buttonDapAnA.setEnabled(false);
        buttonDapAnC.setEnabled(false);
        buttonDapAnD.setEnabled(false);
        timer.cancel();
    }//GEN-LAST:event_buttonDapAnBActionPerformed

    private void buttonDapAnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDapAnCActionPerformed
        dapAn = 3;
        buttonDapAnC.setBackground(new Color(255, 255, 0));
        buttonDapAnC.setForeground(new Color(0, 0, 0));
        buttonDapAnA.setEnabled(false);
        buttonDapAnB.setEnabled(false);
        buttonDapAnD.setEnabled(false);
        timer.cancel();
    }//GEN-LAST:event_buttonDapAnCActionPerformed

    private void buttonDapAnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDapAnDActionPerformed
        dapAn = 4;
        buttonDapAnD.setBackground(new Color(255, 255, 0));
        buttonDapAnD.setForeground(new Color(0, 0, 0));
        buttonDapAnA.setEnabled(false);
        buttonDapAnB.setEnabled(false);
        buttonDapAnC.setEnabled(false);
        timer.cancel();
    }//GEN-LAST:event_buttonDapAnDActionPerformed

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
            java.util.logging.Logger.getLogger(ManHinhCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhCauHoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDapAnA;
    private javax.swing.JButton buttonDapAnB;
    private javax.swing.JButton buttonDapAnC;
    private javax.swing.JButton buttonDapAnD;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelCauHoi;
    private javax.swing.JLabel labelDemNguocCauHoi;
    private javax.swing.JLabel labelDiem;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhCauHoi;
    // End of variables declaration//GEN-END:variables
}
