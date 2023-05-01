/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Magaza;

import java.util.ArrayList;

public class Sepet {
    private int id;
    private ArrayList<Product> sepetUrunler;
    private double urunToplamFiyat = 0;

    public Sepet() {
        setId();
        sepetUrunler= new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id++;
    }

    public ArrayList<Product> getSepetUrunler() {
        return sepetUrunler;
    }

    public void addSepetUrun(Product product) {
        this.sepetUrunler.add(product);
    }
    public void addSepetUrun(Product... products) {
        for (Product product1:products){
            //this.sepetUrunler.add(product1);
            addSepetUrun(product1);
        }
    }

    public double getUrunToplamFiyat() {
        for (Product product: getSepetUrunler()){
            urunToplamFiyat += product.getToplamFiyat();
        }
        return urunToplamFiyat;
    }

    @Override
    public String toString() {
        String str ="";
        str += "Sr    Ürün adı     Birim F.  Miktar   Top.F.   Kategori\n";
        str += "---   ---------    --------  ------   ------   ---------------\n";
        int srNo = 1;
        for (Product product: getSepetUrunler()){
            str += srNo++ +"-\t" + product;
        }
        str += "\n            Ürünler toplam fiyatı =  " + getUrunToplamFiyat();
        return str;
    }
}




