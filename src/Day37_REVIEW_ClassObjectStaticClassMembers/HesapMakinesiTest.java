/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers;

public class HesapMakinesiTest {
    public static void main(String[] args) {
        System.out.println("StaticHesapMakinesi.topla(5,7) = " + StaticHesapMakinesi.topla(5, 7));
        double dbl = StaticHesapMakinesi.topla(5, 7);
        System.out.println("dbl = " + dbl);

        StaticHesapMakinesi.carp(12,6);
        System.out.println("StaticHesapMakinesi.getSonuc() = " + StaticHesapMakinesi.getSonuc());

        StaticHesapMakinesi.carp(6,6);
        System.out.println("StaticHesapMakinesi.sonuc = " + StaticHesapMakinesi.sonuc);

        System.out.println("StaticHesapMakinesi.topla(3,4,5,6,7,12) = " + StaticHesapMakinesi.topla(3, 4, 5, 6, 7, 12));

    }
}
