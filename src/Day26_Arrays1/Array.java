/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day26_Arrays1;

public class Array {
    public static void main(String[] args) {
        System.out.println("Arrays in Java.");
        String[] isimler;
        isimler = new String[3];
        isimler[0] = "Ahmet";
        isimler[1] = "Mehmet";
        isimler[2] = "Meryem";
      //  isimler[3] = "Hasan"; error

        System.out.println("isimler[2] = " + isimler[2]);
        System.out.println("isimler[0] = " + isimler[0]);

        String[] sehirler = new String[5];
        int[] sayilar = {5,6,25,67};

        System.out.println("sayilar[0] = " + sayilar[0]); //0. index birinci eleman
        System.out.println("sayilar[3] = " + sayilar[3]);
        sayilar[3] = 45;
        System.out.println("sayilar[3] = " + sayilar[3]);

        System.out.println("sehirler.length = " + sehirler.length); //Eleman sayısının verir.

        System.out.println(isimler[0] + " ," + isimler[1]);
        sehirler[0] = "Ankara";
        sehirler[1] = "İstanbul";

        System.out.println("sehirler[0] = " + sehirler[0]);
        System.out.println("sehirler[2] = " + sehirler[2]);

        System.out.println("sehirler[sehirler.length-4] = " + sehirler[sehirler.length - 4]);

        System.out.println("sayilar[sayilar.length-1] = " + sayilar[sayilar.length - 1]); //length-1 last eleman

    }
}
