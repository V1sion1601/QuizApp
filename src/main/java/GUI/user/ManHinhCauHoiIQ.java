/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ltm.user;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author TUF
 */
public class ManHinhCauHoiIQ extends javax.swing.JFrame {

    public static int dapAnCauHoiIQ = 0;

    /**
     * Creates new form ManHinhDangNhap
     */
    public ManHinhCauHoiIQ() {
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

        panelManHinhCauHoi = new javax.swing.JPanel();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        labelHinhAnhCauHoi = new javax.swing.JLabel();
        labelCauHoi = new javax.swing.JLabel();
        labelIQ = new javax.swing.JLabel();
        labelDapAnA = new javax.swing.JLabel();
        labelDapAnB = new javax.swing.JLabel();
        labelDapAnC = new javax.swing.JLabel();
        labelDapAnD = new javax.swing.JLabel();

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

        labelHinhAnhCauHoi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelHinhAnhCauHoi.setText("[Vị trí đặt câu hỏi]");

        labelCauHoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelCauHoi.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelCauHoi.setText("CÂU HỎI");

        labelIQ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelIQ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelIQ.setText("IQ");

        labelDapAnA.setBackground(new java.awt.Color(0, 102, 255));
        labelDapAnA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDapAnA.setForeground(new java.awt.Color(255, 255, 255));
        labelDapAnA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDapAnA.setText("[Đáp án A]");
        labelDapAnA.setOpaque(true);
        labelDapAnA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDapAnAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDapAnAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDapAnAMouseExited(evt);
            }
        });

        labelDapAnB.setBackground(new java.awt.Color(0, 102, 255));
        labelDapAnB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDapAnB.setForeground(new java.awt.Color(255, 255, 255));
        labelDapAnB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDapAnB.setText("[Đáp án B]");
        labelDapAnB.setOpaque(true);
        labelDapAnB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDapAnBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDapAnBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDapAnBMouseExited(evt);
            }
        });

        labelDapAnC.setBackground(new java.awt.Color(0, 102, 255));
        labelDapAnC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDapAnC.setForeground(new java.awt.Color(255, 255, 255));
        labelDapAnC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDapAnC.setText("[Đáp án C]");
        labelDapAnC.setOpaque(true);
        labelDapAnC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDapAnCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDapAnCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDapAnCMouseExited(evt);
            }
        });

        labelDapAnD.setBackground(new java.awt.Color(0, 102, 255));
        labelDapAnD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDapAnD.setForeground(new java.awt.Color(255, 255, 255));
        labelDapAnD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDapAnD.setText("[Đáp án D]");
        labelDapAnD.setOpaque(true);
        labelDapAnD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDapAnDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDapAnDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDapAnDMouseExited(evt);
            }
        });

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManHinhCauHoiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelIQ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addComponent(labelHinhAnhCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(labelDapAnA, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManHinhCauHoiLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDapAnB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDapAnC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDapAnD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                    .addComponent(labelCauHoi)
                    .addComponent(labelIQ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHinhAnhCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addComponent(labelDapAnA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDapAnB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDapAnC, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDapAnD, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
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

    private void labelDapAnAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnAMouseEntered
        if (dapAnCauHoiIQ == 0) {
            labelDapAnA.setBackground(new Color(0, 0, 204));
        }

    }//GEN-LAST:event_labelDapAnAMouseEntered

    private void labelDapAnAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnAMouseExited
        if (dapAnCauHoiIQ == 0)
            labelDapAnA.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelDapAnAMouseExited

    private void labelDapAnBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnBMouseEntered
        if (dapAnCauHoiIQ == 0) {
            labelDapAnB.setBackground(new Color(0, 0, 204));
        }


    }//GEN-LAST:event_labelDapAnBMouseEntered

    private void labelDapAnBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnBMouseExited
        if (dapAnCauHoiIQ == 0)
            labelDapAnB.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelDapAnBMouseExited

    private void labelDapAnCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnCMouseEntered
        if (dapAnCauHoiIQ == 0)
            labelDapAnC.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_labelDapAnCMouseEntered

    private void labelDapAnCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnCMouseExited
        if (dapAnCauHoiIQ == 0)
            labelDapAnC.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelDapAnCMouseExited

    private void labelDapAnDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnDMouseEntered
        if (dapAnCauHoiIQ == 0)
            labelDapAnD.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_labelDapAnDMouseEntered

    private void labelDapAnDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnDMouseExited
        if (dapAnCauHoiIQ == 0)
            labelDapAnD.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelDapAnDMouseExited

    private void labelDapAnAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnAMouseClicked
        if (dapAnCauHoiIQ == 0) {
            dapAnCauHoiIQ = 1;
            labelDapAnA.setBackground(new Color(255, 255, 0));
            labelDapAnA.setForeground(new Color(0, 0, 0));
            labelDapAnB.setBackground(new Color(204, 204, 204));
            labelDapAnC.setBackground(new Color(204, 204, 204));
            labelDapAnD.setBackground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_labelDapAnAMouseClicked

    private void labelDapAnBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnBMouseClicked
        if (dapAnCauHoiIQ == 0) {
            dapAnCauHoiIQ = 2;
            labelDapAnB.setBackground(new Color(255, 255, 0));
            labelDapAnB.setForeground(new Color(0, 0, 0));
            labelDapAnA.setBackground(new Color(204, 204, 204));
            labelDapAnC.setBackground(new Color(204, 204, 204));
            labelDapAnD.setBackground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_labelDapAnBMouseClicked

    private void labelDapAnCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnCMouseClicked
        if (dapAnCauHoiIQ == 0) {
            dapAnCauHoiIQ = 3;
            labelDapAnC.setBackground(new Color(255, 255, 0));
            labelDapAnC.setForeground(new Color(0, 0, 0));
            labelDapAnB.setBackground(new Color(204, 204, 204));
            labelDapAnA.setBackground(new Color(204, 204, 204));
            labelDapAnD.setBackground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_labelDapAnCMouseClicked

    private void labelDapAnDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnDMouseClicked
        if (dapAnCauHoiIQ == 0) {
            dapAnCauHoiIQ = 4;
            labelDapAnD.setBackground(new Color(255, 255, 0));
            labelDapAnD.setForeground(new Color(0, 0, 0));
            labelDapAnB.setBackground(new Color(204, 204, 204));
            labelDapAnC.setBackground(new Color(204, 204, 204));
            labelDapAnA.setBackground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_labelDapAnDMouseClicked

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
            java.util.logging.Logger.getLogger(ManHinhCauHoiIQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoiIQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoiIQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoiIQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ManHinhCauHoiIQ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelCauHoi;
    private javax.swing.JLabel labelDapAnA;
    private javax.swing.JLabel labelDapAnB;
    private javax.swing.JLabel labelDapAnC;
    private javax.swing.JLabel labelDapAnD;
    private javax.swing.JLabel labelHinhAnhCauHoi;
    private javax.swing.JLabel labelIQ;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhCauHoi;
    // End of variables declaration//GEN-END:variables
}
