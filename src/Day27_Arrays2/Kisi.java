/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day27_Arrays2;

public class Kisi {
    String adi;
    String soyadi;
    int telNo;
    String adres;

    public Kisi(String adi,String soyadi, int telNo, String adres){
        this.adi = adi;
        this.soyadi = soyadi;
        this.telNo = telNo;
        this.adres = adres;
    }
    public void printInfo(){
        System.out.println("Adı           : " + this.adi);
        System.out.println("Soyadı        : " + this.soyadi);
        System.out.println("Telefonu      : " + this.telNo);
        System.out.println("Adresi        : " + this.adres);
        System.out.println("-------------------------");
    }

    public static void isimdenBul(Kisi[] rehber, String isim){
        System.out.println("İsimden bul metodu çalıştı");
        int sayac = 0;
        for (Kisi kisi :rehber){
            if (kisi!=null && kisi.adi != null && kisi.adi.equals(isim)){
                sayac++;
                kisi.printInfo();
            }
        }
        if(sayac == 0){
            System.out.println(isim + " kişiye ait bilgiye rastlanmadı!");
        }
    }
}
