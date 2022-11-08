/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.security.MessageDigest;

/**
 *
 * @author ADMIN
 */
public class MD5 {
    public static String MD5(String md5) {
        //băm mật khẩu dạng MD5
        //hàm này tham khảo trên mạng
        md5 = md5+"sgultm";//thêm chuỗi đằng sau để chống bị dịch ngược md5
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }
}
