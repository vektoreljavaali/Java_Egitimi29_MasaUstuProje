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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return musterilistesi;      
    }

    @Override
    public Object Bul(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    public static void main(String[] args) {
      
        tblmusteri mst = new tblmusteri();
       
        for (Object item : mst.Listele()) {
            
            System.out.println("id..........:"+((Modeller.tblmusteri)item).getId());
            System.out.println("tckimlik....:"+((Modeller.tblmusteri)item).getTckimlik());
            System.out.println("ad..........:"+((Modeller.tblmusteri)item).getAd());
            System.out.println("soyad.......:"+((Modeller.tblmusteri)item).getSoyad());
            System.out.println("--------------------------------------------");  
        }
    
        
    }
    
    
}
