/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection koneksi; 
    public static Connection GetConnection() throws SQLException{ 
        if (koneksi == null){ 
        new Driver(); 
        koneksi = 
        DriverManager.getConnection("jdbc:mysql://localhost:3306/db_dokter","root",""); 
        } 
        return koneksi; 
    } 
}
