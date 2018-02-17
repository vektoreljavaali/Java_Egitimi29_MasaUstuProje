/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCRUD.PostgreSQL;

import DBConnections.allConnections;
import DBFramework.ICRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.converter.LocalDateTimeStringConverter;

/**
 *
 * @author vektorel
 */
public class tblmusteri implements ICRUD{

    allConnections baglanti = new allConnections();
    
    @Override
    public void Kaydet(Object o) {
       Modeller.tblmusteri musteri;
       musteri = (Modeller.tblmusteri)o;
        try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("insert into tblmusteri(tckimlik,ad,soyad) values(?,?,?)");
                     
            ifade.setString(1,musteri.getTckimlik() );
            ifade.setString(2,musteri.getAd() );
            ifade.setString(3,musteri.getSoyad() );
            System.out.println(ifade.toString());        
            ifade.executeUpdate();
            baglanti.ConnClose();
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

    @Override
    public void Duzenle(Object o) {
        Modeller.tblmusteri musteri;
       musteri = (Modeller.tblmusteri)o;
        try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("update tblmusteri set ad=?,soyad=?,tckimlik=? where id=?");
       
            ifade.setString(1,musteri.getAd() );
            ifade.setString(2,musteri.getSoyad() );
            ifade.setString(3,musteri.getTckimlik() );
            ifade.setInt(4, musteri.getId());
            System.out.println(ifade.toString());        
            ifade.executeUpdate();
               baglanti.ConnClose();
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void Sil(long id) {
        try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("delete from tblmusteri where id=?");
            ifade.setInt(1, (int)id);
            ifade.executeUpdate();
               baglanti.ConnClose();
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public List<Object> Listele() {
        ArrayList<Object> musterilistesi= new ArrayList<>();
        ResultSet rs;
          Modeller.tblmusteri item;
        try {
             PreparedStatement  ifade = baglanti.baglan().prepareCall("select * from tblmusteri");
             rs= ifade.executeQuery();
             while(rs.next()){
             item = new Modeller.tblmusteri();
             item.setId(rs.getInt("id"));
             item.setTckimlik(rs.getString("tckimlik"));
             item.setAd(rs.getString("ad"));
             item.setSoyad(rs.getString("soyad"));
             musterilistesi.add(item);
             }
              baglanti.ConnClose(); 
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return musterilistesi;      
    }

    @Override
    public Object Bul(long id) {
      Modeller.tblmusteri musteri = new Modeller.tblmusteri();
      ResultSet rs;
        try {
            PreparedStatement ifade = baglanti.baglan().prepareCall("select * from tblmusteri where id=?");
            ifade.setInt(1, (int)id);
            rs = ifade.executeQuery();
          
            while(rs.next()){
            musteri.setAd(rs.getString("ad"));
            musteri.setSoyad(rs.getString("soyad"));
            musteri.setTckimlik(rs.getString("tckimlik"));
            musteri.setId(rs.getInt("id"));
            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return musteri;
    }
   
    
    public List<Modeller.tblmusteri> Arama(String ad,String soyad,String telefon,String cinsiyet){
    
        ArrayList<Modeller.tblmusteri> musterilistesi= new ArrayList<>();
        ResultSet rs;
        Modeller.tblmusteri item;
        String AnaSQL = "select * from tblmusteri";
        
//        if(ad!=null) AnaSQL+="ad like '%"+ad+"%' and "; else AnaSQL+="1=1 and ";
//        if(soyad!=null) AnaSQL+="soyad like '%"+soyad+"%' and ";else AnaSQL+="1=1 and ";
//        if(telefon!=null) AnaSQL+="ceptel like '%"+telefon+"%' and ";else AnaSQL+="1=1 and ";
//        if(cinsiyet!=null) AnaSQL+="cinsiyet like '%"+cinsiyet+"%'";else AnaSQL+="1=1 ";
//        System.out.println("SQL koşulu....:"+ AnaSQL);
//        
        if(ad!=null && soyad!=null && telefon!=null && cinsiyet!=null) AnaSQL+=" where ";

          int durum=0;
          if(ad!=null)
          {
              AnaSQL+="ad like '%"+ad+"%' ";
              durum=1;
          } 
          if(soyad!=null){
              AnaSQL+= ((durum==1?" and ": "") + "soyad like '%"+soyad+"%'");
                durum=1;
          }
          if(telefon!=null){
              AnaSQL+= ((durum==1?" and ": "") +"ceptel like '%"+telefon+"%'");
                durum=1;
          }
          if(cinsiyet!=null){
              AnaSQL+= ((durum==1?" and ": "") +"cinsiyet like '%"+cinsiyet+"%'");
          }
          System.out.println("SQL koşulu....:"+ AnaSQL);

        try {
            String SQL=AnaSQL;
             PreparedStatement  ifade = baglanti.baglan().prepareCall(SQL);
             rs= ifade.executeQuery();
             while(rs.next()){
             item = new Modeller.tblmusteri();
             item.setId(rs.getInt("id"));
             item.setTckimlik(rs.getString("tckimlik"));
             item.setAd(rs.getString("ad"));
             item.setSoyad(rs.getString("soyad"));
             musterilistesi.add(item);
             }
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return musterilistesi;      
    }
    
    public List<Modeller.tblmusteri> YasArama(int yasilk,int yasson) throws SQLException, ClassNotFoundException{
        ArrayList<Modeller.tblmusteri> mlist = new ArrayList<>();
        Modeller.tblmusteri mst;
        ResultSet rs;

        LocalDate gununTarihi = LocalDate.now();
        
       LocalDate ilkyas = gununTarihi.minusYears(yasilk);
       LocalDate sonyas = gununTarihi.minusYears(yasson);
        
        
        String SQL = "select * from tblmusteri where dogumtarihi between '"+sonyas+"' and '"+ilkyas+"' order by dogumtarihi";
        PreparedStatement ifade = baglanti.baglan().prepareCall(SQL);
        rs = ifade.executeQuery();
        while(rs.next()){
        mst = new Modeller.tblmusteri();
        mst.setAd(rs.getString("ad"));
        mst.setSoyad(rs.getString("soyad"));
        mst.setId(rs.getInt("id"));
        mst.setTckimlik(rs.getString("tckimlik"));
        mst.setDogumtarihi(rs.getDate("dogumtarihi"));
        mlist.add(mst);            
        }
       return mlist;
        
        
    }
    
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      
        tblmusteri mst = new tblmusteri();
       
       //Object item = mst.Bul(4); 
            
    
       
       
       
          for (Modeller.tblmusteri item : mst.Arama(null, null,null,null)) {
            System.out.println("id..........:"+(item).getId());
            System.out.println("tckimlik....:"+(item).getTckimlik());
            System.out.println("ad..........:"+(item).getAd());
            System.out.println("soyad.......:"+(item).getSoyad());
            System.out.println("soyad.......:"+(item).getDogumtarihi());
            
            System.out.println("--------------------------------------------");  
        
        }
//            
//        LocalDate tarih = LocalDate.now();
//        
//
//                System.out.println(tarih.withYear(2010));
//                 System.out.println(tarih.minusYears(10));
//        
//                
//          
//    
        
    }
    
    
}
