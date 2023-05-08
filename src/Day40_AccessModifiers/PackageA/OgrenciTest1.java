/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.PackageA;

import Day40_AccessModifiers.Constructor.Ogrenci;

public class OgrenciTest1 extends Ogrenci {
    public OgrenciTest1() {
    }

    public OgrenciTest1(String ad, String soyad, int okulNo) {
        super(ad, soyad, okulNo);
    }

    public static void main(String[] args) {
       // Ogrenci ogr1 = new Ogrenci("Ahmet","Falanca",1234);

        OgrenciTest1 ogr1 = new OgrenciTest1("Ahmet","Falanca",1234);
        System.out.println("ogr1.getAd() = " + ogr1.getAd());
        System.out.println("ogr1.getSoyad() = " + ogr1.getSoyad());
        System.out.println("ogr1.getOkulNo() = " + ogr1.getOkulNo());
    }
}
