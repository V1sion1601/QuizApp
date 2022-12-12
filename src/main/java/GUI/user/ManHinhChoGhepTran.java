/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.user;

import ServerConfig.ClientHandler;
import ServerConfig.DataTransfer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import GUI.user.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author TUF
 */
public class ManHinhChoGhepTran extends javax.swing.JFrame {

    /**
     * Creates new form ManHinhChoGhepTran
     */
    int counter = 10, flag = 0;
    String test = "";
    DataTransfer transfer = new DataTransfer();
    BufferedReader in = new BufferedReader(new InputStreamReader(ManHinhDangNhap.socket.getInputStream()));
    public static ArrayList<String> arrListPlayers = null;

    public String[] splitPlayer(String listPlayers) {
        System.out.println("Test split");
        String[] list = null;
        listPlayers = listPlayers.replaceAll("\\p{P}", "");
        list = listPlayers.split("");
        return list;
    }

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
//                DataTransfer transfer = new DataTransfer();
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));

                labelDemNguoc.setText(Integer.toString(counter));
                counter--;
                if (counter <= -2) {
                    DataTransfer transfer2 = new DataTransfer();
                    labelDemNguoc.setText(Integer.toString(0));
                    BufferedWriter out2 = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
                    BufferedReader in2 = new BufferedReader(new InputStreamReader(ManHinhDangNhap.socket.getInputStream()));
                    timer.stop();
                    System.out.println("User " + ManHinhDangNhap.nameClient + "đã hủy kèo");
                    int optionType = JOptionPane.OK_CANCEL_OPTION;
                    int result = JOptionPane.showConfirmDialog(null, "Không tìm thấy đối thủ", "Không tìm thấy", optionType);
                    if (result == JOptionPane.OK_OPTION) {
                        System.out.println("Send Thread Cancel");
                        Thread sendThread = new Thread(() -> {
                            transfer2.setSend(ManHinhDangNhap.socket, out2, "cancel#" + ManHinhDangNhap.nameClient);
                            transfer2.send.run();
                        });
                        Thread receiveThread = new Thread(() -> {
                            System.out.println("Receive Thread");
                            transfer2.setReceiveMode(ManHinhDangNhap.socket, in2);
                            transfer2.receiveMode.run();
                        });
                        sendThread.start();
                        receiveThread.start();
                        sendThread.join();
                        receiveThread.join();
                        dispose();
                        new ManHinhChonCheDoChoi().setVisible(true);
                    }
                } else {

                    System.out.println("Test receive: " + in.readLine());
                    String[] listPlayers = splitPlayer(in.readLine());
                    arrListPlayers = new ArrayList<>(Arrays.asList(listPlayers));
                    System.out.println("length: " + arrListPlayers.size());
                    if (arrListPlayers.size() >= 2) {

                        ((Timer) e.getSource()).stop();

//                        System.out.println("Found");
//                        DataTransfer transfer2 = new DataTransfer();
//                        BufferedWriter out2 = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
//                        BufferedReader in2 = new BufferedReader(new InputStreamReader(ManHinhDangNhap.socket.getInputStream()));
//                        Thread sendThread = new Thread(() -> {
//
//                            transfer2.setSend(ManHinhDangNhap.socket, out2, "match#" + ManHinhDangNhap.nameClient + "," + arrListPlayers.get(0));
//                            transfer2.send.run();
//                        });
//                        Thread receiveThread = new Thread(() -> {
//
//                            transfer2.setReceiveMode(ManHinhDangNhap.socket, in2);
//                            transfer2.receiveMode.run();
//
//                        });
//                        sendThread.start();
//                        receiveThread.start();
//                        sendThread.join();
//                        receiveThread.join();
//
//                        System.out.println("Test match array: " + transfer2.receiveMode.userData);
//                        System.out.println("After thread");
//                        for (String test : arrListPlayers) {
//                            System.out.println("User: " + test);
//                        }
//                        if (transfer2.receiveMode.userData != null) {
//                            BufferedWriter outCancel = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
//                            BufferedReader inCancel = new BufferedReader(new InputStreamReader(ManHinhDangNhap.socket.getInputStream()));
//                            int optionType2 = JOptionPane.OK_CANCEL_OPTION;
                        int input = JOptionPane.showOptionDialog(null, "Đã tìm thấy đối thử", "Thông báo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

                        if (input == JOptionPane.OK_OPTION) {
//                            DataTransfer transfer = new DataTransfer();
//                            BufferedWriter testOut = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
//                            transfer.setSend(ManHinhDangNhap.socket, testOut, "cancel#" + ManHinhDangNhap.nameClient);
//                            transfer.send.run();                 
                            dispose();
                            new ManHinhCauHoi().setVisible(true);
                        }


                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(ManHinhChoGhepTran.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(ManHinhChoGhepTran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });

    public ManHinhChoGhepTran() throws InterruptedException, IOException {
        initComponents();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));

//        DataTransfer transfer = new DataTransfer();
        timer.start();
        Thread sendThread = new Thread(() -> {
            System.out.println("Send Thread Random");
            transfer.setSend(ManHinhDangNhap.socket, out, "queue#" + ManHinhDangNhap.nameClient);
            transfer.send.run();
        });
        sendThread.start();
        sendThread.join();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChoGhepTran = new javax.swing.JPanel();
        labelDangTai = new javax.swing.JLabel();
        buttonHuyCho = new javax.swing.JButton();
        labelDemNguoc = new javax.swing.JLabel();
        buttonKiemTraIQ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelChoGhepTran.setBackground(new java.awt.Color(255, 255, 255));

        labelDangTai.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelDangTai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDangTai.setText("Đang tìm đối thủ, vui lòng chờ.");

        buttonHuyCho.setBackground(new java.awt.Color(220, 20, 60));
        buttonHuyCho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonHuyCho.setForeground(new java.awt.Color(255, 255, 255));
        buttonHuyCho.setText("Huỷ chờ");
        buttonHuyCho.setToolTipText("Huỷ chờ");
        buttonHuyCho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHuyChoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonHuyChoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonHuyChoMouseExited(evt);
            }
        });

        labelDemNguoc.setText(String.valueOf(counter));
        labelDemNguoc.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelDemNguoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonKiemTraIQ.setBackground(new java.awt.Color(0, 102, 255));
        buttonKiemTraIQ.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonKiemTraIQ.setForeground(new java.awt.Color(255, 255, 255));
        buttonKiemTraIQ.setText("Kiểm tra IQ");
        buttonKiemTraIQ.setToolTipText("Huỷ chờ");
        buttonKiemTraIQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonKiemTraIQMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonKiemTraIQMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonKiemTraIQMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelChoGhepTranLayout = new javax.swing.GroupLayout(panelChoGhepTran);
        panelChoGhepTran.setLayout(panelChoGhepTranLayout);
        panelChoGhepTranLayout.setHorizontalGroup(
            panelChoGhepTranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChoGhepTranLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelChoGhepTranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDemNguoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDangTai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelChoGhepTranLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(buttonKiemTraIQ, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonHuyCho, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChoGhepTranLayout.setVerticalGroup(
            panelChoGhepTranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChoGhepTranLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelDangTai)
                .addGap(18, 18, 18)
                .addComponent(labelDemNguoc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelChoGhepTranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHuyCho)
                    .addComponent(buttonKiemTraIQ))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelChoGhepTran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelChoGhepTran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHuyChoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHuyChoMouseEntered
        buttonHuyCho.setBackground(new Color(178, 34, 34));
    }//GEN-LAST:event_buttonHuyChoMouseEntered

    private void buttonHuyChoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHuyChoMouseExited
        buttonHuyCho.setBackground(new Color(220, 20, 60));
    }//GEN-LAST:event_buttonHuyChoMouseExited

    private void buttonHuyChoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHuyChoMouseClicked
        try {
            timer.stop();
            DataTransfer transfer = new DataTransfer();

            BufferedWriter out2 = new BufferedWriter(new OutputStreamWriter(ManHinhDangNhap.socket.getOutputStream()));
            BufferedReader in2 = new BufferedReader(new InputStreamReader(ManHinhDangNhap.socket.getInputStream()));

            transfer.setSend(ManHinhDangNhap.socket, out2, "cancel#" + ManHinhDangNhap.nameClient);
            transfer.send.run();
            transfer.setReceiveMode(ManHinhDangNhap.socket, in2);
            transfer.receiveMode.run();
            this.dispose();
            new ManHinhChonCheDoChoi().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhChoGhepTran.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonHuyChoMouseClicked

    private void buttonKiemTraIQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKiemTraIQMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonKiemTraIQMouseClicked

    private void buttonKiemTraIQMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKiemTraIQMouseEntered
        buttonKiemTraIQ.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_buttonKiemTraIQMouseEntered

    private void buttonKiemTraIQMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKiemTraIQMouseExited
        buttonKiemTraIQ.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_buttonKiemTraIQMouseExited

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
            java.util.logging.Logger.getLogger(ManHinhChoGhepTran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhChoGhepTran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhChoGhepTran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhChoGhepTran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManHinhChoGhepTran().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ManHinhChoGhepTran.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ManHinhChoGhepTran.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHuyCho;
    private javax.swing.JButton buttonKiemTraIQ;
    private javax.swing.JLabel labelDangTai;
    private javax.swing.JLabel labelDemNguoc;
    private javax.swing.JPanel panelChoGhepTran;
    // End of variables declaration//GEN-END:variables
}
