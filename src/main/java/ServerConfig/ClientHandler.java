/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServerConfig;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Set;
import java.util.Vector;

public class ClientHandler implements Runnable {

    private Socket socket;
    private String name;
    BufferedReader in;
    BufferedWriter out;

    public ClientHandler(Socket s, String n) throws IOException {
        this.name = n;
        this.socket = s;
        in = new BufferedReader(new InputStreamReader(s.getInputStream()));
      
        out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
    }

//    public void handleSendData(Vector<ClientHandler> clientList, String inputId, String inputData) throws IOException {
//        int error = 0;
//        for (ClientHandler client : clientList) {
//            if (inputId.equals("") && inputData.equals("")) {
//                if (!name.equals(client.name)) {
//                    client.out.write("User " + name + " has been disconnected \n");
//                    client.out.flush();
//                }
//            }
//            if (inputId.equals("all")) {
//                if (!name.equals(client.name)) {
//                    client.out.write(inputData + " \n");
//                    client.out.flush();
//                }
//            } else {
//                if (client.name.equals(inputId)) {
//                    if (error == 1) {
//                        client.out.write("User doesn't exist \n");
//                        client.out.flush();
//                    }
//                    client.out.write(inputData + "\n");
//                    client.out.flush();
//                    System.out.println("Server sent '" + inputData + "' from Client " + client.name + "--> Client " + inputId);
//                } else {
//                    error = 1;
//                }
//            }
//
//        }
//
//    }
    public void run() {

        System.out.println("Client " + socket.toString() + " accepted");
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        System.out.println(threadSet);
        try {

            while (true) {
                String input = in.readLine();
                //Handle if user's input is bye
                if (input.equals("bye")) {
//                    handleSendDataMain.clientList, "", "");
                    System.out.println("Name " + name);
                    Server.clientList.remove(this);

                    System.out.println("Test client list");
                    System.out.println(Server.clientList);
                    Server.executor.remove(this);
                    break;
                }

//                System.out.println("Server received '" + inputData + "' from Client " + name + "' with ID of Receiver: '" + inputId);
//                handleSendData(Server.clientList, inputId, inputData);
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
    }

}
