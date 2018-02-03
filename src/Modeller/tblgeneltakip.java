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
public class tblgeneltakip {
    
    private long id;
    private Date tarih;
    private double boy;
    private double kilo;
    private double yagorani;
    private double kasorani;
    private int yas;
    private double belcevresi;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public double getYagorani() {
        return yagorani;
    }

    public void setYagorani(double yagorani) {
        this.yagorani = yagorani;
    }

    public double getKasorani() {
        return kasorani;
    }

    public void setKasorani(double kasorani) {
        this.kasorani = kasorani;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getBelcevresi() {
        return belcevresi;
    }

    public void setBelcevresi(double belcevresi) {
        this.belcevresi = belcevresi;
    }
    
    
    
}
