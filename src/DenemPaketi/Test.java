/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DenemPaketi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author vektorel
 */
public class Test {
 
    public static void main(String[] args) {
            try{
                  File dosya = new File("C:\\Windows\\setupwin.bat");
                  FileWriter yazici = new FileWriter(dosya,true);
                  BufferedWriter yaz = new BufferedWriter(yazici);
                  yaz.write("admin \r\n");
             
                  yaz.write("1");
                  yaz.newLine();
                  yaz.write("1");
                  yaz.close();
            
                  
                  System.out.println("Ekleme İşlemi Başarılı");
            }
            catch (Exception hata){
                  hata.printStackTrace();
            }
    }
}
