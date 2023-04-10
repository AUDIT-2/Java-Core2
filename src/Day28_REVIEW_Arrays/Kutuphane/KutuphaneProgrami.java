/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day28_REVIEW_Arrays.Kutuphane;

import java.util.Scanner;

public class KutuphaneProgrami {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane();
        kutuphane.adi = "Halk kütüphanesi";
        kutuphane.adresi = "ABC Caddesi no 123";

        Kitap kitap1 = new Kitap();
        Kitap kitap2 = new Kitap();
        Kitap kitap3 = new Kitap();
        Kitap kitap4 = new Kitap();

        Yazar yazar1 = new Yazar("Victor Hugo");
        Yazar yazar2 = new Yazar("Orhan Pamuk");
        Yazar yazar3 = new Yazar("Ömer Seyfettin");

        kitap1.ismi = "Sefiller";
        kitap1.turu = "Roman";
        kitap1.basimYili = 2023;
        kitap1.sayfaSayisi = 350;
        kitap1.yayinEvi = "ABC yayınevi.";
        kitap1.isbn = "ABC12344-90";

        kitap1.yazarlar[0] = yazar1;

        kitap2.ismi = "Benim Adım Kırmızı";
        kitap2.turu = "Roman";
        kitap2.basimYili = 2018;
        kitap2.sayfaSayisi = 225;
        kitap2.yayinEvi = "XYZ yayınevi.";
        kitap2.isbn = "XYZ-ABC12344-90";

        kitap2.yazarlar[0] = yazar2;
        kitap2.yazarlar[1] = yazar1;

        kutuphane.kitaplar[0] = kitap1;
        kutuphane.kitaplar[1] = kitap2;
        kutuphane.kitaplar[3] = kitap3;
        kutuphane.kitaplar[4] = kitap4;

        Scanner verGir = new Scanner(System.in);
        for (int i = 0; i < kutuphane.kitaplar.length; i++) {
            if( kutuphane.kitaplar[i] != null ) continue;
            kutuphane.kitaplar[i] = new Kitap();

            System.out.print("Kitap adını giriniz: ");
            kutuphane.kitaplar[i].ismi = verGir.nextLine().trim();

            System.out.print("Kitabın türü : ");
            kutuphane.kitaplar[i].turu = verGir.nextLine().trim();
            String devammi ="";

            for (int j = 0; j < kutuphane.kitaplar[i].yazarlar.length; j++) {
                kutuphane.kitaplar[i].yazarlar[j] = new Yazar();
                System.out.print("Yazar adını giriniz : ");
                kutuphane.kitaplar[i].yazarlar[j].adi = verGir.nextLine();
                System.out.print("Yazar  eklemeye devam etmek istiyor musun? ---> ");
                devammi = verGir.nextLine().trim();
                if (devammi.equals("h")){
                    break;
                }
            }
            System.out.print("Kitap eklemeye devam etmek istiyor musun? ---> ");
            devammi = verGir.nextLine().trim();
            if (devammi.equals("h")){
                break;
            }
        }
        kutuphane.printInfo();
    }
}
