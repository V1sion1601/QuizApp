/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerConfig;
//import SocketController.ThreadSocket;

import DAO.QuestionDAO;
import DTO.QuestionDTO;
import DTO.QuestionSetDTO;
import DTO.RSA;
import SocketController.ThreadSocket;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Base64;
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

    public static void createServer() throws NoSuchAlgorithmException {
        RSA rsa = new RSA();
        PublicKey publicKey = rsa.getPublicKey();
//        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
//        generator.initialize(2048);
//        KeyPair pair = generator.generateKeyPair();
//        PrivateKey privateKey = pair.getPrivate();
//        PublicKey publicKey = pair.getPublic();
//        String publicKeyString = Base64.getEncoder().encodeToString(publicKey.getEncoded());
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
                int port = 4949;//port mà server chạy phải khớp với client
                ServerSocket serverSocket = null;
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
