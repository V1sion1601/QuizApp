/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author ADMIN
 */
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RSA {

    private PrivateKey privateKey;
    private PublicKey publicKey;

    public RSA() {
        try {

            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
            kpg.initialize(1024);
            // Khởi tạo cặp khóa
            KeyPair kp = kpg.genKeyPair();
            // PublicKey
            PublicKey publicKey = kp.getPublic();
            this.publicKey = publicKey;
            // PrivateKey
            PrivateKey privateKey = kp.getPrivate();
            this.privateKey = privateKey;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    public String getPublicKeyString(PublicKey publicKey) {
        return Base64.getEncoder().encodeToString(publicKey.getEncoded());

    }

    public String getPrivateKeyString(PrivateKey privateKey) {
        return Base64.getEncoder().encodeToString(privateKey.getEncoded());

    }

    public String Encrpytion(String message, PublicKey publicKey) {
        // Mã hoá dữ liệu
        String strEncrypt = "";
        try {
            Cipher c = Cipher.getInstance("RSA");
            c.init(Cipher.ENCRYPT_MODE, publicKey);
            byte encryptOut[] = c.doFinal(message.getBytes());
            return Base64.getEncoder().encodeToString(encryptOut);
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        return strEncrypt;
    }

    public String Descrpytion(String ciphertext, PrivateKey privateKey) {
        try {
            Cipher c = Cipher.getInstance("RSA");
            c.init(Cipher.DECRYPT_MODE, privateKey);
            byte decryptOut[] = c.doFinal(Base64.getDecoder().decode(ciphertext));
            return new String(decryptOut);
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        return "";
    }
}
