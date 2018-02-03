/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCRUD.PostgreSQL;

import DBConnections.allConnections;
import DBFramework.ICRUD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
       
        try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("insert into tblmusteri(id,tckimlik,ad,soyad) values('2','22222222222','Muhammet','HHHHHHH')");
            ifade.executeUpdate();
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblmusteri.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

    @Override
    public void Duzenle(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Sil(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> Listele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object Bul(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    public static void main(String[] args) {
        tblmusteri musteri = new tblmusteri();
        
        musteri.Kaydet("");

    }
    
    
}
