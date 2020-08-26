
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

public class Oda_U {
    ResultSet result;
    Connection connection = null;
    Statement statement;
    
        public void guncelle(int no,int kat,int yatak_sayisi,String tur,int ucret){
             
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
                  
            
        ResultSet rs=null;
        String sa = " ";
            try {
                PreparedStatement s= baglanti.prepareStatement("SELECT oda_tipID From odatip WHERE oda_tip  = ?");
                s.setString(1, tur);           
                rs = s.executeQuery();
                
                while (rs.next()) {                    
                     sa=rs.getObject(1).toString();
                }

            } catch (SQLException ex) {

            }
            
             PreparedStatement  uygula = baglanti.prepareStatement("UPDATE  oda_bilgileri SET  oda_kat=?,oda_yatak_sayisi=?,oda_tipID=?,oda_ucret=? where oda_no=?");
                       uygula.setInt(5,no);
                       uygula.setInt(1,kat);
                       uygula.setInt(2,yatak_sayisi);
                       int id = Integer.valueOf(sa);
                       uygula.setInt(3,id);
                       uygula.setInt(4,ucret);
                uygula.executeUpdate();
             }
             catch(Exception e)
             {
                  JOptionPane.showMessageDialog(null," hata2132"+e.getMessage());
             }
      
    }  
        
}
