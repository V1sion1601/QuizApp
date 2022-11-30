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
import javax.swing.SwingWorker;

public class ClientHandler implements Runnable {

    private Socket socket;
    private String name;
    private String key;
    BufferedReader in;
    BufferedWriter out;

    public ClientHandler(Socket s, String n, String k) throws IOException {
        this.name = n;
        this.socket = s;
        this.key = k;
        in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
    }

    public void run() {

        System.out.println("Client " + socket.toString() + " accepted");
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        System.out.println(threadSet);
        try {
            String input = null;
            for (ClientHandler client : Server.clientList) {
                if (name.equals(client.name)) {
                    client.out.write(key + "\n");
                    client.out.flush();
                    System.out.println("Server sent '" + key + "' to Client " + name);
                }
            }
            while (true) {
                //Handle if user's input is bye
                input = in.readLine();

                System.out.println("Server received '" + input + "' from Client " + name);
                if (input.equals("bye")) {
//                    handleSendDataMain.clientList, "", "");
                    System.out.println("Name " + name);
                    Server.clientList.remove(this);
                    Server.executor.remove(this);
                    break;
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
    }

}
