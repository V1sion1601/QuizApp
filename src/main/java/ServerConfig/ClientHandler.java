/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServerConfig;

import DTO.RSA;
import GUI.admin.ManHinhDangNhapAdmin;
import GUI.user.ManHinhDangNhap;


import java.io.*;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;

public class ClientHandler implements Runnable {

    private Socket socket;
    private String name;
    private String key;
    BufferedReader in;
    BufferedWriter out;
    public String input;

    public ClientHandler() {

    }

    public ClientHandler(Socket s, String n, String k) throws IOException {
        this.name = n;
        this.socket = s;
        this.key = k;
        in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
    }

    public void run() {
        RSA rsa = new RSA();
        System.out.println("Client " + socket.toString() + " accepted");
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        System.out.println(threadSet);
        try {
            //Quá trình gửi key
            for (ClientHandler client : Server.clientList) {
                if (name.equals(client.name)) {
               
                    client.out.write(key + "\n");
                    client.out.write(name + "\n");
                    client.out.flush();
                    System.out.println("Server sent '" + key + "' to Client " + name);
                }
            }
            //Xử lí đầu vào
            while (true) {
                input = in.readLine();

                if (input.equals("bye")) {
                    System.out.println("Name " + name);

                    Server.clientList.remove(this);
                    Server.executor.remove(this);
                    break;
                }
         
                //Mã hóa các dữ liệu gửi từ client qua
                System.out.println("Server received '" + rsa.Descrpytion(input, rsa.convertPrivateKey(Server.privateKeyString)) + "' from Client " + name);

            }

            System.out.println("Closed socket for client " + socket.toString());
            in.close();
            out.close();
            socket.close();
            System.out.println(Server.executor.remove(this));
            System.out.println(threadSet);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
