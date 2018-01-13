/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VeriTabani;

import java.util.ArrayList;

/**
 *
 * @author Javaci
 */
public interface IDBIslemleri {
    
    public void Kaydet(Object o);
    public void Duzenle(Object o);
    public void Sil(int id);
    public ArrayList<Object> Listele();
    public Object Bul(int id);
    
    
}
