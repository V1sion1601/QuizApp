/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.user;

import DTO.*;
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
public class ManHinhCauHoi extends javax.swing.JFrame {

    public static ArrayList<QuestionDTO> questionlist;
    public static int i = 0;
    public static int dapAn = 0;
    public int counter = 10;
    public int tongDiem = 0;
//    public int dt = 0;

    /**
     * Creates new form ManHinhDangNhap
     */
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Delay 3 giây sau mỗi câu hỏi
            if (counter > -3) {
                labelDemNguocCauHoi.setText(Integer.toString(counter));
                counter--;
                if (counter < 0) {
                    labelDemNguocCauHoi.setText(Integer.toString(0));
                    //Trong trường hợp nếu người dùng nhập đáp án A đúng
                    if (questionlist.get(i).getOptionTrue().equals(buttonDapAnA.getText())) {

                        buttonDapAnA.setEnabled(true);
                        buttonDapAnA.setBackground(Color.green);
                        buttonDapAnA.setForeground(new Color(0, 0, 0));

                    } else {

                        buttonDapAnA.setEnabled(true);
                        buttonDapAnA.setBackground(Color.RED);
                        buttonDapAnA.setForeground(new Color(0, 0, 0));

                    }
                    //Trong trường hợp nếu người dùng nhập đáp án B đúng
                    if (questionlist.get(i).getOptionTrue().equals(buttonDapAnB.getText())) {

                        buttonDapAnB.setEnabled(true);
                        buttonDapAnB.setBackground(Color.green);
                        buttonDapAnB.setForeground(new Color(0, 0, 0));
                    } else {

                        buttonDapAnB.setEnabled(true);
                        buttonDapAnB.setBackground(Color.RED);
                        buttonDapAnB.setForeground(new Color(0, 0, 0));

                    }
                    //Trong trường hợp nếu người dùng nhập đáp án C đúng
                    if (questionlist.get(i).getOptionTrue().equals(buttonDapAnC.getText())) {
//                   

                        buttonDapAnC.setEnabled(true);
                        buttonDapAnC.setBackground(Color.green);
                        buttonDapAnC.setForeground(new Color(0, 0, 0));

                    } else {

                        buttonDapAnC.setEnabled(true);
                        buttonDapAnC.setBackground(Color.RED);
                        buttonDapAnC.setForeground(new Color(0, 0, 0));

                    }
                    //Trong trường hợp nếu người dùng nhập đáp án D đúng
                    if (questionlist.get(i).getOptionTrue().equals(buttonDapAnD.getText())) {
//               
                        buttonDapAnD.setEnabled(true);
                        buttonDapAnD.setBackground(Color.green);
                        buttonDapAnD.setForeground(new Color(0, 0, 0));

                    } else {

                        buttonDapAnD.setEnabled(true);
                        buttonDapAnD.setBackground(Color.RED);
                        buttonDapAnD.setForeground(new Color(0, 0, 0));

                    }

                    labelDiem.setText(Integer.toString(tongDiem));
                }
            } else {
                showQuestionToGUI(++i);
            }
        }
    });

    public static ArrayList<QuestionDTO> questionlist() {
        //DAO.QuestionDAO.quantityQuestion = Integer.parseInt(txtAdmin.getText());
        questionlist = new ArrayList<>(DAO.QuestionDAO.quantityQuestion);
        questionlist = DAO.QuestionDAO.getListQuestionByQuantity(DAO.QuestionDAO.quantityQuestion);

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
        counter = 10;
        timer.start();
        if (i < questionlist.size()) {
            String[] rq = {questionlist.get(i).getOption1(),
                questionlist.get(i).getOption2(),
                questionlist.get(i).getOption3(),
                questionlist.get(i).getOption4()};
            labelCauHoi.setText(questionlist.get(i).getContent());
            buttonDapAnA.setBackground(new Color(0, 102, 255));
            buttonDapAnA.setForeground(new Color(255, 255, 255));
            buttonDapAnA.setEnabled(true);

            buttonDapAnB.setBackground(new Color(0, 102, 255));
            buttonDapAnB.setForeground(new Color(255, 255, 255));
            buttonDapAnB.setEnabled(true);

            buttonDapAnC.setBackground(new Color(0, 102, 255));
            buttonDapAnC.setForeground(new Color(255, 255, 255));
            buttonDapAnC.setEnabled(true);

            buttonDapAnD.setBackground(new Color(0, 102, 255));
            buttonDapAnD.setForeground(new Color(255, 255, 255));
            buttonDapAnD.setEnabled(true);

            buttonDapAnA.setText(rq[arr.get(0)]);
            buttonDapAnB.setText(rq[arr.get(1)]);
            buttonDapAnC.setText(rq[arr.get(2)]);
            buttonDapAnD.setText(rq[arr.get(3)]);

        } else {
            JOptionPane.showMessageDialog(null, "Hoan thanh phan choi");
            this.setVisible(false);
            GUI.user.ManHinhChonCheDoChoi frame = new ManHinhChonCheDoChoi();
            frame.setVisible(true);
        }

    }

    public ManHinhCauHoi() {
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDapAnAMouseClicked(evt);
            }
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
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        buttonDapAnA.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_buttonDapAnAMouseEntered

    private void buttonDapAnAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnAMouseExited

        buttonDapAnA.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_buttonDapAnAMouseExited

    private void buttonDapAnBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnBMouseEntered

        buttonDapAnB.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_buttonDapAnBMouseEntered

    private void buttonDapAnBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnBMouseExited

        buttonDapAnB.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_buttonDapAnBMouseExited

    private void buttonDapAnCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnCMouseEntered

        buttonDapAnC.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_buttonDapAnCMouseEntered

    private void buttonDapAnCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnCMouseExited

        buttonDapAnC.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_buttonDapAnCMouseExited

    private void buttonDapAnDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnDMouseEntered

        buttonDapAnD.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_buttonDapAnDMouseEntered

    private void buttonDapAnDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnDMouseExited

        buttonDapAnD.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_buttonDapAnDMouseExited

    private void buttonDapAnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDapAnAActionPerformed
        // TODO add your handling code here:
        if (questionlist.get(i).getOptionTrue().equals(buttonDapAnA.getText())) {
            int dt = Integer.parseInt(labelDemNguocCauHoi.getText());
            tongDiem += dt;
        } else {
            tongDiem += 0;
        }

        buttonDapAnA.setForeground(Color.black);
        buttonDapAnA.setEnabled(false);

        buttonDapAnB.setEnabled(false);

        buttonDapAnC.setEnabled(false);

        buttonDapAnD.setEnabled(false);

