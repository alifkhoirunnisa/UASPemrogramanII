/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author X1
 */
public class Update {
    Koneksi konek = new Koneksi();

    public void Update(String Nama, String Alamat, String Agama, String Gender, String NoHP, String TempatTanggalLahir ) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_Nama = "update tbbiodatadiri set Nama='"+ Nama + "'where Nama ='" + Nama + "'";
            String sql_Alamat = "update tbbiodatadiri set Alamat='"+ Alamat + "'where Nama ='" + Nama + "'";
            String sql_Agama = "update tbbiodatadiri set Agama='"+ Agama + "'where Nama ='" + Nama + "'";
            String sql_Gender = "update tbbiodatadiri set Gender='"+ Gender + "'where Nama ='" + Nama + "'";
            String sql_NoHP = "update tbbiodatadiri set NoHP='"+ NoHP + "'where Nama ='" + Nama + "'";
            String sql_TempatTanggalLahir = "update tbbiodatadiri set TempatTanggalLahir ='"+ TempatTanggalLahir + "'where Nama ='" + Nama + "'";
            
            statement.executeUpdate(sql_Nama);
            statement.executeUpdate(sql_Alamat);
            statement.executeUpdate(sql_Agama);
            statement.executeUpdate(sql_Gender);
            statement.executeUpdate(sql_NoHP);
            statement.executeUpdate(sql_TempatTanggalLahir);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }  
}