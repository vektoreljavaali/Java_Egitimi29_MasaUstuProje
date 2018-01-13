/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prosedurler;

import Modeller.ModelLogin;
import Modeller.ModelMusteri;
import VeriTabani.DBMusteriIslemleri;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vektorel
 */
public class DosyaOkumaIslemleri {
    
    
    // Dosyanını sonuna ekleme yapar.
    public void DosyayaEkle(String o) throws IOException
    {
        File dosya = new File("D:/Kayitlar.txt");
        
        try (BufferedWriter cikis = new BufferedWriter(new FileWriter(dosya,true))) {
        
            cikis.write(o);
            cikis.newLine();
            cikis.close();
        }
                        
    }
        
    //Dosyanın içeriğini siler yeni girilen değerleri yazdırır.
    public void DosyayaYaz(String o) throws IOException
    {
     File dosya = new File("D:/Kayitlar.txt");
     
        try (BufferedWriter cikis = new BufferedWriter(new FileWriter(dosya,false))) {
        
            cikis.write(o);
            cikis.newLine();
            cikis.close();
        }
    }
    
    
    public   List<String> DosyaOkuma() throws IOException {
    File dosya = new File("D:/Kayitlar.txt");
    List<String> sonuc;
    try (Scanner tarayici = new Scanner(dosya)) {
        sonuc = new ArrayList<String>();
        while (tarayici.hasNextLine()) {
            sonuc.add(tarayici.nextLine());
        }
    }
    return sonuc;  
    }

    
    
    public static void main(String[] args) throws IOException {
        DBMusteriIslemleri mi  = new  DBMusteriIslemleri();
        ModelMusteri musteri = new ModelMusteri();
        musteri.setId(1);
        musteri.setAdi("Muhammet Ali");
        musteri.setSoyadi("HOCA");
        musteri.setAdresi("Ankara");
        musteri.setTelefonu("0 555 552 5522");
        mi.Kaydet(musteri);
        
          musteri.setId(2);
        musteri.setAdi("Ahmet");
        musteri.setSoyadi("TURAN");
        musteri.setAdresi("İstanbul");
        musteri.setTelefonu("0 212 552 5522");
        mi.Kaydet(musteri);
        
          musteri.setId(3);
        musteri.setAdi("Ayşe");
        musteri.setSoyadi("PERVİN");
        musteri.setAdresi("Bursa");
        musteri.setTelefonu("0 112 552 5522");
        mi.Kaydet(musteri);
        
        //mi.Duzenle(musteri);
        
    }
    
    
    
    
    
    
    
    
    
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

