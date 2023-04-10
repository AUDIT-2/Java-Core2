/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day28_REVIEW_Arrays.Kutuphane;

public class Kutuphane {
    String adi;
    String adresi;
    Kitap[] kitaplar = new Kitap[100];

    public Kutuphane() {
    }

    public Kutuphane(String adi, String adresi, Kitap[] kitaplar) {
        this.adi = adi;
        this.adresi = adresi;
        this.kitaplar = kitaplar;
    }

    public void printInfo(){
        System.out.println("Kütüphanenin adı    : " + adi);
        System.out.println("Kütüphanenin adresi : " + adresi);
        System.out.println("---------------------------------------------");
       // System.out.println("Kitaplar : " + Arrays.toString(kitaplar));
        for (int i = 0; i < kitaplar.length; i++) {
            if(kitaplar[i] != null){
                kitaplar[i].printInfo();
                System.out.println("--------------------");
            }
        }
    }
}
