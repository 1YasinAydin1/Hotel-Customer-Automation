
package otel_oto_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ADU {
       ResultSet result;
Connection connection = null;
Statement statement;
int sutunSayisi ;
         public void ekle(int tc,String ad,String soyad,String oda_no){
         if(99999<=tc){
            try {
             Class.forName("com.mysql.jdbc.Driver");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"driver hata"+e.getMessage());
            }
            Connection con=null;
            try{
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/otel_rezervasyon?zeroDateTimeBehavior=convertToNull","root","");
            }
            catch(Exception e)
            {
                     JOptionPane.showMessageDialog(null," hata"+e.getMessage());
            }
             try{     
            PreparedStatement  uygula =con.prepareStatement("insert into musteriler (Tc,ad,soyad,oda_no) values(?,?,?,?)");
                
                uygula.setInt(1,tc);
                uygula.setString(2,ad);
                uygula.setString(3,soyad);
                uygula.setString(4,oda_no);
            uygula.executeUpdate();
             }
             catch(Exception e)
             {
                  JOptionPane.showMessageDialog(null," Zaten odanız var ");
             }}
            else if(999999999<tc) 
            {
                 JOptionPane.showMessageDialog(null,"Tc Kimlik 9 haneden büyük olamaz");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Tc Kimlik 6 haneden kücük olamaz");
            }

           }
         public void sil(int tc) {
         try {
         Class.forName("com.mysql.jdbc.Driver");
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,"driver hata"+e.getMessage());
     }
     Connection baglanti=null;
     try{
         baglanti=DriverManager.getConnection("jdbc:mysql://localhost:3306/otel_rezervasyon?zeroDateTimeBehavior=convertToNull","root","");
     }
     catch(Exception e)
     {
              JOptionPane.showMessageDialog(null," hata"+e.getMessage());
     }
     int a =tc;

      try{     
     PreparedStatement  uygula =baglanti.prepareStatement("delete from musteriler where Tc=? ");
      uygula.setInt(1,tc);
     uygula.executeUpdate();
      }
      catch(Exception e)
      {
           JOptionPane.showMessageDialog(null," hata2132"+e.getMessage());
      }
    }
         public void guncelle(int tc,String ad,String soyad,String oda_no){
             
         try {
               Class.forName("com.mysql.jdbc.Driver");
         }
         catch(Exception e)
         {
              JOptionPane.showMessageDialog(null,"driver hata"+e.getMessage());
         }
     Connection baglanti=null;
            try{
                baglanti=DriverManager.getConnection("jdbc:mysql://localhost:3306/otel_rezervasyon?zeroDateTimeBehavior=convertToNull","root","");

            }
            catch(Exception e)
            {
                     JOptionPane.showMessageDialog(null," hata"+e.getMessage());
            }
     
        try{     
       PreparedStatement  uygula =baglanti.prepareStatement("UPDATE  musteriler SET  ad=?,soyad=?,oda_no=? where TC=? ");
                  uygula.setInt(4,tc);
                  uygula.setString(1,ad);
                  uygula.setString(2,soyad);
                  uygula.setString(3,oda_no);
                  
       uygula.executeUpdate();
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null," hata2132"+e.getMessage());
        }
      
    }

}

