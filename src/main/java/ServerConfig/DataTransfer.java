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
import javax.swing.SwingWorker;

/**
 *
 * @author ADMIN
 */
public class DataTransfer {

    public Send send;
    public Receive receive;

    public void setSend(Socket s, BufferedWriter o, String input) {
        System.out.println(o);
        send = new Send(s, o, input);
    }

    public void setReceive(Socket s, BufferedReader r) {

        receive = new Receive(s, r);
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
            try {
                out.write(input + "\n");
                out.flush();
                if (input.equals("bye")) {
                    socket.close();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public class Receive implements Runnable {

        private Socket socket;
        private BufferedReader in;

        public Receive(Socket s, BufferedReader r) {
            this.socket = s;
            this.in = r;
        }

        public void run() {
            SwingWorker sw = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    String data = null;
                    try {
                        while (true) {

                            data = in.readLine();
                            if (data.equals("bye")) {
                                break;
                            }
                        }
                        System.out.println("Received: " + data);

                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    return data;
                }
            };
            sw.execute();

        }
    }
}
