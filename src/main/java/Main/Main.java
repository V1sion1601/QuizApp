/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
//import SocketController.ThreadSocket;
import DAO.QuestionDAO;
import DTO.QuestionDTO;
import DTO.QuestionSetDTO;
import SocketController.ThreadSocket;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        int port = 4949;//port mà server chạy phải khớp với client
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("server starting...");
            while (true) {
                // Su dung multithread
                // khi có 1 client kết nối tới thì server tạo ra 1 luồng mới cho việc kết nối đến client
                new ThreadSocket(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.out.println("port da duoc su dung, chon port khac hoac tat port " + port + " o tien trinh khac");
        }
    }
}
 