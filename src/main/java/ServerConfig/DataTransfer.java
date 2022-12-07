/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServerConfig;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;

/**
 *
 * @author ADMIN
 */
public class DataTransfer {

    public Send send;
    public Receive receive;
    public ReceiveMode receiveMode;

    public void setSend(Socket s, BufferedWriter o, String input) {

        send = new Send(s, o, input);
    }

    public void setReceive(Socket s, BufferedReader r) {

        receive = new Receive(s, r);
    }

    public void setReceiveMode(Socket s, BufferedReader r) {

        receiveMode = new ReceiveMode(s, r);
    }

    public class Send implements Runnable {

        private Socket socket = null;
        private BufferedWriter out;
        private String input = null;

        public Send(Socket s, BufferedWriter o, String input) {
            this.socket = s;
            this.out = o;
            this.input = input;
        }

        public void run() {
            SwingWorker sw = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    out.write(input + "\n");
                    out.flush();
                    Thread.sleep(1000);

                    if (input.equals("bye")) {
                        socket.close();
                    }
                    return "Finished";

                }
            };
            sw.execute();

        }
    }

    public class Receive implements Runnable {

        private Socket socket;
        private BufferedReader in;
        public String userData;

        public Receive(Socket s, BufferedReader r) {
            this.socket = s;
            this.in = r;
            this.userData = "";
        }

        public void run() {

            SwingWorker sw = new SwingWorker() {

                @Override
                public Object doInBackground() throws Exception {

                    try {

                        while (true) {
                            String data = in.readLine();
                            System.out.println("Received: " + data);
                            userData = data;
                            if (data == null) {
                                break;
                            }

                        }
                        socket.close();

                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    return userData;

                }

            };

            sw.execute();

        }
    }

    public class ReceiveMode implements Runnable {

        private Socket socket;
        private BufferedReader in;
        public String userData;

        public ReceiveMode(Socket s, BufferedReader r) {
            this.socket = s;
            this.in = r;
            userData = "";
        }

        public void run() {

            try {
                String data = in.readLine();
                System.out.println("Received: " + data);
                userData = data;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
