/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day28_REVIEW_Arrays.KutuphaneNEW;

public class KutuphaneNEW {
    String adi;
    String adresi;
    int kapasite;
    KitapNEW[] kitaplar;
    int kitapSayisi; //Kütüphaneye eklenen kitap sayısı


    public KutuphaneNEW(String adi, String adresi, int kapasite) {
        this.adi = adi;
        this.adresi = adresi;
        this.kitaplar = new KitapNEW[kapasite];
        kitapSayisi = 0;
    }

    public void kitapEkle(KitapNEW kitap){
        if (kitapSayisi <= kitaplar.length) {
            kitaplar[kitapSayisi] = kitap;
            kitapSayisi++;
        } else System.out.println("Kütüphanenin kitap ekleme kapasitesi doldu!");
    }
    public void kitapYazarListe(String kitapAdi){
        for (int i = 0; i < kitaplar.length; i++) {
            if(kitaplar[i].ismi.contains(kitapAdi)){
                for (int j = 0; j < kitaplar[i].yazarlarListe().length; j++) {
                    kitaplar[i].yazarlarListe()[j].printInfo();
                }
            }
        }
    }
    public void printInfo(){
        System.out.println("Kütüphanenin adı    : " + adi);
        System.out.println("Kütüphanenin adresi : " + adresi);
        System.out.println("-------------------------------------------------------");
       // System.out.println("Kitaplar : " + Arrays.toString(kitaplar));
        for (int i = 0; i < kitaplar.length; i++) {
            if(kitaplar[i] != null){
                kitaplar[i].printInfo();
                System.out.println("-------------------------------");
            }
        }
    }
}
