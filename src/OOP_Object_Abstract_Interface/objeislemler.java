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
public class objeislemler {
    
    public void ekranayazdirS(String yazi){
        System.out.println("Yazi......:"+yazi);
    }
    
    public void ekranayazdirI(int yazi){
       System.out.println("Yazi......:"+yazi);
    }
    
    public void ekranayazdirobj(Object o){
        
        if(o instanceof Integer){
              int toplam = (int)o*2;
              System.out.println("integer toplam....:"+ toplam);
        }else if(o instanceof Double){
            double toplam = (double)o + 0.11;
             System.out.println("double toplam....:"+ toplam);
        }
        
      
        
        System.out.println("Yazi....:"+o);
    }
}
