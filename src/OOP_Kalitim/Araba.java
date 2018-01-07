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
public class Araba {
    
    public String iskelet="Binek";
    public String motor="6 Silindir";
    public String lastikBoyutu="16 inch Jant";
    public String yakitTuru="Benzin";
   
    public int vites=5;
    public int lastikSayisi=4;
    
    private String deger="null";
    protected int deger2 = 0;
    
    public void topla(){
        System.out.println("toplam...:"+(1+2));
    }
    
    
    public void topla(int a, int b){
        System.out.println("toplam...:"+(1+2));
    }
    public void topla(double a, int b){
        System.out.println("toplam...:"+(1+2));
    }
      public void topla(int a, double b){
        System.out.println("toplam...:"+(1+2));
    }
     
    
    
}
