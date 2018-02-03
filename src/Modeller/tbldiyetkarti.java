/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeller;

import java.util.Date;

/**
 *
 * @author vektorel
 */
public class tbldiyetkarti {
   private long id;
   private String ogun;
   private Date tarih;
   private String saat;
   private double kalori;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOgun() {
        return ogun;
    }

    public void setOgun(String ogun) {
        this.ogun = ogun;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public double getKalori() {
        return kalori;
    }

    public void setKalori(double kalori) {
        this.kalori = kalori;
    }
   
   
}
