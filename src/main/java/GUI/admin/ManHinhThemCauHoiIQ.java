package GUI.admin;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ManHinhThemCauHoiIQ extends javax.swing.JFrame {

    public static int dapAn = 0;

    public ManHinhThemCauHoiIQ() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelManHinhCapNhatCauHoi = new javax.swing.JPanel();
        labelThemCauHoiIQ = new javax.swing.JLabel();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        labelMaCauHoi = new javax.swing.JLabel();
        labelMaCauHoiTuCSDL = new javax.swing.JLabel();
        labelNoiDungCauHoi = new javax.swing.JLabel();
        textFieldNoiDungCauHoi = new javax.swing.JTextField();
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
        labelButtonTroVe = new javax.swing.JLabel();
        labelButtonThemAnhNoiDungCauHoi = new javax.swing.JLabel();
        labelButtonThemAnhPhuongAn1 = new javax.swing.JLabel();
        labelButtonThemAnhPhuongAn2 = new javax.swing.JLabel();
        labelButtonThemAnhPhuongAn3 = new javax.swing.JLabel();
        labelButtonThemAnhPhuongAn4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHinhCapNhatCauHoi.setBackground(new java.awt.Color(255, 255, 255));

        labelThemCauHoiIQ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelThemCauHoiIQ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelThemCauHoiIQ.setText("THÊM CÂU HỎI IQ");

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

        textFieldNoiDungCauHoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldNoiDungCauHoi.setToolTipText("Nội dung câu hỏi");

        labelPhuongAn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPhuongAn1.setText("Phương án 1 :");

        textFieldPhuongAn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldPhuongAn1.setToolTipText("Phương án 1");

        labelGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelGioiTinh.setText("Phương án đúng :");

        comboBoxPhuongAnDung.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBoxPhuongAnDung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        comboBoxPhuongAnDung.setToolTipText("Phương án đúng");
        comboBoxPhuongAnDung.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                comboBoxPhuongAnDungMouseMoved(evt);
            }
        });

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

        labelButtonTroVe.setBackground(new java.awt.Color(204, 204, 204));
        labelButtonTroVe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelButtonTroVe.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonTroVe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonTroVe.setText("<---");
        labelButtonTroVe.setToolTipText("Trở về");
        labelButtonTroVe.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelButtonTroVe.setOpaque(true);
        labelButtonTroVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelButtonTroVeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonTroVeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonTroVeMouseExited(evt);
            }
        });

        labelButtonThemAnhNoiDungCauHoi.setBackground(new java.awt.Color(204, 204, 204));
        labelButtonThemAnhNoiDungCauHoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelButtonThemAnhNoiDungCauHoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonThemAnhNoiDungCauHoi.setText("Thêm ảnh");
        labelButtonThemAnhNoiDungCauHoi.setToolTipText("");
        labelButtonThemAnhNoiDungCauHoi.setOpaque(true);
        labelButtonThemAnhNoiDungCauHoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonThemAnhNoiDungCauHoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonThemAnhNoiDungCauHoiMouseExited(evt);
            }
        });

        labelButtonThemAnhPhuongAn1.setBackground(new java.awt.Color(204, 204, 204));
        labelButtonThemAnhPhuongAn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelButtonThemAnhPhuongAn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonThemAnhPhuongAn1.setText("Thêm ảnh");
        labelButtonThemAnhPhuongAn1.setToolTipText("");
        labelButtonThemAnhPhuongAn1.setOpaque(true);
        labelButtonThemAnhPhuongAn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonThemAnhPhuongAn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonThemAnhPhuongAn1MouseExited(evt);
            }
        });

        labelButtonThemAnhPhuongAn2.setBackground(new java.awt.Color(204, 204, 204));
        labelButtonThemAnhPhuongAn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelButtonThemAnhPhuongAn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonThemAnhPhuongAn2.setText("Thêm ảnh");
        labelButtonThemAnhPhuongAn2.setToolTipText("");
        labelButtonThemAnhPhuongAn2.setOpaque(true);
        labelButtonThemAnhPhuongAn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonThemAnhPhuongAn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonThemAnhPhuongAn2MouseExited(evt);
            }
        });

        labelButtonThemAnhPhuongAn3.setBackground(new java.awt.Color(204, 204, 204));
        labelButtonThemAnhPhuongAn3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelButtonThemAnhPhuongAn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonThemAnhPhuongAn3.setText("Thêm ảnh");
        labelButtonThemAnhPhuongAn3.setToolTipText("");
        labelButtonThemAnhPhuongAn3.setOpaque(true);
        labelButtonThemAnhPhuongAn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonThemAnhPhuongAn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonThemAnhPhuongAn3MouseExited(evt);
            }
        });

        labelButtonThemAnhPhuongAn4.setBackground(new java.awt.Color(204, 204, 204));
        labelButtonThemAnhPhuongAn4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelButtonThemAnhPhuongAn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonThemAnhPhuongAn4.setText("Thêm ảnh");
        labelButtonThemAnhPhuongAn4.setToolTipText("");
        labelButtonThemAnhPhuongAn4.setOpaque(true);
        labelButtonThemAnhPhuongAn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonThemAnhPhuongAn4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonThemAnhPhuongAn4MouseExited(evt);
            }
        });

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
                        .addComponent(labelThemCauHoiIQ, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhCapNhatCauHoiLayout.createSequentialGroup()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelButtonTroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textFieldPhuongAn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                            .addComponent(textFieldPhuongAn2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldPhuongAn1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxPhuongAnDung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMaCauHoiTuCSDL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonLuu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPhuongAn4)
                            .addComponent(textFieldNoiDungCauHoi, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelButtonThemAnhNoiDungCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelButtonThemAnhPhuongAn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelButtonThemAnhPhuongAn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelButtonThemAnhPhuongAn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelButtonThemAnhPhuongAn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelManHinhCapNhatCauHoiLayout.setVerticalGroup(
            panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhCapNhatCauHoiLayout.createSequentialGroup()
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTranhTai)
                    .addComponent(labelKienThuc)
                    .addComponent(labelButtonTroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelThemCauHoiIQ, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaCauHoi)
                    .addComponent(labelMaCauHoiTuCSDL))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoiDungCauHoi)
                    .addComponent(textFieldNoiDungCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelButtonThemAnhNoiDungCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhuongAn1)
                    .addComponent(textFieldPhuongAn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelButtonThemAnhPhuongAn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhuongAn2)
                    .addComponent(textFieldPhuongAn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelButtonThemAnhPhuongAn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhuongAn3)
                    .addComponent(textFieldPhuongAn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelButtonThemAnhPhuongAn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhuongAn4)
                    .addComponent(textFieldPhuongAn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelButtonThemAnhPhuongAn4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(panelManHinhCapNhatCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPhuongAnDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGioiTinh))
                .addGap(18, 18, 18)
                .addComponent(buttonLuu)
                .addGap(92, 92, 92)
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
        BUS.QuestionIQBUS.insert1();
        String noiDungThongBao = "Thêm thành công";
        JOptionPane.showMessageDialog(null, noiDungThongBao, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        GUI.admin.ManHinhQuanLyCauHoiIQ frame = new ManHinhQuanLyCauHoiIQ();
        frame.setVisible(true);
    }//GEN-LAST:event_buttonLuuMouseClicked

    private void comboBoxPhuongAnDungMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxPhuongAnDungMouseMoved
        // TODO add your handling code here:
        comboBoxPhuongAnDung.removeAllItems();
        GUI.admin.ManHinhThemCauHoiIQ.comboBoxPhuongAnDung.addItem(textFieldPhuongAn1.getText());
        GUI.admin.ManHinhThemCauHoiIQ.comboBoxPhuongAnDung.addItem(textFieldPhuongAn2.getText());
        GUI.admin.ManHinhThemCauHoiIQ.comboBoxPhuongAnDung.addItem(textFieldPhuongAn3.getText());
        GUI.admin.ManHinhThemCauHoiIQ.comboBoxPhuongAnDung.addItem(textFieldPhuongAn4.getText());
    }//GEN-LAST:event_comboBoxPhuongAnDungMouseMoved

    private void labelButtonTroVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTroVeMouseClicked
        GUI.admin.ManHinhQuanLyCauHoiIQ frame = new ManHinhQuanLyCauHoiIQ();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelButtonTroVeMouseClicked

    private void labelButtonTroVeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTroVeMouseEntered
        labelButtonTroVe.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_labelButtonTroVeMouseEntered

    private void labelButtonTroVeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTroVeMouseExited
        labelButtonTroVe.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_labelButtonTroVeMouseExited

    private void labelButtonThemAnhNoiDungCauHoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonThemAnhNoiDungCauHoiMouseEntered
        labelButtonThemAnhNoiDungCauHoi.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_labelButtonThemAnhNoiDungCauHoiMouseEntered

    private void labelButtonThemAnhNoiDungCauHoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonThemAnhNoiDungCauHoiMouseExited
        labelButtonThemAnhNoiDungCauHoi.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_labelButtonThemAnhNoiDungCauHoiMouseExited

    private void labelButtonThemAnhPhuongAn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonThemAnhPhuongAn1MouseEntered
        labelButtonThemAnhPhuongAn1.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_labelButtonThemAnhPhuongAn1MouseEntered

    private void labelButtonThemAnhPhuongAn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonThemAnhPhuongAn1MouseExited
        labelButtonThemAnhPhuongAn1.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_labelButtonThemAnhPhuongAn1MouseExited

    private void labelButtonThemAnhPhuongAn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonThemAnhPhuongAn2MouseEntered
        labelButtonThemAnhPhuongAn2.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_labelButtonThemAnhPhuongAn2MouseEntered

    private void labelButtonThemAnhPhuongAn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonThemAnhPhuongAn2MouseExited
        labelButtonThemAnhPhuongAn2.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_labelButtonThemAnhPhuongAn2MouseExited

    private void labelButtonThemAnhPhuongAn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonThemAnhPhuongAn3MouseEntered
        labelButtonThemAnhPhuongAn3.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_labelButtonThemAnhPhuongAn3MouseEntered

    private void labelButtonThemAnhPhuongAn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonThemAnhPhuongAn3MouseExited
        labelButtonThemAnhPhuongAn3.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_labelButtonThemAnhPhuongAn3MouseExited

    private void labelButtonThemAnhPhuongAn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonThemAnhPhuongAn4MouseEntered
        labelButtonThemAnhPhuongAn4.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_labelButtonThemAnhPhuongAn4MouseEntered

    private void labelButtonThemAnhPhuongAn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonThemAnhPhuongAn4MouseExited
        labelButtonThemAnhPhuongAn4.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_labelButtonThemAnhPhuongAn4MouseExited

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
            java.util.logging.Logger.getLogger(ManHinhThemCauHoiIQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhThemCauHoiIQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhThemCauHoiIQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhThemCauHoiIQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManHinhThemCauHoiIQ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLuu;
    public static javax.swing.JComboBox<String> comboBoxPhuongAnDung;
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelButtonThemAnhNoiDungCauHoi;
    private javax.swing.JLabel labelButtonThemAnhPhuongAn1;
    private javax.swing.JLabel labelButtonThemAnhPhuongAn2;
    private javax.swing.JLabel labelButtonThemAnhPhuongAn3;
    private javax.swing.JLabel labelButtonThemAnhPhuongAn4;
    private javax.swing.JLabel labelButtonTroVe;
    private javax.swing.JLabel labelGioiTinh;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelMaCauHoi;
    public static javax.swing.JLabel labelMaCauHoiTuCSDL;
    private javax.swing.JLabel labelNoiDungCauHoi;
    private javax.swing.JLabel labelPhuongAn1;
    private javax.swing.JLabel labelPhuongAn2;
    private javax.swing.JLabel labelPhuongAn3;
    private javax.swing.JLabel labelPhuongAn4;
    private javax.swing.JLabel labelThemCauHoiIQ;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhCapNhatCauHoi;
    public static javax.swing.JTextField textFieldNoiDungCauHoi;
    public static javax.swing.JTextField textFieldPhuongAn1;
    public static javax.swing.JTextField textFieldPhuongAn2;
    public static javax.swing.JTextField textFieldPhuongAn3;
    public static javax.swing.JTextField textFieldPhuongAn4;
    // End of variables declaration//GEN-END:variables
}
