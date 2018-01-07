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
public class DBMusteriKayit implements IDBIslem{

  
    public void Kaydet(Object o) {
       
        System.out.println("Kişi İD....:"+ ((kisi)o).getId());
        System.out.println("Kişi Adi....:"+ ((kisi)o).getAdi());
        
    }
    
}
