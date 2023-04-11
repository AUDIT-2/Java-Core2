/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day21_MemoryGarbageCollection;

public class MarketProg {
    public static void main(String[] args) {
        System.out.println("Halk markete hoşgeldiniz.");
        Product urun1 = new Product();
        urun1.name = "Elma";
        urun1.unitPrice = 15.75;
        urun1.ammount = 2;

        Product urun2 = new Product("Peynir",185,1.5);
        Product urun3 = new Product("Zeytin",75,2);

        System.out.println("Halk Market YazarNEW Kasa Fişi");
        System.out.println("---------------------------");
        System.out.println(urun2.name + " " + " " + urun2.ammount + " " + urun2.unitPrice + " " + urun2.fiyatHesapla() + " Kdv hariç");
        System.out.println("                   " + urun2.kdvHesapla() + " Kdv dahil");

        System.out.println(urun1.name + " " + " " + urun1.ammount + " " + urun1.unitPrice + " " + urun1.fiyatHesapla() + " Kdv hariç");
        System.out.println("                   " + urun1.kdvHesapla() + " Kdv dahil");

        System.out.println(urun3.name + " " + " " + urun3.ammount + " " + urun3.unitPrice + " " + urun3.fiyatHesapla() + " Kdv hariç");
        System.out.println("                   " + urun3.kdvHesapla() + " Kdv dahil");

        double toplam = urun1.fiyatHesapla() + urun2.fiyatHesapla() + urun3.fiyatHesapla();
        double toplamKDV = urun1.kdvHesapla() + urun2.kdvHesapla() + urun3.kdvHesapla();
        System.out.println("------------------Toplam(KDV hariç) = " + toplam );
        System.out.println("------------------Toplam(KDV dahil) = " + toplamKDV );

        System.out.println(urun1);
        urun1 = null;
        System.out.println(urun1);

        urun2 = urun3;

        System.gc(); //Garbage collection çalıştırmak için
    }
}
