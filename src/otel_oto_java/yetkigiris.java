
package otel_oto_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class yetkigiris {
    ResultSet result;
    Connection connection = null;
    Statement statement;
    int sutunSayisi ;
    private Object preparedStatement;
         public boolean giris(String kullanici_adi,String parola){
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
            PreparedStatement  uygula =con.prepareStatement("Select * From yetkililer where yet_kul_ad = ? and yet_sifre = ?");
            
                uygula.setString(1,kullanici_adi);
                uygula.setString(2,parola);

             ResultSet rs =  uygula.executeQuery();
            
             return rs.next();
            
             }
             catch(Exception e)
             { 
                  return false;
             }
         }
}
