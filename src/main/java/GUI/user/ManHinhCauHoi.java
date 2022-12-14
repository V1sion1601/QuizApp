/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.user;

import DTO.*;
import static GUI.user.ManHinhDangNhap.socket;
import ServerConfig.DataTransfer;
import ServerConfig.Server;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Timer;

import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author TUF
 */
public class ManHinhCauHoi extends javax.swing.JFrame {

    BufferedReader testIn = null;
    BufferedWriter testOut = null;

    public static ArrayList<QuestionDTO> questionlist;
    public static int i = 0;
    public static int dapAn = 0;
    public int counter = 10;
    public int tongDiem = 0;
    String oppoPoint = "0", oppoAnswer = "";
    StyledDocument documentStyle = null;
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
                    if (i < questionlist.size()) {
                        if (questionlist.get(i).getOptionTrue().equals(buttonDapAnA.getText())) {

                            buttonDapAnA.setEnabled(true);
                            buttonDapAnA.setBackground(Color.green);
                            buttonDapAnA.setForeground(new Color(0, 0, 0));

                        } else {

                            buttonDapAnA.setEnabled(true);
                            buttonDapAnA.setBackground(Color.RED);
                            buttonDapAnA.setForeground(new Color(0, 0, 0));

                        }   //Trong trường hợp nếu người dùng nhập đáp án B đúng
                        if (questionlist.get(i).getOptionTrue().equals(buttonDapAnB.getText())) {

                            buttonDapAnB.setEnabled(true);
                            buttonDapAnB.setBackground(Color.green);
                            buttonDapAnB.setForeground(new Color(0, 0, 0));
                        } else {

                            buttonDapAnB.setEnabled(true);
                            buttonDapAnB.setBackground(Color.RED);
                            buttonDapAnB.setForeground(new Color(0, 0, 0));

                        }   //Trong trường hợp nếu người dùng nhập đáp án C đúng
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

                        }   //Trong trường hợp nếu người dùng nhập đáp án D đúng
                        if (questionlist.get(i).getOptionTrue().equals(buttonDapAnD.getText())) {
                            buttonDapAnD.setEnabled(true);
                            buttonDapAnD.setBackground(Color.green);
                            buttonDapAnD.setForeground(new Color(0, 0, 0));

                        } else {

                            buttonDapAnD.setEnabled(true);
                            buttonDapAnD.setBackground(Color.RED);
                            buttonDapAnD.setForeground(new Color(0, 0, 0));

                        }
                        labelDiem.setText(Integer.toString(tongDiem));
                        labelDiem1.setText(oppoPoint);
                    }

                }
            } else {

                try {
                    ((Timer) e.getSource()).stop();
                    showQuestionToGUI(++i);
                    documentStyle.insertString(0, "Đối phương đã trả lời phương án: " + oppoAnswer + "\n", null);
                } catch (BadLocationException ex) {
                    Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    });

    public static ArrayList<QuestionDTO> questionlist() {
        ArrayList<QuestionDTO> questionlist2 = null;
        try {
            //DAO.QuestionDAO.quantityQuestion = Integer.parseInt(txtAdmin.getText());
            DataTransfer transfer = new DataTransfer();
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));

            Thread sendThread = new Thread(() -> {
                System.out.println("Send thread questions");
                transfer.setSend(socket, out, "play," + ManHinhDangNhap.nameClient);
                transfer.send.run();
            });
            Thread receiveThread = new Thread(() -> {
                ObjectInputStream inObject = null;
                try {
                    System.out.println("Receive thread questions");
                    inObject = new ObjectInputStream(ManHinhDangNhap.socket.getInputStream());
                    transfer.setReceiveObject(socket, inObject);
                    transfer.receiveObject.run();
                } catch (IOException ex) {
                    Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            sendThread.start();
            receiveThread.start();
            sendThread.join();
            receiveThread.join();
//            ObjectOutputStream outObject = new ObjectOutputStream(ManHinhDangNhap.socket.getOutputStream());
//            questionlist2 = (ArrayList<QuestionDTO>) inObject.readObject();
            questionlist2 = transfer.receiveObject.listQuestions;

            System.out.println("Question list: " + questionlist2.size());
        } catch (IOException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return questionlist2;
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

            try {
                DataTransfer transfer = new DataTransfer();
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
//                BufferedReader in = new BufferedReader(new InputStreamReader(ManHinhDangNhap.socket.getInputStream()));

                timer.stop();
                if (Integer.parseInt(labelDiem.getText()) > Integer.parseInt(labelDiem1.getText())) {
                    JOptionPane.showMessageDialog(null, "Bạn đã thắng");
                    transfer.setSend(socket, out, "win#" + labelDiem.getText());
                    transfer.send.run();

                } else if (Integer.parseInt(labelDiem.getText()) == Integer.parseInt(labelDiem1.getText())) {
                    JOptionPane.showMessageDialog(null, "Hòa");

                } else {
                    JOptionPane.showMessageDialog(null, "Bạn đã thua");
                    transfer.setSend(socket, out, "lose#" + labelDiem.getText());
                    transfer.send.run();
                }

//                DataTransfer transfer2 = new DataTransfer();
//                testOut = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
//                transfer2.setSend(ManHinhDangNhap.socket, testOut, "cancel#" + ManHinhDangNhap.nameClient);
//                transfer2.send.run();
                JOptionPane.showMessageDialog(null, "Hoan thanh phan choi");
                Server.seed = new Random().nextInt();
                dispose();
                new ManHinhChonCheDoChoi().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public ManHinhCauHoi() throws InterruptedException {

        i = 0;
        tongDiem = 0;
        initComponents();
        questionlist = questionlist();
        showQuestionToGUI(i);
        documentStyle = txtNguoiChoi.getStyledDocument();
        SimpleAttributeSet centerAttribute = new SimpleAttributeSet();
        StyleConstants.setAlignment(centerAttribute, StyleConstants.ALIGN_CENTER);
        documentStyle.setParagraphAttributes(0, documentStyle.getLength(), centerAttribute, false);
        txtNguoiChoi.setEnabled(false);
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
        buttonDapAnA = new javax.swing.JButton();
        buttonDapAnB = new javax.swing.JButton();
        buttonDapAnC = new javax.swing.JButton();
        buttonDapAnD = new javax.swing.JButton();
        labelDemNguocCauHoi = new javax.swing.JLabel();
        labelDiemHienTai = new javax.swing.JLabel();
        labelDiem = new javax.swing.JLabel();
        labelButtonTroVe = new javax.swing.JLabel();
        labelDiemHienTai1 = new javax.swing.JLabel();
        labelDiem1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelCauHoi = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNguoiChoi = new javax.swing.JTextPane();

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

        labelDiemHienTai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDiemHienTai.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelDiemHienTai.setText("Điểm hiện tại :");

        labelDiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDiem.setText("0");

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

        labelDiemHienTai1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDiemHienTai1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelDiemHienTai1.setText("Điểm đối thủ :");

        labelDiem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDiem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDiem1.setText("0");

        jScrollPane1.setBorder(null);

        labelCauHoi.setEditable(false);
        labelCauHoi.setBackground(new java.awt.Color(255, 255, 255));
        labelCauHoi.setBorder(null);
        labelCauHoi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelCauHoi.setText("[Vị trí đặt câu hỏi]");
        jScrollPane1.setViewportView(labelCauHoi);

        jScrollPane3.setViewportView(txtNguoiChoi);

        javax.swing.GroupLayout panelManHinhCauHoiLayout = new javax.swing.GroupLayout(panelManHinhCauHoi);
        panelManHinhCauHoi.setLayout(panelManHinhCauHoiLayout);
        panelManHinhCauHoiLayout.setHorizontalGroup(
            panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelButtonTroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDemNguocCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addComponent(labelDiemHienTai1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDiem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(320, 320, 320)
                        .addComponent(labelDiemHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(labelKienThuc)
                    .addComponent(labelButtonTroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDiemHienTai1)
                        .addComponent(labelDiem1))
                    .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDiemHienTai)
                        .addComponent(labelDiem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDemNguocCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDapAnA, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDapAnB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDapAnC, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDapAnD, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
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
        try {
            int decision = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất không");
            if (decision == JOptionPane.YES_OPTION) {
                DataTransfer transfer = new DataTransfer();
                BufferedWriter testOut = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
                transfer.setSend(ManHinhDangNhap.socket, testOut, "bye");
                transfer.send.run();
            }
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ManHinhDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        }

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

        try {
            // TODO add your handling code here:
            DataTransfer transfer = new DataTransfer();
            BufferedReader in2 = new BufferedReader(new InputStreamReader(ManHinhDangNhap.socket.getInputStream()));
            BufferedWriter out2 = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
            System.out.println("Client name: " + ManHinhDangNhap.nameClient);
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
            Thread sendThread = new Thread(() -> {
                System.out.println("Send Thread Point");
                transfer.setSend(ManHinhDangNhap.socket, out2, "point#" + tongDiem + "`A" + "," + ManHinhDangNhap.nameClient);
                transfer.send.run();
            });
            Thread receiveThread = new Thread(() -> {
                System.out.println("Receive Thread Point");

                transfer.setReceiveMode(ManHinhDangNhap.socket, in2);
                transfer.receiveMode.run();
            });
            sendThread.start();
            receiveThread.start();
            sendThread.join();
            receiveThread.join();
            String[] oppo = transfer.receiveMode.userData.split("`");
            oppoPoint = oppo[0];
            oppoAnswer = oppo[1];

            System.out.println("Test oppo point: " + transfer.receiveMode.userData);
            documentStyle.insertString(0, "Bạn đã trả lời phương án: A" + "\n", null);

        } catch (IOException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadLocationException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_buttonDapAnAActionPerformed

    private void buttonDapAnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDapAnBActionPerformed

        try {
            // TODO add your handling code here:
            DataTransfer transfer = new DataTransfer();
            BufferedReader in2 = new BufferedReader(new InputStreamReader(ManHinhDangNhap.socket.getInputStream()));
            BufferedWriter out2 = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
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
            Thread sendThread = new Thread(() -> {
                System.out.println("Send Thread Point");
                transfer.setSend(ManHinhDangNhap.socket, out2, "point#" + tongDiem + "`B" + "," + ManHinhDangNhap.nameClient);
                transfer.send.run();
            });
            Thread receiveThread = new Thread(() -> {
                System.out.println("Receive Thread Point");

                transfer.setReceiveMode(ManHinhDangNhap.socket, in2);
                transfer.receiveMode.run();
            });
            sendThread.start();
            receiveThread.start();
            sendThread.join();
            receiveThread.join();
            String[] oppo = transfer.receiveMode.userData.split("`");
            oppoPoint = oppo[0];
            oppoAnswer = oppo[1];

            System.out.println("Test oppo point: " + transfer.receiveMode.userData);
            documentStyle.insertString(0, "Bạn đã trả lời phương án: B" + "\n", null);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadLocationException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buttonDapAnBActionPerformed

    private void buttonDapAnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDapAnCActionPerformed

        try {
            // TODO add your handling code here:
            DataTransfer transfer = new DataTransfer();
            BufferedReader in2 = new BufferedReader(new InputStreamReader(ManHinhDangNhap.socket.getInputStream()));
            BufferedWriter out2 = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
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
            Thread sendThread = new Thread(() -> {
                System.out.println("Send Thread Point");
                transfer.setSend(ManHinhDangNhap.socket, out2, "point#" + tongDiem + "`C" + "," + ManHinhDangNhap.nameClient);
                transfer.send.run();
            });
            Thread receiveThread = new Thread(() -> {
                System.out.println("Receive Thread Point");

                transfer.setReceiveMode(ManHinhDangNhap.socket, in2);
                transfer.receiveMode.run();
            });
            sendThread.start();
            receiveThread.start();
            sendThread.join();
            receiveThread.join();
            String[] oppo = transfer.receiveMode.userData.split("`");
            oppoPoint = oppo[0];
            oppoAnswer = oppo[1];

            System.out.println("Test oppo point: " + transfer.receiveMode.userData);
            documentStyle.insertString(0, "Bạn đã trả lời phương án: C" + "\n", null);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadLocationException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buttonDapAnCActionPerformed

    private void buttonDapAnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDapAnDActionPerformed
        try {
            // TODO add your handling code here:
            DataTransfer transfer = new DataTransfer();
            BufferedReader in2 = new BufferedReader(new InputStreamReader(ManHinhDangNhap.socket.getInputStream()));
            BufferedWriter out2 = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
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
            Thread sendThread = new Thread(() -> {
                System.out.println("Send Thread Point");
                transfer.setSend(ManHinhDangNhap.socket, out2, "point#" + tongDiem + "`D" + "," + ManHinhDangNhap.nameClient);
                transfer.send.run();
            });
            Thread receiveThread = new Thread(() -> {
                System.out.println("Receive Thread Point");

                transfer.setReceiveMode(ManHinhDangNhap.socket, in2);
                transfer.receiveMode.run();
            });
            sendThread.start();
            receiveThread.start();
            sendThread.join();
            receiveThread.join();
            String[] oppo = transfer.receiveMode.userData.split("`");
            oppoPoint = oppo[0];
            oppoAnswer = oppo[1];

            System.out.println("Test oppo point: " + transfer.receiveMode.userData);
            documentStyle.insertString(0, "Bạn đã trả lời phương án: D" + "\n", null);
        } catch (InterruptedException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadLocationException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonDapAnDActionPerformed

    private void buttonDapAnAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDapAnAMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_buttonDapAnAMouseClicked

    private void labelButtonTroVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTroVeMouseClicked
        // TODO add your handling code here:
        GUI.user.ManHinhChonCheDoChoi frame = null;
        try {
            frame = new ManHinhChonCheDoChoi();
        } catch (IOException ex) {
            Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        frame.setVisible(true);
        this.setVisible(false);
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
                try {
                    new ManHinhCauHoi().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ManHinhCauHoi.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDapAnA;
    private javax.swing.JButton buttonDapAnB;
    private javax.swing.JButton buttonDapAnC;
    private javax.swing.JButton buttonDapAnD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelButtonTroVe;
    private javax.swing.JTextPane labelCauHoi;
    private javax.swing.JLabel labelDemNguocCauHoi;
    private javax.swing.JLabel labelDiem;
    private javax.swing.JLabel labelDiem1;
    private javax.swing.JLabel labelDiemHienTai;
    private javax.swing.JLabel labelDiemHienTai1;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhCauHoi;
    private javax.swing.JTextPane txtNguoiChoi;
    // End of variables declaration//GEN-END:variables
}
