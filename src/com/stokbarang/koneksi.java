/*
 * 
 * Project UAS Aplikasi Stok Barang
 * Link github project: https://github.com/akiramitsu/stokbarang
 * 
 */
package com.stokbarang;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Akira
 */
public class koneksi {

    public Connection conn;
//    public koneksi(){}

    public Connection setKoneksi() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stokbarang?user=root&pass=");
            return conn;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Tidak ada koneksi yang terbuka/koneksi terputus");
            return null;
        }
    }
    
}
