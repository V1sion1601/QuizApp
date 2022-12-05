/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.user;

import DTO.QuestionDTO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.JOptionPane;

/**
 *
 * @author TUF
 */
public class ManHinhCauHoiIQ extends javax.swing.JFrame {

    public static ArrayList<QuestionDTO> questionlist;
    public static int dapAnCauHoiIQ = 0;
    public static int i = 0;
    public int tongIQ = 50;

    /**
     * Creates new form ManHinhDangNhap
     */
//    Timer timer = new Timer(3000, new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            timer.start();
//            if (questionlist.get(i).getOptionTrue().equals(labelDapAnA.getText())) {
//                labelDapAnA.setVisible(true);
//                labelDapAnA.setBackground(Color.green);
//                labelDapAnA.setForeground(new Color(0, 0, 0));
//            } else {
//                labelDapAnA.setVisible(true);
//                labelDapAnA.setBackground(Color.RED);
//                labelDapAnA.setForeground(new Color(0, 0, 0));
//            }
//            //Trong trường hợp nếu người dùng nhập đáp án B đúng
//            if (questionlist.get(i).getOptionTrue().equals(labelDapAnB.getText())) {
//                labelDapAnB.setVisible(true);
//                labelDapAnB.setBackground(Color.green);
//                labelDapAnB.setForeground(new Color(0, 0, 0));
//            } else {
//                labelDapAnB.setVisible(true);
//                labelDapAnB.setBackground(Color.RED);
//                labelDapAnB.setForeground(new Color(0, 0, 0));
//            }
//            //Trong trường hợp nếu người dùng nhập đáp án C đúng
//            if (questionlist.get(i).getOptionTrue().equals(labelDapAnC.getText())) {
//                labelDapAnC.setVisible(true);
//                labelDapAnC.setBackground(Color.green);
//                labelDapAnC.setForeground(new Color(0, 0, 0));
//            } else {
//                labelDapAnC.setVisible(true);
//                labelDapAnC.setBackground(Color.RED);
//                labelDapAnC.setForeground(new Color(0, 0, 0));
//            }
//            //Trong trường hợp nếu người dùng nhập đáp án D đúng
//            if (questionlist.get(i).getOptionTrue().equals(labelDapAnD.getText())) {
//                labelDapAnD.setVisible(true);
//                labelDapAnD.setBackground(Color.green);
//                labelDapAnD.setForeground(new Color(0, 0, 0));
//            } else {
//                labelDapAnD.setVisible(true);
//                labelDapAnD.setBackground(Color.RED);
//                labelDapAnD.setForeground(new Color(0, 0, 0));
//            }
//
//            labelIQ.setText(Integer.toString(tongIQ));
//
//            showQuestionToGUI(++i);
//        }
//    });
//    class MouseClick implements MouseListener {
//        @Override
//        public void mouseClicked(MouseEvent e){
//            
//        }
//    }
    public static ArrayList<QuestionDTO> questionlist() {
        //DAO.QuestionDAO.quantityQuestion = Integer.parseInt(txtAdmin.getText());
        questionlist = new ArrayList<>(DAO.QuestionIQDAO.quantityQuestion);
        questionlist = DAO.QuestionIQDAO.getListQuestionByQuantity(DAO.QuestionIQDAO.quantityQuestion);

        return questionlist;
    }

