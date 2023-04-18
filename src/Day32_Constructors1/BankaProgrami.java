/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day32_Constructors1;

public class BankaProgrami {
    public static void main(String[] args) {
        Banka banka = new Banka("ABC Bank", "Ankara-Çankaya");

        Musteri musteri1 = new Musteri("Ahmet", "12345678901", 5555678900L, 1000);
        Musteri musteri2 = new Musteri("Hatice", "56345678905", 5355878950L, 1000);
        Musteri musteri3 = new Musteri("Ali", "56323678905", 5325878950L, 1000);
        Musteri musteri4 = new Musteri("Zeki", "56345678455", 5335878950L, 1000);
        Musteri musteri5 = new Musteri("Ayşe", "56345222905", 5435878950L, 1000);

        banka.musteriEkle(musteri1);
        banka.musteriEkle(musteri2);
        banka.musteriEkle(musteri3);
        banka.musteriEkle(musteri4);
        banka.musteriEkle(musteri5);
        System.out.println();

        System.out.println("musteri1.getBakiye() = " + musteri1.getBakiye());
        banka.paraYatir(musteri1, 1500);
        System.out.println("musteri1.getBakiye() = " + musteri1.getBakiye());

        System.out.println("musteri2.getBakiye() = " + musteri2.getBakiye());
        banka.paraCek(musteri2, 500);
        System.out.println("musteri2.getBakiye() = " + musteri2.getBakiye());

        banka.showInfo();

        banka.musteriBulHesapNo(1001);
        System.out.println();
        banka.musteriBulAd("ALİ");
    }
}
