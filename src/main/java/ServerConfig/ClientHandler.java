/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServerConfig;

import BUS.UserBUS;
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
    UserBUS userBus = new UserBUS();
//    ObjectInputStream inObject;
//    ObjectOutputStream outObject;

    public ClientHandler() {

    }

    public ClientHandler(Socket s, String n, String k) throws IOException {
        this.name = n;
        this.socket = s;
        this.key = k;
        in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

//        inObject = new ObjectInputStream(s.getInputStream());
    }

    public void sendTotalMatches(Vector<ClientHandler> clientList, String idPlayer) throws IOException {
        ObjectOutputStream outObject = new ObjectOutputStream(socket.getOutputStream());
        Server.totalMatches = userBus.showUserByTotalMatch();
        for (ClientHandler client : clientList) {
            if (client.name.equals(idPlayer)) {
                try {
                    outObject.writeObject(Server.totalMatches);
                    outObject.flush();
                    System.out.println("Server sent total matches to" + client.name);
                } catch (IOException ex) {
                    Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public void sendTotalMatchWin(Vector<ClientHandler> clientList, String idPlayer) throws IOException {
        ObjectOutputStream outObject = new ObjectOutputStream(socket.getOutputStream());
        Server.totalWinMatches = userBus.showUserByTotalMatchWin();
        for (ClientHandler client : clientList) {
            if (client.name.equals(idPlayer)) {
                try {
                    outObject.writeObject(Server.totalWinMatches);
                    outObject.flush();
                    System.out.println("Server sent total win matches to" + client.name);
                } catch (IOException ex) {
                    Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public void sendTotalStreak(Vector<ClientHandler> clientList, String idPlayer) throws IOException {
        ObjectOutputStream outObject = new ObjectOutputStream(socket.getOutputStream());
        Server.totalStreaks = userBus.showUserByWinStreak();
        for (ClientHandler client : clientList) {
            if (client.name.equals(idPlayer)) {
                try {
                    outObject.writeObject(Server.totalStreaks);
                    outObject.flush();
                    System.out.println("Server sent total win matches to" + client.name);
                } catch (IOException ex) {
                    Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public void sendQuestions(Vector<ClientHandler> clientList, String idPlayer) throws IOException {
        //       questionlist = new ArrayList<>(DAO.QuestionDAO.quantityQuestion);
        ObjectOutputStream outObject = new ObjectOutputStream(socket.getOutputStream());
        Server.questions = DAO.QuestionDAO.getListQuestionByQuantity(DAO.QuestionDAO.quantityQuestion, Server.seed);
        for (ClientHandler client : clientList) {
            if (client.name.equals(idPlayer)) {
                try {
                    outObject.writeObject(Server.questions);
                    outObject.flush();

                    System.out.println("Server sent object to" + client.name);
                } catch (IOException ex) {
                    Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    public void sendQuestionsIQ(Vector<ClientHandler> clientList, String idPlayer) throws IOException {
        //       questionlist = new ArrayList<>(DAO.QuestionDAO.quantityQuestion);
        ObjectOutputStream outObject = new ObjectOutputStream(socket.getOutputStream());
        Server.questionsIQ = DAO.QuestionIQDAO.getListQuestionByQuantity(DAO.QuestionIQDAO.quantityQuestion);
        for (ClientHandler client : clientList) {
            if (client.name.equals(idPlayer)) {
                try {
                    outObject.writeObject(Server.questionsIQ);
                    outObject.flush();

                    System.out.println("Server sent object to" + client.name);
                } catch (IOException ex) {
                    Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    public void sendQueueList(Vector<ClientHandler> clientList, Vector<String> queue, String command, String idPlayer) throws IOException {
        if (command.contains("win")) {
            int score = Integer.parseInt(idPlayer);
            userBus.updateTotalMatch();
            userBus.updateTotalWinMatch();
            userBus.updateWinStreak();
            userBus.updateTotalScore(score);
        } else if (command.contains("lose")) {
            int score = Integer.parseInt(idPlayer);
            userBus.updateTotalLoseMatch();
            userBus.updateLoseStreak();
            userBus.updateWinStreak();
            userBus.updateTotalScore(score);

        } else if (command.contains("username")) {
            String[] info = idPlayer.split(",");
            String username = info[0];
            String idClient = info[1];
            System.out.println("Server get username: " + idPlayer);
            if (userBus.checkUserName(username) == true) {
                for (ClientHandler client : clientList) {
                    if (client.name.equals(idClient)) {
                        client.out.write("success" + "\n");
                        client.out.flush();
                        System.out.println("Server checked username to" + client.name);
                    }
                }

            }
        } else if (command.contains("email")) {
            String[] info = idPlayer.split(",");
            String email = info[0];
            String idClient = info[1];
            System.out.println("Server get email: " + idPlayer);
            if (userBus.CheckEmailUsed(email) == true) {
                for (ClientHandler client : clientList) {
                    if (client.name.equals(idClient)) {
                        client.out.write("success" + "\n");
                        client.out.flush();
                        System.out.println("Server checked email to" + client.name);
                    }
                }

            }
        } else if (command.contains("register")) {
            String[] info = idPlayer.split(",");
            String username = info[0];
            String password = info[1];
            String email = info[2];
            String idClient = info[3];
            System.out.println("Server get password from: " + password);
            if (userBus.insert1(username, password, email) == true) {
                for (ClientHandler client : clientList) {
                    if (client.name.equals(idClient)) {
                        client.out.write("success" + "\n");
                        client.out.flush();
                        System.out.println("Server checked email to" + client.name);
                    }
                }
            }
        } else if (command.contains("login")) {
            String[] info = idPlayer.split(",");
            String account = info[0];
            String password = info[1];
            String idClient = info[2];
            int check = userBus.findtaikhoan(account, password);
            System.out.println("Stauts: " + check);
            switch (check) {
                case 1:
                    for (ClientHandler client : clientList) {
                        if (client.name.equals(idClient)) {
                            client.out.write("success" + "\n");
                            client.out.flush();
                            System.out.println("Login status: " + check);
                            System.out.println("Server sent login to" + client.name);

                        }
                    }
                    break;
                case 2:
                    for (ClientHandler client : clientList) {
                        if (client.name.equals(idClient)) {
                            client.out.write("failed login" + "\n");
                            client.out.flush();
                            System.out.println("Login status: " + check);
                            System.out.println("Server sent login to" + client.name);
                        }
                    }
                    break;
                default:
                    for (ClientHandler client : clientList) {
                        if (client.name.equals(idClient)) {
                            client.out.write("failed" + "\n");
                            client.out.flush();
                            System.out.println("Login status: " + check);
                            System.out.println("Server sent login to" + client.name);
                        }
                    }
                    break;
            }

        } else if (command.contains("match")) {
            String[] duel = idPlayer.split(",");
            String player1 = duel[0];
            String player2 = duel[1];
            for (ClientHandler client : clientList) {
                if (client.name.equals(player1) || client.name.equals(player2)) {
                    client.out.write("Duel" + "\n");
                    client.out.flush();
                    System.out.println("Server sent duel to" + client.name);
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
        String commonKey = null;
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
                    if (userBus.usersavelogin != null) {
                        userBus.logout();
                    }
                    Server.clientList.remove(this);
                    Server.queueList.remove(name);
                    Server.executor.remove(this);
                    break;
                }

                //Mã hóa các dữ liệu gửi từ client qua
                //System.out.println("Server received '" + rsa.Descrpytion(input, rsa.convertPrivateKey(Server.privateKeyString)) + "' from Client " + name);
                System.out.println("Server received '" + input + "' from Client " + name);
//                if(input.contains("key")) {
//                    commonKey = rsa.Descrpytion(input, rsa.Descrpytion(input, rsa.convertPrivateKey(Server.privateKeyString)));
//                }
                if (input.contains("play")) {
                    player = input.split(",");
                    idPlayer = player[1];
                    sendQuestions(Server.clientList, idPlayer);
                }
                if (input.contains("iq")) {
                    player = input.split(",");
                    idPlayer = player[1];
                    sendQuestionsIQ(Server.clientList, idPlayer);
                }
                if (input.contains("total")) {
                    player = input.split(",");
                    idPlayer = player[1];
                    sendTotalMatches(Server.clientList, idPlayer);
                }
                if (input.contains("listWin")) {
                    player = input.split(",");
                    idPlayer = player[1];
                    sendTotalMatchWin(Server.clientList, idPlayer);
                }
                if (input.contains("streak")) {
                    player = input.split(",");
                    idPlayer = player[1];
                    sendTotalStreak(Server.clientList, idPlayer);
                }
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

//        catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InvalidKeySpecException ex) {
//            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
