/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day16_Method1;

public class SayiToplama {
    public static void main(String[] args) {
        System.out.println("Parametre olarak gönderilen sayıların toplamını yazdıran metodlar.");
        sayiTopla(3,6);
        ucSayiTopla(3,6,45.67);
        carpma(20,15);
        kare(4);
    }

    public static void sayiTopla(int aSayisi, int bSayisi){
        System.out.println("sayiTopla() metodundayım.");
        /*int toplam = 0;
        toplam = aSayisi + bSayisi;
        System.out.println("Toplam = " + toplam);*/
        //System.out.println("Toplam = " + (aSayisi + bSayisi));
        sonucYaz("İki sayı topla", (aSayisi+bSayisi));
    }

    public static void ucSayiTopla(int aSayisi, int bSayisi, double cSayisi){
        System.out.println("ucSayiTopla() metodundayım.");
        //System.out.println("Toplam = " + (aSayisi + bSayisi + cSayisi));
        double toplam = aSayisi + bSayisi + cSayisi;
        sonucYaz("Üç sayı Topla" ,toplam);
    }

    public static void carpma(int sayi1, int sayi2){
        sonucYaz("Çarpma" , (sayi1 * sayi2));
    }

    public static void kare(int sayi){
        sonucYaz("Kare alma" ,(sayi * sayi));
    }
    public static void sonucYaz(String islemTuru, double sonuc){
        System.out.println("** " + islemTuru + " **" );
        System.out.println("** Sonuç = " + sonuc + " **");
        System.out.println("****************");
    }
}
