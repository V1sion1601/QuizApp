/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServerConfig;

import DTO.RSA;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Vector;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import javax.swing.SwingWorker;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

/**
 *
 * @author ADMIN
 */
public class Server {

    public static int numThread = 10;
    public static Vector<ClientHandler> clientList = new Vector<>();

    public static ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(numThread);
    private static PrivateKey privateKey = null;
    private static PublicKey publicKey = null;
    public static String privateKeyString = "";
    public static int port = 4949;//port mà server chạy phải khớp với client

    public static void createServer() throws NoSuchAlgorithmException {
        RSA rsa = new RSA();
        PublicKey publicKey = rsa.getPublicKey();
        privateKey = rsa.getPrivateKey();
        privateKeyString = rsa.getPrivateKeyString(privateKey);
        SwingWorker sw = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                Socket socket = new Socket("thongtindaotao.sgu.edu.vn", 80);
                String localIP = socket.getLocalAddress().toString().substring(1);
                String api = "https://retoolapi.dev/wItTy8/data/1";
                String jsonData = "{\"ip\":\"" + localIP + "\"}";
                Jsoup.connect(api)
                        .ignoreContentType(true).ignoreHttpErrors(true)
                        .header("Content-type", "application/json")
                        .requestBody(jsonData)
                        .method(Connection.Method.PUT).execute();

                ServerSocket serverSocket = null;
                //Server tạo client và gửi public key cho từng client kết nối vào
                try {
                    serverSocket = new ServerSocket(port);
                    System.out.println("server starting...");
                    int i = 1;

                    while (true) {

                        ClientHandler client = new ClientHandler(serverSocket.accept(), Integer.toString(i++), rsa.getPublicKeyString(publicKey));
                        clientList.add(client);
                        executor.execute(client);

                    }
                } catch (IOException e) {
                    System.out.println("port da duoc su dung, chon port khac hoac tat port " + port + " o tien trinh khac");
                }
                return "Finished";
            }
        };
        sw.execute();
    }
}
