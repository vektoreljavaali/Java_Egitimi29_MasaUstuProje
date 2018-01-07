/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Final;

/**
 *
 * @author vektorel
 */
public class Tester extends finalclas{
    
  static  finalclas fk = new finalclas();
  static finalsinif fs = new finalsinif();
    public static void main(String[] args) {
        
       // fk.KurumAdi = "Yeni Spor Salonu";
       
       
       System.out.println(fk.KurumAdi);
        
    }

    @Override
    public void freeuyelik(String uyeAdi) {
        System.out.println("Free üyelik değişti");
    }
    
    /// public void uyelik(String uyeAdi){   }
   
    
}
