/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeller;

/**
 *
 * @author vektorel
 */
public class tblsporsalonu {
   private long id;
   private String adi;
   private String iletisim;
   private String yonetici;
   private long resimgrupadi;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getIletisim() {
        return iletisim;
    }

    public void setIletisim(String iletisim) {
        this.iletisim = iletisim;
    }

    public String getYonetici() {
        return yonetici;
    }

    public void setYonetici(String yonetici) {
        this.yonetici = yonetici;
    }

    public long getResimgrupadi() {
        return resimgrupadi;
    }

    public void setResimgrupadi(long resimgrupadi) {
        this.resimgrupadi = resimgrupadi;
    }
   
   
}
