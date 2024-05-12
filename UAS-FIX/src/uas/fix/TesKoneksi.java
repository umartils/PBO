/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas.fix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class TesKoneksi {
    public static Connection mysqlconfig;

    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/koneksi_jawa";
            String user = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, password);
//            JOptionPane.showMessageDialog(null, "koneksi berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal");
        }
        return mysqlconfig;
   }
}

    /**
     * @param args the command line arguments
     */
    
