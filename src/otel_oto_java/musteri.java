/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otel_oto_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Yasin
 */
public class musteri extends javax.swing.JFrame {
    private String no;
    private String tc;
    ResultSet result,result1,result2,result3;
    Connection connection = null;
    Statement statement,statement1,statement2,statement3 ;
    int sutunSayisi,sutunSayisi1,sutunSayisi2,sutunSayisi3 ;
    ADU islemler = new ADU();
    public musteri() {
        
        initComponents();
    }
    public abstract class Sekil { public abstract double alan(); }
    public class Dikdortgen extends Sekil{
        private double kenar1,kenar2;
        public Dikdortgen(double kenar1,double kenar2)
        {
        this.kenar1=kenar1;
        this.kenar2=kenar2;
        }

        @Override
            public double alan() {
                return kenar1*kenar2;
            }
        }
       
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kimlik = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        soyad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        oda_no = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        silkimlik = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ad2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        soyad2 = new javax.swing.JTextField();
        oda_no2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        kimlik2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        ara = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 211, 211));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(102, 255, 102));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "TC", "Ad", "Soyad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(43, 242, 43));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 204, 0)));

        jLabel1.setText("TC : ");

        kimlik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kimlikActionPerformed(evt);
            }
        });

        jLabel2.setText("AD : ");

        jLabel3.setText("SOYAD : ");

        jLabel4.setText("ODA NO : ");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 102, 51));
        jButton1.setText("✓ Kaydet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Musteri Kayıt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oda_no, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1)
                    .addComponent(kimlik, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kimlik, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(oda_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 0, 0)));

        jLabel6.setText("TC");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("X Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Musteri Sil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(silkimlik, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(62, 62, 62)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(silkimlik, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(43, 242, 43));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 204, 0)));

        jLabel13.setText("TC : ");

        jLabel14.setText("AD : ");

        jLabel15.setText("SOYAD : ");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 102, 51));
        jButton4.setText("✓ Güncelle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel17.setText("Musteri Güncelleme");

        jLabel18.setText("ODA NO : ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ad2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kimlik2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(jLabel13)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soyad2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oda_no2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel17)
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kimlik2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ad2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyad2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oda_no2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18))
        );

        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("←");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(102, 255, 102));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TC", "Ad", "Soyad", "Oda No"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton5.setBackground(new java.awt.Color(51, 204, 0));
        jButton5.setText("Tümünü Listele");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Ara");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(118, 118, 118)
                        .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton2)
                    .addComponent(ara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//    EKLEME
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        Sekil sekil=new Dikdortgen(7,8);
        System.out.println("Karenin alanı : "+sekil.alan());
  
     String ad1 = ad.getText();
     String soyad1 = soyad.getText();
     String oda_no1 = oda_no.getText();
     int no=Integer.valueOf(oda_no.getText());
     int tc=Integer.valueOf(kimlik.getText());
     int s = Duruma_Gore(no);
        if (s!=0) {
            islemler.ekle(tc,ad1,soyad1,oda_no1); 
        }
     Tekli_Listele(no);
     ad.setText("");
     soyad.setText("");
     kimlik.setText("");
     oda_no.setText(""); 
    }//GEN-LAST:event_jButton1ActionPerformed
//    SİLME
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int kimlik1=Integer.valueOf(silkimlik.getText());
       
        String a =silkimlik.getText();
       
        String s = Duruma_Gore(a);
        int v = Integer.valueOf(s);
        if (v!=0) { islemler.sil(kimlik1);}
        silkimlik.setText("");
        Tumunu_Listele();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      Tumunu_Listele();
    }//GEN-LAST:event_formWindowOpened
//    GÜNCELLE
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        int kimlik1 = Integer.valueOf(kimlik2.getText());
        String ad1 = ad2.getText();
        String soyad1 = soyad2.getText();
        String oda_no1 = oda_no2.getText();
        int no=Integer.valueOf(oda_no1);
        int s = Duruma_Gore(no);
        if (s!=0) { islemler.guncelle(kimlik1,ad1,soyad1,oda_no1); }
        ad2.setText("");
        soyad2.setText("");
        kimlik2.setText("");
        oda_no2.setText("");
        Tumunu_Listele();
    }//GEN-LAST:event_jButton4ActionPerformed
//    GERİ TUŞU
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu m1= new menu();
        m1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
//    TÜMÜNÜ LİSTELE
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Tumunu_Listele();
    }//GEN-LAST:event_jButton5ActionPerformed
//    BOŞ
    private void kimlikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kimlikActionPerformed
       
    }//GEN-LAST:event_kimlikActionPerformed
