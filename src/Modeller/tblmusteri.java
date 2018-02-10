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
public class tblmusteri {
    private int id;
    private String tckimlik;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private Date dogumtarihi;
    private String ceptel;
    private String yakintel;
    private String resim;
    private String saglikdurumu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(String tckimlik) {
        this.tckimlik = tckimlik;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Date getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(Date dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public String getCeptel() {
        return ceptel;
    }

    public void setCeptel(String ceptel) {
        this.ceptel = ceptel;
    }

    public String getYakintel() {
        return yakintel;
    }

    public void setYakintel(String yakintel) {
        this.yakintel = yakintel;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public String getSaglikdurumu() {
        return saglikdurumu;
    }

    public void setSaglikdurumu(String saglikdurumu) {
        this.saglikdurumu = saglikdurumu;
    }


    
}
