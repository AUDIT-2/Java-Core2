/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.Constructor;

public class OgrenciTest {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Ahmet","Falanca",1234);

        System.out.println("ogr1.getAd() = " + ogr1.getAd());
        System.out.println("ogr1.getSoyad() = " + ogr1.getSoyad());
        System.out.println("ogr1.getOkulNo() = " + ogr1.getOkulNo());
    }
}
