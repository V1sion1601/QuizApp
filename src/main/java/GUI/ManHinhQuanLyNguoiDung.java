package GUI;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class ManHinhQuanLyNguoiDung extends javax.swing.JFrame {

    public static DefaultTableModel model2;
    public static int selectedRow = -1;
    public static int dapAn = 0;

    public ManHinhQuanLyNguoiDung() {
        initComponents();
        cacChinhSuaGiaoDienBangCode();
        model2 = (DefaultTableModel) tableDanhSachNguoiDung.getModel();
        tableDanhSachNguoiDung.setModel(model2);
        BUS.UserBUS.showUser();
    }

    private void cacChinhSuaGiaoDienBangCode() {
        // Chỉnh sửa về bảng danh sách người dùng
        JLabel headerLabel = (JLabel) tableDanhSachNguoiDung.getTableHeader().getDefaultRenderer();
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        tableDanhSachNguoiDung.getTableHeader().setPreferredSize(new Dimension(50, 50));
        tableDanhSachNguoiDung.getTableHeader().setFont(new Font("Segoe UI", 18, 18));
        tableDanhSachNguoiDung.getTableHeader().setBackground(Color.gray);
        tableDanhSachNguoiDung.setBackground(new Color(255,255,255));
        tableDanhSachNguoiDung.setFillsViewportHeight(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelManHinhQuanLyNguoiDung = new javax.swing.JPanel();
        labelQuanLyNguoiChoi = new javax.swing.JLabel();
        buttonCapNhat = new javax.swing.JButton();
        buttonThem = new javax.swing.JButton();
        buttonXoa = new javax.swing.JButton();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        scrollPaneDanhSachNguoiDung = new javax.swing.JScrollPane();
        tableDanhSachNguoiDung = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHinhQuanLyNguoiDung.setBackground(new java.awt.Color(255, 255, 255));

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

        buttonThem.setBackground(new java.awt.Color(34, 139, 34));
        buttonThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonThem.setForeground(new java.awt.Color(255, 255, 255));
        buttonThem.setText("Thêm");
        buttonThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonThemMouseExited(evt);
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

        tableDanhSachNguoiDung.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableDanhSachNguoiDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã người chơi", "Tên người chơi", "Mật khẩu (đã băm)", "Tổng điểm", "Tình trạng", "Vai trò"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDanhSachNguoiDung.setRowHeight(50);
        scrollPaneDanhSachNguoiDung.setViewportView(tableDanhSachNguoiDung);

        javax.swing.GroupLayout panelManHinhQuanLyNguoiDungLayout = new javax.swing.GroupLayout(panelManHinhQuanLyNguoiDung);
        panelManHinhQuanLyNguoiDung.setLayout(panelManHinhQuanLyNguoiDungLayout);
        panelManHinhQuanLyNguoiDungLayout.setHorizontalGroup(
            panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(panelManHinhQuanLyNguoiDungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneDanhSachNguoiDung)
                    .addGroup(panelManHinhQuanLyNguoiDungLayout.createSequentialGroup()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhQuanLyNguoiDungLayout.createSequentialGroup()
                        .addComponent(buttonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelQuanLyNguoiChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonThem)
                        .addComponent(buttonXoa)
                        .addComponent(buttonCapNhat))
                    .addComponent(labelQuanLyNguoiChoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(ManHinhQuanLyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhQuanLyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhQuanLyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhQuanLyNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ManHinhQuanLyNguoiDung().setVisible(true);
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
    private javax.swing.JLabel labelQuanLyNguoiChoi;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhQuanLyNguoiDung;
    private javax.swing.JScrollPane scrollPaneDanhSachNguoiDung;
    private javax.swing.JTable tableDanhSachNguoiDung;
    // End of variables declaration//GEN-END:variables
}
