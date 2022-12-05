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

//    public String queuePlayer(String input) {
//        String[] command = input.split("#");
//        return command;
//    }
    public void sendQueueList(Vector<ClientHandler> clientList, Vector<String> queue, String command, String idPlayer) throws IOException {
        if (command.contains("match")) {
            String[] duel = idPlayer.split(",");
            String player1 = duel[0];
            String player2 = duel[1];
            for (ClientHandler client : clientList) {
                if (client.name.equals(player2) || client.name.equals(player1)) {
                    client.out.write("Duel" + "\n");
                    client.out.flush();
                    System.out.println("Server sent duel to" + player2);
                }

            }
        } else if (command.contains("point")) {
            String[] info = idPlayer.split(",");
            String point = info[0];
            String player = info[1];
             for (ClientHandler client : clientList) {
                if (!client.name.equals(player)) {
                    client.out.write(point + "\n");
                    client.out.flush();
                    System.out.println("Server sent point " + point + " to player oppo: " + client.name);
                }

            }
        } else {
            if (command.contains("cancel")) {
                System.out.println("test cancel");
                queue.remove(idPlayer);
            }
            if (command.contains("queue")) {
                queue.add(idPlayer);
            }

            for (ClientHandler client : clientList) {
                client.out.write(queue.toString() + "\n");
                client.out.flush();
                System.out.println("Server sent: " + queue);

            }
        }

    }

    public void run() {
        RSA rsa = new RSA();
        System.out.println("Client " + socket.toString() + " accepted");
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        System.out.println(threadSet);
        try {
            String[] player = null;
            String command = null, idPlayer = null;
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
                    System.out.println("Bye client " + name);
                    Server.clientList.remove(this);
                    Server.queueList.remove(name);
                    Server.executor.remove(this);
                    break;
                }

                //Mã hóa các dữ liệu gửi từ client qua
                //System.out.println("Server received '" + rsa.Descrpytion(input, rsa.convertPrivateKey(Server.privateKeyString)) + "' from Client " + name);
                System.out.println("Server received queue '" + input + "' from Client " + name);

                if (input.contains("#")) {
                    player = input.split("#");

                    command = player[0];
                    idPlayer = player[1];
                    sendQueueList(Server.clientList, Server.queueList, command, idPlayer);

                }

            }

            System.out.println("Closed socket for client " + socket.toString());
            in.close();
            out.close();
            socket.close();
            System.out.println(Server.executor.remove(this));
            System.out.println(threadSet);
        } catch (IOException e) {
            System.out.println(e);
        }
//        catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InvalidKeySpecException ex) {
//            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
