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
public class DBUyeIslemleri implements IDBIslem{

    @Override
    public void Kaydet(Object o) {
       
        System.out.println("Üye id....:"+((uye)o).getUyeid());
        System.out.println("Üye id....:"+((uye)o).getUyelikid());
        
    }
    
    
}
