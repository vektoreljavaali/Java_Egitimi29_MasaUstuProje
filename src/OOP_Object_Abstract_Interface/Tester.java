/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Object_Abstract_Interface;

/**
 *
 * @author vektorel
 */
public class Tester {
    
    
    
    public static void main(String[] args) {
    objeislemler obj = new objeislemler();
   
  //  obj.ekranayazdirobj(0.5);
  //  obj.ekranayazdirobj("Beş");
    
  //  obj.ekranayazdirI("fgdsgd");
    
    kisi k = new kisi();
    
    k.setId(1);
    k.setAdi("Muhammet");
    DBMusteriKayit db = new DBMusteriKayit();
    
    db.Kaydet(k);
    
    uye u = new uye();
    
    u.setUyeid(k.getId());
    u.setUyelikid(111111);

    DBUyeIslemleri uye = new DBUyeIslemleri();
    
    uye.Kaydet(u);

    
       
    
  
  
    }
    
    
}
