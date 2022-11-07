package com.mycompany.ltm;

import java.awt.*;
import javax.swing.*;

public class ManHinhQuanLyNguoiChoi extends javax.swing.JFrame {

    public static int dapAn = 0;

    public ManHinhQuanLyNguoiChoi() {
        initComponents();
        cacChinhSuaGiaoDienBangCode();
    }

    private void cacChinhSuaGiaoDienBangCode() {
        // Chỉnh sửa về bảng danh sách người dùng
        JLabel headerLabel = (JLabel) tableDanhSachNguoiChoi.getTableHeader().getDefaultRenderer();
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        tableDanhSachNguoiChoi.getTableHeader().setPreferredSize(new Dimension(50, 50));
        tableDanhSachNguoiChoi.getTableHeader().setFont(new Font("Segoe UI", 18, 18));
        tableDanhSachNguoiChoi.getTableHeader().setBackground(Color.gray);
        tableDanhSachNguoiChoi.setBackground(new Color(255, 255, 255));
        tableDanhSachNguoiChoi.setFillsViewportHeight(true);
        // Chiều dài cột theo tỉ lệ phần trăm
        HamDungChung.setJTableColumnsWidth(tableDanhSachNguoiChoi, 600, 15, 32.5, 15, 15, 7.5, 5, 5, 5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelManHinhQuanLyNguoiChoi = new javax.swing.JPanel();
        buttonChan = new javax.swing.JButton();
        labelQuanLyNguoiChoi = new javax.swing.JLabel();
        buttonCapNhat = new javax.swing.JButton();
        buttonXoa = new javax.swing.JButton();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        scrollPaneDanhSachNguoiDung = new javax.swing.JScrollPane();
        tableDanhSachNguoiChoi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHinhQuanLyNguoiChoi.setBackground(new java.awt.Color(255, 255, 255));

        buttonChan.setBackground(new java.awt.Color(153, 153, 0));
        buttonChan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonChan.setForeground(new java.awt.Color(255, 255, 255));
        buttonChan.setText("Chặn");
        buttonChan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonChanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonChanMouseExited(evt);
            }
        });

        labelQuanLyNguoiChoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelQuanLyNguoiChoi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelQuanLyNguoiChoi.setText("QUẢN LÝ NGƯỜI CHƠI");

        buttonCapNhat.setBackground(new java.awt.Color(0, 102, 255));
        buttonCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        buttonCapNhat.setText("Cập nhật");
        buttonCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCapNhatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCapNhatMouseExited(evt);
            }
        });

        buttonXoa.setBackground(new java.awt.Color(220, 20, 60));
        buttonXoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonXoa.setForeground(new java.awt.Color(255, 255, 255));
        buttonXoa.setText("Xoá");
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

        tableDanhSachNguoiChoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableDanhSachNguoiChoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã người chơi", "Tên người chơi", "Tình trạng", "Vai trò", "Tổng điểm", "Số lần chơi", "Số lần thắng", "Chuỗi thắng dài nhất"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDanhSachNguoiChoi.setRowHeight(50);
        scrollPaneDanhSachNguoiDung.setViewportView(tableDanhSachNguoiChoi);

        javax.swing.GroupLayout panelManHinhQuanLyNguoiChoiLayout = new javax.swing.GroupLayout(panelManHinhQuanLyNguoiChoi);
        panelManHinhQuanLyNguoiChoi.setLayout(panelManHinhQuanLyNguoiChoiLayout);
        panelManHinhQuanLyNguoiChoiLayout.setHorizontalGroup(
            panelManHinhQuanLyNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(panelManHinhQuanLyNguoiChoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManHinhQuanLyNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneDanhSachNguoiDung)
                    .addGroup(panelManHinhQuanLyNguoiChoiLayout.createSequentialGroup()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 495, Short.MAX_VALUE)
                        .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhQuanLyNguoiChoiLayout.createSequentialGroup()
                        .addComponent(buttonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonChan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelQuanLyNguoiChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelManHinhQuanLyNguoiChoiLayout.setVerticalGroup(
            panelManHinhQuanLyNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhQuanLyNguoiChoiLayout.createSequentialGroup()
                .addGroup(panelManHinhQuanLyNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTranhTai)
                    .addComponent(labelKienThuc))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhQuanLyNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelManHinhQuanLyNguoiChoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonXoa)
                        .addComponent(buttonCapNhat)
                        .addComponent(buttonChan))
                    .addComponent(labelQuanLyNguoiChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneDanhSachNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(labelBanQuyenThuocVe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhQuanLyNguoiChoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhQuanLyNguoiChoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void buttonXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonXoaMouseEntered
        buttonXoa.setBackground(new Color(178, 34, 34));
    }//GEN-LAST:event_buttonXoaMouseEntered

    private void buttonXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonXoaMouseExited
        buttonXoa.setBackground(new Color(220, 20, 60));
    }//GEN-LAST:event_buttonXoaMouseExited

    private void buttonCapNhatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCapNhatMouseEntered
        buttonCapNhat.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_buttonCapNhatMouseEntered

    private void buttonCapNhatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCapNhatMouseExited
        buttonCapNhat.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_buttonCapNhatMouseExited

    private void buttonChanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonChanMouseEntered
        buttonChan.setBackground(new Color(102, 102, 0));
    }//GEN-LAST:event_buttonChanMouseEntered

    private void buttonChanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonChanMouseExited
        buttonChan.setBackground(new Color(153, 153, 0));
    }//GEN-LAST:event_buttonChanMouseExited

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
            java.util.logging.Logger.getLogger(ManHinhQuanLyNguoiChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhQuanLyNguoiChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhQuanLyNguoiChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhQuanLyNguoiChoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ManHinhQuanLyNguoiChoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCapNhat;
    private javax.swing.JButton buttonChan;
    private javax.swing.JButton buttonXoa;
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelQuanLyNguoiChoi;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhQuanLyNguoiChoi;
    private javax.swing.JScrollPane scrollPaneDanhSachNguoiDung;
    private javax.swing.JTable tableDanhSachNguoiChoi;
    // End of variables declaration//GEN-END:variables
}