//    ARAMA
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int nno=Integer.valueOf(ara.getText());
        ara.setText("");
        Tekli_Listele(nno);
    }//GEN-LAST:event_jButton6ActionPerformed
  int Duruma_Gore(int s)
    {
    try {
      Class.forName("com.mysql.jdbc.Driver");

   // Oluşturduğumuz veritabanının adını,kullanıcı adı ve şifreyi göndip Mysql                 // bağlantı kuruyoruz. 
      connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/otel_rezervasyon?zeroDateTimeBehavior=convertToNull","root","");

      statement=connection.createStatement();
      statement1=connection.createStatement();
      statement2=connection.createStatement();
      statement3=connection.createStatement();
     
     // kişiler tablosundaki tum verileri alıyoruz 
      int oda_no =s;
     
     int h=0;
      result2=statement2.executeQuery("Select oda_no from musteriler");
      sutunSayisi2=result2.getMetaData().getColumnCount();
       while(result2.next()){
               for(int i=1;i<=sutunSayisi2;i++)
                   if (oda_no==Integer.valueOf(result2.getObject(i).toString())) {
                       h++;
                   }
         }
       if (h==1) {
        JOptionPane.showMessageDialog(null,"Zaten Bu Oda Dolu");
        result2.close();
        connection.close();
    }
       int q=0;
      result3=statement3.executeQuery("Select oda_no from oda_bilgileri");
      sutunSayisi3=result3.getMetaData().getColumnCount();
       while(result3.next()){
               for(int i=1;i<=sutunSayisi3;i++)
                   if (oda_no==Integer.valueOf(result3.getObject(i).toString())) {
                       q++;
                   }
         }
       if (q==0) {
        JOptionPane.showMessageDialog(null,"Böyle bir oda yok!");
        result3.close();
        connection.close();
    }
      result=statement.executeQuery("Select * from musteriler where oda_no ="+oda_no);
      
      //Veri tabanındaki sutunlarin sayisini alıyoruz.
       sutunSayisi=result.getMetaData().getColumnCount();
       
       result1=statement1.executeQuery("Select * from oda_bilgileri where oda_no ="+oda_no);

      //Veri tabanındaki sutunlarin sayisini alıyoruz.
       sutunSayisi1=result1.getMetaData().getColumnCount();
       //Table tipinde model olusturuyoruz.
        DefaultTableModel table=new DefaultTableModel();
        DefaultTableModel table1=new DefaultTableModel();

       //table referansına veritabanındaki sutunları ekliyoruz.
        for(int i=1;i<=sutunSayisi;i++)
            table.addColumn(result.getMetaData().getColumnName(i));
        for(int i=1;i<=sutunSayisi1;i++)
            table1.addColumn(result1.getMetaData().getColumnName(i));
     
       //Veritabanindaki tum satir ve sutunlari tarayip Table'a ekliyoruz.
         while(result.next()){
              Object[] row=new Object[sutunSayisi];
               for(int i=1;i<=sutunSayisi;i++)
                  row[i-1]=result.getObject(i);
              table.addRow(row);
         }
         while(result1.next()){
              Object[] row1=new Object[sutunSayisi1];
               for(int i=1;i<=sutunSayisi1;i++)
                  row1[i-1]=result1.getObject(i);
              table1.addRow(row1);
         }

        
         jTable2.setModel(table1);
         jTable1.setModel(table);

       //baglantıları kapatıyoruz.
        result.close();
        result1.close();
        connection.close();
        return 1;
    }
    catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "VeriTabani Baglanti Hatasi");
        return 0;
    }
    }  
  String Duruma_Gore(String a)
  {
    try {
      Class.forName("com.mysql.jdbc.Driver");

   // Oluşturduğumuz veritabanının adını,kullanıcı adı ve şifreyi göndip Mysql   
      
   // bağlantı kuruyoruz. 
      connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/otel_rezervasyon?zeroDateTimeBehavior=convertToNull","root","");
     // kişiler tablosundaki tum verileri alıyoruz 
       statement=connection.createStatement();
      statement2=connection.createStatement();
      int tc =Integer.valueOf(a);
     
     int h=0;
      result2=statement2.executeQuery("Select Tc from musteriler");
      sutunSayisi2=result2.getMetaData().getColumnCount();
       while(result2.next()){
               for(int i=1;i<=sutunSayisi2;i++)
                   if (tc==Integer.valueOf(result2.getObject(i).toString())) {
                       h++;
                   }
         }
       if (h==0) {
        JOptionPane.showMessageDialog(null,"Böyle bir müşteri yok!");
        result2.close();
        connection.close();
    }
     
      result=statement.executeQuery("Select * from musteriler where Tc ="+tc);
      
      //Veri tabanındaki sutunlarin sayisini alıyoruz.
       sutunSayisi=result.getMetaData().getColumnCount();

       //Table tipinde model olusturuyoruz.
        DefaultTableModel table=new DefaultTableModel();

       //table referansına veritabanındaki sutunları ekliyoruz.
        for(int i=1;i<=sutunSayisi;i++)
            table.addColumn(result.getMetaData().getColumnName(i));

       //Veritabanindaki tum satir ve sutunlari tarayip Table'a ekliyoruz.
         while(result.next()){
              Object[] row=new Object[sutunSayisi];
               for(int i=1;i<=sutunSayisi;i++)
                  row[i-1]=result.getObject(i);
              table.addRow(row);
         }
        

        

         jTable1.setModel(table);

       //baglantıları kapatıyoruz.
        result.close();

        connection.close();
        return "1";
    }
    catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "VeriTabani Baglanti Hatasi");
        return "0";
    }
  }
  void Tekli_Listele(int s)
    {
    try {
      Class.forName("com.mysql.jdbc.Driver");

   // Oluşturduğumuz veritabanının adını,kullanıcı adı ve şifreyi göndip Mysql                 // bağlantı kuruyoruz. 
      connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/otel_rezervasyon?zeroDateTimeBehavior=convertToNull","root","");

     // kişiler tablosundaki tum verileri alıyoruz 
      int a =s;
      statement=connection.createStatement();
      statement1=connection.createStatement();
     
      result=statement.executeQuery("Select * from musteriler where oda_no ="+a);
      
      
      //Veri tabanındaki sutunlarin sayisini alıyoruz.
       sutunSayisi=result.getMetaData().getColumnCount();
       
       result1=statement1.executeQuery("Select * from oda_bilgileri where oda_no ="+a);

      //Veri tabanındaki sutunlarin sayisini alıyoruz.
       sutunSayisi1=result1.getMetaData().getColumnCount();
       //Table tipinde model olusturuyoruz.
        DefaultTableModel table=new DefaultTableModel();
        DefaultTableModel table1=new DefaultTableModel();

       //table referansına veritabanındaki sutunları ekliyoruz.
        for(int i=1;i<=sutunSayisi;i++)
            table.addColumn(result.getMetaData().getColumnName(i));
         for(int i=1;i<=sutunSayisi1;i++)
            table1.addColumn(result1.getMetaData().getColumnName(i));
     
       //Veritabanindaki tum satir ve sutunlari tarayip Table'a ekliyoruz.
         while(result.next()){
              Object[] row=new Object[sutunSayisi];
               for(int i=1;i<=sutunSayisi;i++)
                  row[i-1]=result.getObject(i);
              table.addRow(row);
         }
         while(result1.next()){
              Object[] row1=new Object[sutunSayisi1];
               for(int i=1;i<=sutunSayisi1;i++)
                  row1[i-1]=result1.getObject(i);
              table1.addRow(row1);
         }

        
         jTable2.setModel(table1);
         jTable1.setModel(table);

       //baglantıları kapatıyoruz.
        result.close();
        result1.close();
        connection.close();
      
    }
    catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "VeriTabani Baglanti Hatasi");
       
    }
    }  
    void Tumunu_Listele()
    {
    try {
      Class.forName("com.mysql.jdbc.Driver");

   // Oluşturduğumuz veritabanının adını,kullanıcı adı ve şifreyi göndip Mysql                 // bağlantı kuruyoruz. 
      connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/otel_rezervasyon?zeroDateTimeBehavior=convertToNull","root","");
      
      statement=connection.createStatement();
      statement1=connection.createStatement();
     // kişiler tablosundaki tum verileri alıyoruz  
      result=statement.executeQuery("Select * from musteriler ");
      
      //Veri tabanındaki sutunlarin sayisini alıyoruz.
       sutunSayisi=result.getMetaData().getColumnCount();
       
       result1=statement1.executeQuery("Select * from oda_bilgileri ");

      //Veri tabanındaki sutunlarin sayisini alıyoruz.
       sutunSayisi1=result1.getMetaData().getColumnCount();
       //Table tipinde model olusturuyoruz.
        DefaultTableModel table=new DefaultTableModel();
        DefaultTableModel table1=new DefaultTableModel();

       //table referansına veritabanındaki sutunları ekliyoruz.
        for(int i=1;i<=sutunSayisi;i++)
            table.addColumn(result.getMetaData().getColumnName(i));
         for(int i=1;i<=sutunSayisi1;i++)
            table1.addColumn(result1.getMetaData().getColumnName(i));
     
       //Veritabanindaki tum satir ve sutunlari tarayip Table'a ekliyoruz.
         while(result.next()){
              Object[] row=new Object[sutunSayisi];
               for(int i=1;i<=sutunSayisi;i++)
                  row[i-1]=result.getObject(i);
              table.addRow(row);
         }
         while(result1.next()){
              Object[] row1=new Object[sutunSayisi1];
               for(int i=1;i<=sutunSayisi1;i++)
                  row1[i-1]=result1.getObject(i);
              table1.addRow(row1);
         }

        
         jTable2.setModel(table1);
         jTable1.setModel(table);

       //baglantıları kapatıyoruz.
        result.close();
        result1.close();
        connection.close();
    }
    catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "VeriTabani Baglanti Hatasi");
    }
    }  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musteri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JTextField ad2;
    private javax.swing.JTextField ara;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField kimlik;
    private javax.swing.JTextField kimlik2;
    private javax.swing.JTextField oda_no;
    private javax.swing.JTextField oda_no2;
    private javax.swing.JTextField silkimlik;
    private javax.swing.JTextField soyad;
    private javax.swing.JTextField soyad2;
    // End of variables declaration//GEN-END:variables

   
}
