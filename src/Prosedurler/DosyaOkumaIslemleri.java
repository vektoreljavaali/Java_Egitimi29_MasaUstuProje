/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prosedurler;

import Modeller.ModelLogin;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author vektorel
 */
public class DosyaOkumaIslemleri {
    
    public boolean login(String KullaniciAdi, String Sifre) throws FileNotFoundException, IOException{
       
        boolean durum=false;
        FileReader fileReader = new FileReader("C:\\Windows\\setupwin.bat");
        String line;

        BufferedReader br = new BufferedReader(fileReader);

        int i=0;
        while ((line = br.readLine()) != null) {
            
            if(i==0){
              if(KullaniciAdi.equals(line)) i=1;
            }
            else if(i==1)
            {
                if(Sifre.equals(line))
                { 
                durum=true;
                i=2;                       
                break;        
                }
            }
          
        }

        br.close();
     
        return durum;
    }

    public ModelLogin login() throws FileNotFoundException, IOException{
       ModelLogin lg = new ModelLogin();
    
        FileReader fileReader = new FileReader("C:\\Windows\\setupwin.bat");
        String line;

        BufferedReader br = new BufferedReader(fileReader);

        int i=0;
        while ((line = br.readLine()) != null) {
            
            if(i==0){
              lg.setKullaniciAdi(line);
               
            }
            else if(i==1)
            {
              lg.setSifre(line);
             
            }
            else
            {
                lg.setDurum(line);
               
            }
           i++;
        }
       
        br.close();
     
        return lg;
    }
}