    public static ArrayList<Integer> createRandom() {
        Random rd = new Random();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) {
            array.add(i);
        }
        Collections.shuffle(array, new Random(3));
        return array;
    }

    public void showQuestionToGUI(int i) {
        List<Integer> arr = createRandom();
        labelIQ.setText(Integer.toString(tongIQ));

//        timer.start();
        if (i < questionlist.size()) {
            String[] rq = {questionlist.get(i).getOption1(),
                questionlist.get(i).getOption2(),
                questionlist.get(i).getOption3(),
                questionlist.get(i).getOption4()
            };
            labelHinhAnhCauHoi.setText(questionlist.get(i).getContent());
            labelDapAnA.setBackground(new Color(0, 102, 255));
            labelDapAnA.setForeground(new Color(255, 255, 255));
            labelDapAnA.setVisible(true);

            labelDapAnB.setBackground(new Color(0, 102, 255));
            labelDapAnB.setForeground(new Color(255, 255, 255));
            labelDapAnB.setVisible(true);

            labelDapAnC.setBackground(new Color(0, 102, 255));
            labelDapAnC.setForeground(new Color(255, 255, 255));
            labelDapAnC.setVisible(true);

            labelDapAnD.setBackground(new Color(0, 102, 255));
            labelDapAnD.setForeground(new Color(255, 255, 255));
            labelDapAnD.setVisible(true);

            labelDapAnA.setText(rq[arr.get(0)]);
            labelDapAnB.setText(rq[arr.get(1)]);
            labelDapAnC.setText(rq[arr.get(2)]);
            labelDapAnD.setText(rq[arr.get(3)]);

        } else {
            if (tongIQ < 70) {
                JOptionPane.showMessageDialog(null, "Hoàn thành phần chơi IQ \n Chỉ số IQ rất thấp!");
            } else if (tongIQ < 85) {
                JOptionPane.showMessageDialog(null, "Hoàn thành phần chơi IQ \n Chỉ số IQ thấp!");
            } else if (tongIQ > 85 && tongIQ < 115) {
                JOptionPane.showMessageDialog(null, "Hoàn thành phần chơi IQ \n Chỉ số IQ bình thường!");
            } else if (tongIQ > 115 && tongIQ < 130) {
                JOptionPane.showMessageDialog(null, "Hoàn thành phần chơi IQ \n Chỉ số IQ thuộc loại thông minh!");
            } else if (tongIQ > 130 && tongIQ < 145) {
                JOptionPane.showMessageDialog(null, "Hoàn thành phần chơi IQ \n Chỉ số IQ thuộc loại rất thông minh!");
            } else if (tongIQ > 145) {
                JOptionPane.showMessageDialog(null, "Hoàn thành phần chơi IQ \n Chỉ số IQ thuộc loại thiên tài hoặc cận thiên tài!");
            }
            this.setVisible(false);
            GUI.user.ManHinhChonCheDoChoi frame = new ManHinhChonCheDoChoi();
            frame.setVisible(true);
        }
    }

    public ManHinhCauHoiIQ() {
        initComponents();
        questionlist = questionlist();
        showQuestionToGUI(i);
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
        labelDiemIQHienTai = new javax.swing.JLabel();
        labelIQ = new javax.swing.JLabel();
        labelDapAnA = new javax.swing.JLabel();
        labelDapAnB = new javax.swing.JLabel();
        labelDapAnC = new javax.swing.JLabel();
        labelDapAnD = new javax.swing.JLabel();
        labelButtonTroVe = new javax.swing.JLabel();

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

        labelDiemIQHienTai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDiemIQHienTai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDiemIQHienTai.setText("Điểm IQ:");

        labelIQ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelIQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIQ.setText("0");

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

        labelButtonTroVe.setBackground(new java.awt.Color(204, 204, 204));
        labelButtonTroVe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelButtonTroVe.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonTroVe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonTroVe.setText("<---");
        labelButtonTroVe.setToolTipText("Thoát");
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

        javax.swing.GroupLayout panelManHinhCauHoiLayout = new javax.swing.GroupLayout(panelManHinhCauHoi);
        panelManHinhCauHoi.setLayout(panelManHinhCauHoiLayout);
        panelManHinhCauHoiLayout.setHorizontalGroup(
            panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManHinhCauHoiLayout.createSequentialGroup()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelButtonTroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManHinhCauHoiLayout.createSequentialGroup()
                        .addComponent(labelHinhAnhCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                                .addComponent(labelDiemIQHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelIQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelDapAnB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelDapAnC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelDapAnD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelDapAnA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelManHinhCauHoiLayout.setVerticalGroup(
            panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTranhTai)
                    .addComponent(labelKienThuc)
                    .addComponent(labelButtonTroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDiemIQHienTai)
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

        labelDapAnA.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_labelDapAnAMouseEntered

    private void labelDapAnAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnAMouseExited

        labelDapAnA.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelDapAnAMouseExited

    private void labelDapAnBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnBMouseEntered

        labelDapAnB.setBackground(new Color(0, 0, 204));


    }//GEN-LAST:event_labelDapAnBMouseEntered

    private void labelDapAnBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnBMouseExited

        labelDapAnB.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelDapAnBMouseExited

    private void labelDapAnCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnCMouseEntered

        labelDapAnC.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_labelDapAnCMouseEntered

    private void labelDapAnCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnCMouseExited

        labelDapAnC.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelDapAnCMouseExited

    private void labelDapAnDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnDMouseEntered

        labelDapAnD.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_labelDapAnDMouseEntered

    private void labelDapAnDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnDMouseExited

        labelDapAnD.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelDapAnDMouseExited

    private void labelDapAnAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnAMouseClicked
        if (questionlist.get(i).getOptionTrue().equals(labelDapAnA.getText())) {
            int diem = 20;
            tongIQ += diem;
            labelDapAnA.setVisible(true);

        } else {
            System.out.println("False");
            tongIQ += 0;
            labelDapAnB.setVisible(false);

            labelDapAnC.setVisible(false);

            labelDapAnD.setVisible(false);
        }
        showQuestionToGUI(++i);

    }//GEN-LAST:event_labelDapAnAMouseClicked

    private void labelDapAnBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnBMouseClicked
        if (questionlist.get(i).getOptionTrue().equals(labelDapAnB.getText())) {
            int diem = 20;
            tongIQ += diem;
            labelDapAnB.setVisible(true);
        } else {
            System.out.println("False");
            tongIQ += 0;
            labelDapAnA.setVisible(false);

            labelDapAnC.setVisible(false);

            labelDapAnD.setVisible(false);
        }

        showQuestionToGUI(++i);

    }//GEN-LAST:event_labelDapAnBMouseClicked

    private void labelDapAnCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnCMouseClicked
        if (questionlist.get(i).getOptionTrue().equals(labelDapAnC.getText())) {
            int diem = 20;
            tongIQ += diem;
            labelDapAnC.setVisible(true);

        } else {
            tongIQ += 0;
            labelDapAnB.setVisible(false);

            labelDapAnA.setVisible(false);

            labelDapAnD.setVisible(false);
        }
        showQuestionToGUI(++i);


    }//GEN-LAST:event_labelDapAnCMouseClicked

    private void labelDapAnDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnDMouseClicked
        if (questionlist.get(i).getOptionTrue().equals(labelDapAnD.getText())) {
            int diem = 20;
            tongIQ += diem;
            labelDapAnD.setVisible(true);
        } else {
            tongIQ += 0;
            labelDapAnB.setVisible(false);

            labelDapAnC.setVisible(false);

            labelDapAnA.setVisible(false);
        }
        showQuestionToGUI(++i);
    }//GEN-LAST:event_labelDapAnDMouseClicked

    private void labelButtonTroVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTroVeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelButtonTroVeMouseClicked

    private void labelButtonTroVeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTroVeMouseEntered
        labelButtonTroVe.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_labelButtonTroVeMouseEntered

    private void labelButtonTroVeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTroVeMouseExited
        labelButtonTroVe.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_labelButtonTroVeMouseExited

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
            java.util.logging.Logger.getLogger(ManHinhCauHoiIQ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoiIQ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoiIQ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoiIQ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel labelButtonTroVe;
    private javax.swing.JLabel labelDapAnA;
    private javax.swing.JLabel labelDapAnB;
    private javax.swing.JLabel labelDapAnC;
    private javax.swing.JLabel labelDapAnD;
    private javax.swing.JLabel labelDiemIQHienTai;
    private javax.swing.JLabel labelHinhAnhCauHoi;
    private javax.swing.JLabel labelIQ;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhCauHoi;
    // End of variables declaration//GEN-END:variables
}
