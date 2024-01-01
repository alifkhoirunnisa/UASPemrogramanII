/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.beans.Statement;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author UsEr
 */
public class Insert {

    Koneksi konek = new Koneksi();
   

    public void insert(String Nama, String Alamat, String Agama, String Gender, String NoHP, String TempatTanggalLahir ) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
         //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
              String sql = "insert into tbbiodatadiri"+" values('" + Nama+ "','" + Alamat+ "','" + Agama+ "','" + Gender+ "','" + NoHP+ "','" + TempatTanggalLahir+ "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}