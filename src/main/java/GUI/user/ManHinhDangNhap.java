/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.user;

import ServerConfig.DataTransfer;
import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import javax.crypto.SecretKey;
import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import DTO.AES;
import DTO.RSA;
import java.security.PublicKey;
import java.util.Vector;

import javax.swing.JOptionPane;

/**
 *
 * @author TUF
 */
public class ManHinhDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form ManHinhDangNhap
     */
    public static int checktk;
    public static Socket socket = null;
//    public static Vector<String> playerList = new Vector<>();

    private SecretKey clientKey = null;
    public static String publicKey = null, nameClient = null;
    public PublicKey serverKey = null;
//    UserBUS userBus = new UserBUS();
    ManHinhChonCheDoChoi frameCheDoChoi = null;
    public static BufferedReader in = null;
    public static BufferedWriter out = null;

    public ManHinhDangNhap() {
        initComponents();
        int flag = 1;
        try {
            DataTransfer transfer = new DataTransfer();
            String api = "https://retoolapi.dev/wItTy8/data/1";
            Document doc = Jsoup.connect(api)
                    .ignoreContentType(true).ignoreHttpErrors(true)
                    .header("Content-type", "application/json")
                    .method(Connection.Method.GET).execute().parse();
            JSONObject jsonObject = new JSONObject(doc.text());
            System.out.println(jsonObject.get("ip").toString());
            socket = new Socket(jsonObject.get("ip").toString(), 4949);
            AES aes = new AES();
            RSA rsa = new RSA();
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            //Client tự phát sinh AES
            clientKey = aes.getKey();
            publicKey = in.readLine();
            nameClient = in.readLine();
            System.out.println("Client name: " + nameClient);
            //Đổi định dạng public key của server
            serverKey = rsa.convertPublicKey(publicKey);
            //Mã hóa key AES của client theo key của server key (RSA)
            String encryptedKey = rsa.Encrpytion(aes.getKeyString(clientKey), serverKey);
            transfer.setSend(socket, out, encryptedKey);
            transfer.send.run();

            System.out.println("Server key: " + publicKey);
            System.out.println("Encrypted key: " + encryptedKey);
            System.out.println("Client key: " + aes.getKeyString(clientKey));

        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelManHinhChaoMung = new javax.swing.JPanel();
        labelTranhTai = new javax.swing.JLabel();
        labelKienThuc = new javax.swing.JLabel();
        labelButtonDangNhap = new javax.swing.JLabel();
        labelButtonKetThuc = new javax.swing.JLabel();
        labelBanQuyenThuocVe = new javax.swing.JLabel();
        labelTenDangNhap = new javax.swing.JLabel();
        textFieldTenDangNhap = new javax.swing.JTextField();
        labelMatKhau = new javax.swing.JLabel();
        passwordFieldMatKhau = new javax.swing.JPasswordField();
        labelButtonDangKy = new javax.swing.JLabel();
        labelButtonTroVe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelManHinhChaoMung.setBackground(new java.awt.Color(255, 255, 255));

        labelTranhTai.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTranhTai.setText("TRANH TÀI");

        labelKienThuc.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelKienThuc.setText("KIẾN THỨC");

        labelButtonDangNhap.setBackground(new java.awt.Color(0, 102, 255));
        labelButtonDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelButtonDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonDangNhap.setText("Đăng nhập");
        labelButtonDangNhap.setToolTipText("Đăng nhập");
        labelButtonDangNhap.setOpaque(true);
        labelButtonDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelButtonDangNhapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonDangNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonDangNhapMouseExited(evt);
            }
        });

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

        labelTenDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTenDangNhap.setText("Tên đăng nhập :");

        textFieldTenDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textFieldTenDangNhap.setToolTipText("Tên đăng nhập");

        labelMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMatKhau.setText("Mật khẩu :");

        passwordFieldMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordFieldMatKhau.setToolTipText("Mật khẩu");

        labelButtonDangKy.setBackground(new java.awt.Color(0, 102, 255));
        labelButtonDangKy.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelButtonDangKy.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonDangKy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonDangKy.setText("Đăng Ký");
        labelButtonDangKy.setToolTipText("Đăng nhập");
        labelButtonDangKy.setOpaque(true);
        labelButtonDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelButtonDangKyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelButtonDangKyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelButtonDangKyMouseExited(evt);
            }
        });

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

        javax.swing.GroupLayout panelManHinhChaoMungLayout = new javax.swing.GroupLayout(panelManHinhChaoMung);
        panelManHinhChaoMung.setLayout(panelManHinhChaoMungLayout);
        panelManHinhChaoMungLayout.setHorizontalGroup(
            panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBanQuyenThuocVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelManHinhChaoMungLayout.createSequentialGroup()
                .addGroup(panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManHinhChaoMungLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelButtonTroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelManHinhChaoMungLayout.createSequentialGroup()
                        .addGroup(panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelManHinhChaoMungLayout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addGroup(panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelKienThuc)
                                    .addComponent(labelTranhTai)))
                            .addGroup(panelManHinhChaoMungLayout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelMatKhau)
                                    .addComponent(labelTenDangNhap))
                                .addGap(18, 18, 18)
                                .addGroup(panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldTenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                    .addComponent(passwordFieldMatKhau))))
                        .addGap(0, 177, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManHinhChaoMungLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelButtonDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelButtonDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(267, 267, 267))
        );
        panelManHinhChaoMungLayout.setVerticalGroup(
            panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManHinhChaoMungLayout.createSequentialGroup()
                .addGroup(panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelButtonKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelButtonTroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addComponent(labelTranhTai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelKienThuc)
                .addGap(49, 49, 49)
                .addGroup(panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTenDangNhap)
                    .addComponent(textFieldTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelManHinhChaoMungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatKhau)
                    .addComponent(passwordFieldMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(labelButtonDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelButtonDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(labelBanQuyenThuocVe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhChaoMung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelManHinhChaoMung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelButtonKetThucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonKetThucMouseClicked
        try {
            DataTransfer transfer = new DataTransfer();
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            transfer.setSend(socket, out, "bye");
            transfer.send.run();
            this.dispose();
//            socket.close();
//            System.exit(0);
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

    private void labelButtonDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonDangNhapMouseEntered
        labelButtonDangNhap.setBackground(new Color(0, 0, 204));
    }//GEN-LAST:event_labelButtonDangNhapMouseEntered

    private void labelButtonDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonDangNhapMouseExited
        labelButtonDangNhap.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_labelButtonDangNhapMouseExited

    private void labelButtonDangKyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonDangKyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelButtonDangKyMouseEntered

    private void labelButtonDangKyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonDangKyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelButtonDangKyMouseExited

    private void labelButtonDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonDangKyMouseClicked
        GUI.user.ManHinhDangKy frame = new ManHinhDangKy();
        this.setVisible(false);
        frame.setVisible(true);

    }//GEN-LAST:event_labelButtonDangKyMouseClicked

    private void labelButtonDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonDangNhapMouseClicked
        try {
            DataTransfer transfer = new DataTransfer();

            String a = textFieldTenDangNhap.getText();
            String b = BUS.MD5.MD5(String.valueOf(passwordFieldMatKhau.getPassword()));

            BufferedReader in2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out2 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            Thread sendThread = new Thread(() -> {
                System.out.println("Send Thread");
                transfer.setSend(socket, out2, "login#" + a + "," + b + "," + nameClient);
                transfer.send.run();
            });
            Thread receiveThread = new Thread(() -> {
                System.out.println("Receive Thread");

                transfer.setReceiveMode(socket, in2);
                transfer.receiveMode.run();
            });
            sendThread.start();
            receiveThread.start();
            sendThread.join();
            receiveThread.join();
            if (transfer.receiveMode.userData.equals("success")) {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                ManHinhChonCheDoChoi frame = new ManHinhChonCheDoChoi();
                frame.setVisible(true);
                this.setVisible(false);

            } else if (transfer.receiveMode.userData.equals("failed login")) {
                JOptionPane.showMessageDialog(null, "Tài khoản đã bị khóa hoặc đang được đăng nhập trên 1 thiết bị khác");

            } else {
                JOptionPane.showMessageDialog(null, "Tài khoản bị sai tài khoản hoặc sai mật khẩu");
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(ManHinhDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManHinhDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelButtonDangNhapMouseClicked

    private void labelButtonTroVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonTroVeMouseClicked
        // TODO add your handling code here:
        GUI.user.ManHinhChaoMung frame = new ManHinhChaoMung();
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
     * @param args the command line argument
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new ManHinhDangNhap().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelBanQuyenThuocVe;
    private javax.swing.JLabel labelButtonDangKy;
    private javax.swing.JLabel labelButtonDangNhap;
    private javax.swing.JLabel labelButtonKetThuc;
    private javax.swing.JLabel labelButtonTroVe;
    private javax.swing.JLabel labelKienThuc;
    private javax.swing.JLabel labelMatKhau;
    private javax.swing.JLabel labelTenDangNhap;
    private javax.swing.JLabel labelTranhTai;
    private javax.swing.JPanel panelManHinhChaoMung;
    private javax.swing.JPasswordField passwordFieldMatKhau;
    private javax.swing.JTextField textFieldTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
