/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_Encapsulation;

/**
 *
 * @author vektorel
 */
public class Tester {
        
    public static void main(String[] args) {
        
        modelUyeler uye = new modelUyeler();
        
        uye.setId(5);
        uye.setUyeadi("Muhammet ");
        
        System.out.println(uye.getId());
        System.out.println(uye.getUyeadi());
        System.out.println(uye.getAidat());
        
        
    }
}
