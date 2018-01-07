/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Kalitim;

/**
 *
 * @author vektorel
 */
public class Tester {
    
    public static void main(String[] args) {
        
        //En Üst Sınıfım
        Araba araba = new Araba();
        
            //Çocuk sınıf 1
            BinekArac binekarac = new BinekArac();
                
                // Torun sınıf
                ModelK modelk = new ModelK();
            
            //Çocuk sınıf 2
            Kamyon kamyon = new Kamyon();
            
   //     System.out.println("Ana Sınıf Bileşenleri..:"+ araba.yakitTuru);
   
      //  System.out.println("Çocuk Sınıf-1 Bileşenleri..:"+ binekarac.multimedia);
        
    //    kamyon.sur();
      
      //polimorphism 
        
      
        binekarac.hizlan();
      
        binekarac = new ModelK();
        
        binekarac.hizlan();
        
      //  kamyon = new ModelK();
        
        
        
        
        
        
        
        
    }
   
}
