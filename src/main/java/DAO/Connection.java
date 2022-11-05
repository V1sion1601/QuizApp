/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author ADMIN
 */
public class Connection {
    public static int check = -1;
    private final static String JDBC = "com.mysql.cj.jdbc.Driver";
    private final static String DATA = "jdbc:mysql://localhost:3306/ltm";
    
    public static Connection connection() {
        Connection con = null;
        java.beans.Statement sta = null;
        try {
            Class.forName(JDBC);
            con = DriverManager.getConnection(DATA, "root", "");
        } catch (ClassNotFoundException ex) {
            System.err.println("Không tìm thấy driver. Chi tiết:  " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(BUS.DiemBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
