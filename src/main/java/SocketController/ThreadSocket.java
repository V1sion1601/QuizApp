package SocketController;

import DTO.*;
import DAO.*;
import com.google.gson.Gson;

import javax.crypto.SecretKey;
import java.io.*;
import java.net.Socket;
import java.security.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class ThreadSocket extends Thread {

    private Socket socket = null;
    private ObjectOutputStream sendToClient = null;
    private ObjectInputStream fromClient = null;
    private RSA rsa = new RSA();//sinh ra khóa công khai và các hàm về xử lý mã hóa
    private Gson gson = new Gson();// gson dùng để chuyển object về json, thư viện Gson dùng maven để add vào project
    private SecretKey key = null;
    private AES aes = new AES();//mã hóa dữ liệu ở Server gửi về client
    private String dataJson;
    private UserDTO user;
    private String n;

    public ThreadSocket(Socket socket, String n) {
        this.socket = socket;
        this.n = n;
    }

    public void run() {
        try {
            user = new UserDTO();// chứa dữ liệu user mà client gửi lên
            sendToClient = new ObjectOutputStream(socket.getOutputStream());// Tao output stream
            fromClient = new ObjectInputStream(socket.getInputStream());//Tao input stream
            guiPublicKeyVaNhanSecretKey();
            while (true) {
                //nhan du lieu tu client
                DataTransport dataClient = new DataTransport();
                try {
                    dataClient = (DataTransport) fromClient.readObject();// DataTransport từ client
                } catch (IOException e) {
                    break;
                }
                System.out.println("FROM CLIENT: " + dataClient.getData());
                //giải mã dữ liệu
                dataJson = aes.decrypt(dataClient.getData(), key);//data gui tu client
                String function = aes.decrypt(dataClient.getFunction(), key);//chức năng client muốn thực hiện
                //thực hiện chức năng yêu cầu của client

            }
            sendToClient.close();
            fromClient.close();
            socket.close();
        } catch (EOFException exx) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void guiPublicKeyVaNhanSecretKey() {
        try {
            //gui publickey cho client
            sendToClient.writeObject(rsa.getPublicKey());
            //doc publickey tu client
            String keyAesMaHoa = (String) fromClient.readObject();//lấy key aes đã mã hóa của client
            String keyAesGiaiMa = rsa.Descrpytion(keyAesMaHoa, rsa.getPrivateKey());//giải mã key
            key = aes.StringtoSecretKey(keyAesGiaiMa);//chuyển chuỗi key đã đc giải mã về SecretKey
            //ket thuc gui nhan key
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
