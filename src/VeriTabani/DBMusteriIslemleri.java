/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeriTabani;

import Modeller.ModelMusteri;
import Prosedurler.DosyaOkumaIslemleri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javaci
 */
public class DBMusteriIslemleri implements IDBIslemleri{

    DosyaOkumaIslemleri DBFile = new DosyaOkumaIslemleri();
    
    @Override
    public void Kaydet(Object o) {
        ModelMusteri musteri = (ModelMusteri)o;
        String kayit = "M"+musteri.getId()+":"+musteri.getAdi()+":"+musteri.getSoyadi()+":"+musteri.getAdresi()+":"+musteri.getTelefonu();
        
        try {
            DBFile.DosyayaEkle(kayit);
            
        } catch (IOException ex) {
            Logger.getLogger(DBMusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Duzenle(Object o) {
        try {
            List<String> Musteriler =DBFile.DosyaOkuma();
            ModelMusteri musteri = (ModelMusteri)o;
            String kayit = "M"+musteri.getId()+":"+musteri.getAdi()+":"+musteri.getSoyadi()+":"+musteri.getAdresi()+":"+musteri.getTelefonu();
            DBFile.DosyayaYaz("");
            for (String item : Musteriler) {
                if(item.contains(("M"+musteri.getId()))){
                     DBFile.DosyayaEkle(kayit);
                }
                else
                {
                DBFile.DosyayaEkle(item);
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(DBMusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void Sil(int id) {
        try {
            List<String> Musteriler =DBFile.DosyaOkuma();
            DBFile.DosyayaYaz("");
            for (String item : Musteriler) {
                if(item.contains("M"+id)){
                   
                }
                else
                {
                DBFile.DosyayaEkle(item);
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(DBMusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public ArrayList<Object> Listele() {
        ArrayList<Object> musterilistesi = new ArrayList<>();
        try {
            List<String> Musteriler =DBFile.DosyaOkuma();
            
            ModelMusteri musteri;
            for (String item : Musteriler) {
                musteri = new ModelMusteri();
                musteri.setId(Integer.parseInt(item.split(":")[0].substring(1)));
                musteri.setAdi(item.split(":")[1]);
                musteri.setSoyadi(item.split(":")[2]);
                musteri.setAdresi(item.split(":")[3]);
                musteri.setTelefonu(item.split(":")[4]);
                musterilistesi.add(musteri);
            }
        } catch (IOException ex) {
            Logger.getLogger(DBMusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return musterilistesi;
    }

    @Override
    public Object Bul(int id) {
        Object result="";
        try {
            List<String> Musteriler =DBFile.DosyaOkuma();
            
            ModelMusteri musteri;
            for (String item : Musteriler) {
       if(item.contains("M"+id))
       {
                musteri = new ModelMusteri();
                musteri.setId(Integer.parseInt(item.split(":")[0].substring(1)));
                musteri.setAdi(item.split(":")[1]);
                musteri.setSoyadi(item.split(":")[2]);
                musteri.setAdresi(item.split(":")[3]);
                musteri.setTelefonu(item.split(":")[4]);
        result = musteri;
       } 
       }
        } catch (IOException ex) {
            Logger.getLogger(DBMusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
       return result;
    }
    
    
}
