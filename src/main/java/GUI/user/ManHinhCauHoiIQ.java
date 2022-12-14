/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.user;

import DTO.QuestionDTO;
import static GUI.user.ManHinhDangNhap.socket;
import ServerConfig.DataTransfer;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
    public ArrayList<String> listAnswer = null;

    /**
     * Creates new form ManHinhDangNhap
     */
    public static ArrayList<QuestionDTO> questionlist() {
        ArrayList<QuestionDTO> questionlist2 = null;
        try {
            //DAO.QuestionDAO.quantityQuestion = Integer.parseInt(txtAdmin.getText());
            DataTransfer transfer = new DataTransfer();
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));

            Thread sendThread = new Thread(() -> {
                System.out.println("Send thread questions");
                transfer.setSend(socket, out, "iq," + ManHinhDangNhap.nameClient);
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

        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        Collections.shuffle(array, new Random(3));
        return array;
    }

    public void showQuestionToGUI(int i) throws IOException {
        List<Integer> arr = createRandom();
        labelIQ.setText(Integer.toString(tongIQ));

        if (i < questionlist.size()) {

            BufferedImage imgContent = ImageIO.read(new FileInputStream("resources/" + questionlist.get(i).getContent()));
            BufferedImage img1 = ImageIO.read(new FileInputStream("resources/" + questionlist.get(i).getOption1()));
            BufferedImage img2 = ImageIO.read(new FileInputStream("resources/" + questionlist.get(i).getOption2()));
            BufferedImage img3 = ImageIO.read(new FileInputStream("resources/" + questionlist.get(i).getOption3()));
            BufferedImage img4 = ImageIO.read(new FileInputStream("resources/" + questionlist.get(i).getOption4()));

            ImageIcon iconContent = new ImageIcon(new ImageIcon(imgContent).getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT));
            ImageIcon icon1 = new ImageIcon(new ImageIcon(img1).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            ImageIcon icon2 = new ImageIcon(new ImageIcon(img2).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            ImageIcon icon3 = new ImageIcon(new ImageIcon(img3).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            ImageIcon icon4 = new ImageIcon(new ImageIcon(img4).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

            listAnswer = new ArrayList<String>();
            listAnswer.add(questionlist.get(i).getOption1());
            listAnswer.add(questionlist.get(i).getOption2());
            listAnswer.add(questionlist.get(i).getOption3());
            listAnswer.add(questionlist.get(i).getOption4());

            labelDapAnA.setVisible(true);
            labelDapAnB.setVisible(true);
            labelDapAnC.setVisible(true);
            labelDapAnD.setVisible(true);

            labelHinhAnhCauHoi.setIcon(iconContent);
            labelDapAnA.setIcon(icon1);
            labelDapAnB.setIcon(icon2);
            labelDapAnC.setIcon(icon3);
            labelDapAnD.setIcon(icon4);

//            labelDapAnA.setText(rq[arr.get(0)]);
//            labelDapAnB.setText(rq[arr.get(1)]);
//            labelDapAnC.setText(rq[arr.get(2)]);
//            labelDapAnD.setText(rq[arr.get(3)]);
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
//            GUI.user.ManHinhChonCheDoChoi frame = new ManHinhChonCheDoChoi();
//            frame.setVisible(true);
        }
    }

    public ManHinhCauHoiIQ() throws IOException {
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
        panelManHinhCauHoi.setMaximumSize(new java.awt.Dimension(100, 100));

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
        labelHinhAnhCauHoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelDiemIQHienTai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelDiemIQHienTai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDiemIQHienTai.setText("Điểm IQ:");

        labelIQ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelIQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIQ.setText("0");

        labelDapAnA.setBackground(new java.awt.Color(255, 255, 255));
        labelDapAnA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDapAnA.setForeground(new java.awt.Color(255, 255, 255));
        labelDapAnA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDapAnA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelDapAnA.setMaximumSize(new java.awt.Dimension(100, 100));
        labelDapAnA.setMinimumSize(new java.awt.Dimension(100, 100));
        labelDapAnA.setOpaque(true);
        labelDapAnA.setPreferredSize(new java.awt.Dimension(100, 100));
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

        labelDapAnB.setBackground(new java.awt.Color(255, 255, 255));
        labelDapAnB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDapAnB.setForeground(new java.awt.Color(255, 255, 255));
        labelDapAnB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDapAnB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelDapAnB.setOpaque(true);
        labelDapAnB.setPreferredSize(new java.awt.Dimension(0, 0));
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

        labelDapAnC.setBackground(new java.awt.Color(255, 255, 255));
        labelDapAnC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDapAnC.setForeground(new java.awt.Color(255, 255, 255));
        labelDapAnC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDapAnC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        labelDapAnD.setBackground(new java.awt.Color(255, 255, 255));
        labelDapAnD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDapAnD.setForeground(new java.awt.Color(255, 255, 255));
        labelDapAnD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDapAnD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTranhTai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelKienThuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelButtonTroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                                .addComponent(labelDiemIQHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelIQ, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelHinhAnhCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelDapAnA, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(labelDapAnD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDapAnC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDapAnB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)))
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
                .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelManHinhCauHoiLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(labelDapAnA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(labelDapAnB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(labelDapAnC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(labelDapAnD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(labelBanQuyenThuocVe)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManHinhCauHoiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelManHinhCauHoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDiemIQHienTai)
                            .addComponent(labelIQ))
                        .addGap(51, 51, 51)
                        .addComponent(labelHinhAnhCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhCauHoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelManHinhCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void labelDapAnAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnAMouseEntered

        labelDapAnA.setBackground(new Color(160, 160, 160));
    }//GEN-LAST:event_labelDapAnAMouseEntered

    private void labelDapAnAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnAMouseExited

        labelDapAnA.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelDapAnAMouseExited

    private void labelDapAnBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnBMouseEntered

        labelDapAnB.setBackground(new Color(160, 160, 160));
    }//GEN-LAST:event_labelDapAnBMouseEntered

    private void labelDapAnBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnBMouseExited

        labelDapAnB.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelDapAnBMouseExited

    private void labelDapAnCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnCMouseEntered

        labelDapAnC.setBackground(new Color(160, 160, 160));
    }//GEN-LAST:event_labelDapAnCMouseEntered

    private void labelDapAnCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnCMouseExited

        labelDapAnC.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelDapAnCMouseExited

    private void labelDapAnDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnDMouseEntered

        labelDapAnD.setBackground(new Color(160, 160, 160));
    }//GEN-LAST:event_labelDapAnDMouseEntered

    private void labelDapAnDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnDMouseExited

        labelDapAnD.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelDapAnDMouseExited

    private void labelDapAnAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnAMouseClicked
        if (questionlist.get(i).getOptionTrue().equals(listAnswer.get(0))) {
            int diem = 20;
            tongIQ += diem;
            System.out.println("đúng");

            labelDapAnA.setVisible(true);
        } else {

            System.out.println("False");
            tongIQ += 0;
            labelDapAnB.setVisible(false);

            labelDapAnC.setVisible(false);

            labelDapAnD.setVisible(false);
        }
        try {
            showQuestionToGUI(++i);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhCauHoiIQ.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_labelDapAnAMouseClicked

    private void labelDapAnBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnBMouseClicked
        System.out.println(listAnswer.get(1));
        if (questionlist.get(i).getOptionTrue().equals(listAnswer.get(1))) {
            int diem = 20;
            tongIQ += diem;
            System.out.println("true");
            labelDapAnB.setVisible(true);

        } else {
            System.out.println("False");
            tongIQ += 0;
            labelDapAnA.setVisible(false);

            labelDapAnC.setVisible(false);

            labelDapAnD.setVisible(false);
        }

        try {
            showQuestionToGUI(++i);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhCauHoiIQ.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_labelDapAnBMouseClicked

    private void labelDapAnCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnCMouseClicked
        if (questionlist.get(i).getOptionTrue().equals(listAnswer.get(2))) {
            int diem = 20;
            tongIQ += diem;
            labelDapAnC.setVisible(true);

        } else {
            tongIQ += 0;
            System.out.println("False");
            labelDapAnB.setVisible(false);

            labelDapAnA.setVisible(false);

            labelDapAnD.setVisible(false);
        }
        try {
            showQuestionToGUI(++i);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhCauHoiIQ.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_labelDapAnCMouseClicked

    private void labelDapAnDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDapAnDMouseClicked
        if (questionlist.get(i).getOptionTrue().equals(listAnswer.get(3))) {
            int diem = 20;
            tongIQ += diem;
            labelDapAnD.setVisible(true);
        } else {
            tongIQ += 0;
            System.out.println("False");
            labelDapAnB.setVisible(false);

            labelDapAnC.setVisible(false);

            labelDapAnA.setVisible(false);
        }
        try {
            showQuestionToGUI(++i);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhCauHoiIQ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelDapAnDMouseClicked

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
                try {
                    new ManHinhCauHoiIQ().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ManHinhCauHoiIQ.class.getName()).log(Level.SEVERE, null, ex);
                }
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
