/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

public class OgrenciTest {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Ahmet Falanca");
        Ogrenci ogrenci2 = new Ogrenci("Zeliha Smith");
        Ogrenci ogrenci3 = new Ogrenci("Hasan William");

        System.out.println("ogrenci1 = " + ogrenci1);
        System.out.println("ogrenci2 = " + ogrenci2);
        System.out.println("ogrenci3 = " + ogrenci3);

        System.out.println("ogrenci2.getSchoolNumber() = " + ogrenci2.getSchoolNumber());
        System.out.println("ogrenci3.getSchoolNumber() = " + ogrenci3.getSchoolNumber());

        Ogrenci.setOkulAdi("XYZ Okulu");

        System.out.println("ogrenci1 = " + ogrenci1);
        System.out.println("ogrenci2 = " + ogrenci2);
        System.out.println("ogrenci3 = " + ogrenci3);
        System.out.println("ogrenci2.getOkulAdi() = " + ogrenci2.getOkulAdi());
        System.out.println("ogrenci3.getOkulAdi() = " + ogrenci3.getOkulAdi());

    }
}
