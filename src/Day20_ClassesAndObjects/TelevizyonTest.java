/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day20_ClassesAndObjects;

public class TelevizyonTest {
    public static void main(String[] args) {
        Televizyon televizyon1 = new Televizyon("Samsung","AbcXYX50",50);

        System.out.println(televizyon1.marka);
        System.out.println(televizyon1.model);
        System.out.println(televizyon1.ekranSize);

        televizyon1.bilgileriniYaz();

        televizyon1.tvAc();
        televizyon1.kanalDegistir(23);
        televizyon1.tvKapat();
        televizyon1.kanalDegistir(78);

        televizyon1.tvAc();
        televizyon1.sesAyarla(15);
        televizyon1.tvStatus();

        Televizyon televizyon2 = new Televizyon("LG","LG-YX50XZT",55);
        televizyon2.bilgileriniYaz();
        televizyon2.tvAc();
    }
}
