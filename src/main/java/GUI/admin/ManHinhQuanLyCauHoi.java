package com.mycompany.ltm.admin;

import java.awt.*;
import javax.swing.JLabel;

public class ManHinhQuanLyCauHoi extends javax.swing.JFrame {

    public static int dapAn = 0;

    public ManHinhQuanLyCauHoi() {
        initComponents();
        cacChinhSuaGiaoDienBangCode();
    }

    private void cacChinhSuaGiaoDienBangCode() {
        // Chỉnh sửa về bảng danh sách người dùng
        JLabel headerLabel = (JLabel) tableDanhSachCauHoi.getTableHeader().getDefaultRenderer();
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        tableDanhSachCauHoi.getTableHeader().setPreferredSize(new Dimension(50, 50));
        tableDanhSachCauHoi.getTableHeader().setFont(new Font("Segoe UI", 18, 18));
        tableDanhSachCauHoi.getTableHeader().setBackground(Color.gray);
        tableDanhSachCauHoi.setBackground(new Color(255,255,255));
        tableDanhSachCauHoi.setFillsViewportHeight(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelManHinhQuanLyCauHoi = new javax.swing.JPanel();
        labelQuanLyCauHoi = new javax.swing.JLabel();
        buttonCapNhat = new javax.swing.JButton();
        buttonThem = new javax.swing.JButton();
        buttonXoa = new javax.swing.JButton();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        scrollPaneDanhSachCauHoi = new javax.swing.JScrollPane();
        tableDanhSachCauHoi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHinhQuanLyCauHoi.setBackground(new java.awt.Color(255, 255, 255));

        labelQuanLyCauHoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelQuanLyCauHoi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelQuanLyCauHoi.setText("QUẢN LÝ CÂU HỎI");

        buttonCapNhat.setBackground(new java.awt.Color(0, 102, 255));
        buttonCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        buttonCapNhat.setText("Cập nhật");
        buttonCapNhat.setToolTipText("Cập nhật / Sửa");
        buttonCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCapNhatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCapNhatMouseExited(evt);
            }
        });

        buttonThem.setBackground(new java.awt.Color(34, 139, 34));
        buttonThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonThem.setForeground(new java.awt.Color(255, 255, 255));
        buttonThem.setText("Thêm");
        buttonThem.setToolTipText("Thêm");
        buttonThem.setMaximumSize(new java.awt.Dimension(107, 33));
        buttonThem.setMinimumSize(new java.awt.Dimension(107, 33));
        buttonThem.setPreferredSize(new java.awt.Dimension(107, 33));
        buttonThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonThemMouseExited(evt);
            }
        });
        buttonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemActionPerformed(evt);
            }
        });

        buttonXoa.setBackground(new java.awt.Color(220, 20, 60));
        buttonXoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonXoa.setForeground(new java.awt.Color(255, 255, 255));
        buttonXoa.setText("Xoá");
        buttonXoa.setToolTipText("Xoá");
        buttonXoa.setMaximumSize(new java.awt.Dimension(107, 33));
        buttonXoa.setMinimumSize(new java.awt.Dimension(107, 33));
        buttonXoa.setPreferredSize(new java.awt.Dimension(107, 33));
        buttonXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonXoaMouseExited(evt);
            }
        });

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

        tableDanhSachCauHoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableDanhSachCauHoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã câu hỏi", "Nội dung câu hỏi", "Loại câu hỏi", "Phương án 1", "Phương án 2", "Phương án 3", "Phương án 4", "Đáp án"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDanhSachCauHoi.setRowHeight(50);
        scrollPaneDanhSachCauHoi.setViewportView(tableDanhSachCauHoi);

        javax.swing.GroupLayout panelManHinhQuanLyCauHoiLayout = new javax.swing.GroupLayout(panelManHinhQuanLyCauHoi);
        panelManHinhQuanLyCauHoi.setLayout(panelManHinhQuanLyCauHoiLayout);
        panelManHinhQuanLyCauHoiLayout.setHorizontalGroup(
            panelManHinhQuanLyCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(panelManHinhQuanLyCauHoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManHinhQuanLyCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneDanhSachCauHoi)
                    .addGroup(panelManHinhQuanLyCauHoiLayout.createSequentialGroup()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhQuanLyCauHoiLayout.createSequentialGroup()
                        .addComponent(buttonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelQuanLyCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelManHinhQuanLyCauHoiLayout.setVerticalGroup(
            panelManHinhQuanLyCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhQuanLyCauHoiLayout.createSequentialGroup()
                .addGroup(panelManHinhQuanLyCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTranhTai)
                    .addComponent(labelKienThuc))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhQuanLyCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelManHinhQuanLyCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCapNhat))
                    .addComponent(labelQuanLyCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneDanhSachCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(labelBanQuyenThuocVe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhQuanLyCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhQuanLyCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void buttonThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonThemMouseEntered
        buttonThem.setBackground(new Color(0,128,0));
    }//GEN-LAST:event_buttonThemMouseEntered

    private void buttonThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonThemMouseExited
        buttonThem.setBackground(new Color(34,139,34));
    }//GEN-LAST:event_buttonThemMouseExited

    private void buttonXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonXoaMouseEntered
        buttonXoa.setBackground(new Color(178,34,34));
    }//GEN-LAST:event_buttonXoaMouseEntered

    private void buttonXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonXoaMouseExited
        buttonXoa.setBackground(new Color(220,20,60));
    }//GEN-LAST:event_buttonXoaMouseExited

    private void buttonCapNhatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCapNhatMouseEntered
        buttonCapNhat.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_buttonCapNhatMouseEntered

    private void buttonCapNhatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCapNhatMouseExited
        buttonCapNhat.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_buttonCapNhatMouseExited

    private void buttonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonThemActionPerformed

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
            java.util.logging.Logger.getLogger(ManHinhQuanLyCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhQuanLyCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhQuanLyCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhQuanLyCauHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhQuanLyCauHoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCapNhat;
    private javax.swing.JButton buttonThem;
    private javax.swing.JButton buttonXoa;
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelQuanLyCauHoi;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhQuanLyCauHoi;
    private javax.swing.JScrollPane scrollPaneDanhSachCauHoi;
    private javax.swing.JTable tableDanhSachCauHoi;
    // End of variables declaration//GEN-END:variables
}
