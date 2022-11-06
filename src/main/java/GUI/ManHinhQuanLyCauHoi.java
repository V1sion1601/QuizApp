package GUI;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class ManHinhQuanLyCauHoi extends javax.swing.JFrame {
    public static DefaultTableModel model1;
    public static int selectedRow = -1;
    public static int dapAn = 0;

    public ManHinhQuanLyCauHoi() {
        initComponents();
        cacChinhSuaGiaoDienBangCode();
        model1 = (DefaultTableModel) tableDanhSachCauHoi.getModel();
        tableDanhSachCauHoi.setModel(model1);
        BUS.QuestionBUS.showQuestion();
//        tableDanhSachCauHoi.addMouseListener(new MouseListener()
//                {
//                    @Override
//            public void mouseClicked(MouseEvent e) {
//                selectedRow = tableDanhSachCauHoi.getSelectedRow();
//                java.util.List<DTO.QuestionDTO> QuestionList = DAO.QuestionDAO.getListQuestion();
////                DTO.QuestionDTO monhoc = QuestionList.get(selectedRow);
////                float a=diem.getWeb();
////                String a1=Float.toString(a);
////                String b=tf_java.getText().toString();
////                String c=tf_mnm.getText().toString();
////                String d=tf_pttk.getText().toString();
//                
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                
////                tf_mamonhoc.setText(monhoc.getMamonhoc());
////                tf_tenmh.setText(monhoc.getTenmonhoc());
////                tf_sotinchi.setText(String.valueOf(monhoc.getSotinchi()));
//                
//                
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                selectedRow = tableDanhSachCauHoi.getSelectedRow();
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });BUS.QuestionBUS.showQuestion();
//    }
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

        panelManHinhQuanLyNguoiDung = new javax.swing.JPanel();
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

        panelManHinhQuanLyNguoiDung.setBackground(new java.awt.Color(255, 255, 255));

        labelQuanLyCauHoi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelQuanLyCauHoi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelQuanLyCauHoi.setText("QUẢN LÝ CÂU HỎI");

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

        tableDanhSachCauHoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableDanhSachCauHoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã câu hỏi", "Nội dung câu hỏi", "Đáp án 1", "Đáp án 2", "Đáp án 3", "Đáp án 4", "Đáp án đúng", "Bộ câu hỏi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDanhSachCauHoi.setRowHeight(50);
        scrollPaneDanhSachCauHoi.setViewportView(tableDanhSachCauHoi);

        javax.swing.GroupLayout panelManHinhQuanLyNguoiDungLayout = new javax.swing.GroupLayout(panelManHinhQuanLyNguoiDung);
        panelManHinhQuanLyNguoiDung.setLayout(panelManHinhQuanLyNguoiDungLayout);
        panelManHinhQuanLyNguoiDungLayout.setHorizontalGroup(
            panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(panelManHinhQuanLyNguoiDungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManHinhQuanLyNguoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneDanhSachCauHoi)
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
                        .addComponent(labelQuanLyCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    private javax.swing.JPanel panelManHinhQuanLyNguoiDung;
    private javax.swing.JScrollPane scrollPaneDanhSachCauHoi;
    private javax.swing.JTable tableDanhSachCauHoi;
    // End of variables declaration//GEN-END:variables
}