//        dt = Integer.parseInt(labelDemNguocCauHoi.getText());
//        System.out.println(dt);

    }//GEN-LAST:event_buttonDapAnAActionPerformed

    private void buttonDapAnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDapAnBActionPerformed
        // TODO add your handling code here:
        if (questionlist.get(i).getOptionTrue().equals(buttonDapAnB.getText())) {
            int dt = Integer.parseInt(labelDemNguocCauHoi.getText());
            tongDiem += dt;

        } else {
            tongDiem += 0;
        }
        buttonDapAnB.setForeground(Color.black);

        buttonDapAnB.setEnabled(false);

        buttonDapAnA.setEnabled(false);

        buttonDapAnC.setEnabled(false);

        buttonDapAnD.setEnabled(false);


    }//GEN-LAST:event_buttonDapAnBActionPerformed

    private void buttonDapAnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDapAnCActionPerformed
        // TODO add your handling code here:
        if (questionlist.get(i).getOptionTrue().equals(buttonDapAnC.getText())) {
            int dt = Integer.parseInt(labelDemNguocCauHoi.getText());
            tongDiem += dt;

        } else {
            tongDiem += 0;
        }
        buttonDapAnC.setForeground(Color.black);

        buttonDapAnC.setEnabled(false);

        buttonDapAnB.setEnabled(false);

        buttonDapAnA.setEnabled(false);

        buttonDapAnD.setEnabled(false);


    }//GEN-LAST:event_buttonDapAnCActionPerformed

    private void buttonDapAnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDapAnDActionPerformed
        // TODO add your handling code here:
        if (questionlist.get(i).getOptionTrue().equals(buttonDapAnD.getText())) {
            int dt = Integer.parseInt(labelDemNguocCauHoi.getText());
            tongDiem += dt;
        } else {
            tongDiem += 0;
        }
        buttonDapAnD.setForeground(Color.black);

        buttonDapAnD.setEnabled(false);

        buttonDapAnB.setEnabled(false);

        buttonDapAnC.setEnabled(false);

        buttonDapAnA.setEnabled(false);


    }//GEN-LAST:event_buttonDapAnDActionPerformed

    private void buttonDapAnAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnAMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_buttonDapAnAMouseClicked

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
            java.util.logging.Logger.getLogger(ManHinhCauHoi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhCauHoi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
