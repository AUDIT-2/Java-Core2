/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day19_MethodOverloading;

import java.util.Scanner;

public class YearsUntilRetirement {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        emeklilikHesapla(45);
        System.out.println("yasHesapla(1997) = " + yasHesapla(1997));

        int dogumYil = yasHesapla(1975);
        emeklilikHesapla(dogumYil);
        emeklilikHesapla(yasHesapla(1984));
        emeklilikHesapla("Ahmet", 45);
        emeklilikHesapla(1993,"Hasan Falanca");

        System.out.println();
        System.out.println("EKRANDAN VERİ GİRİŞİ");
        System.out.println("--------------------");

        System.out.print("Adınızı giriniz    : ");
        String ad = klavye.nextLine();
        System.out.print("Yaşınızı giriniz   : ");
        int yas = klavye.nextInt();
        if(yas > 0){
            emeklilikHesapla(ad,yas);
        }else {
            System.out.print("Doğum yılınızı giriniz : ");
            int yil = klavye.nextInt();
            emeklilikHesapla(yil,ad);
        }
    }

    public static int yasHesapla(int dogumYil){
        int buYil = 2023;
        int yas = buYil - dogumYil;
        return yas;
    }

    public static void emeklilikHesapla(int age){
        int emeklilikYas = 65;
        int kalanYil = emeklilikYas - age;
        if(kalanYil > 0){
            System.out.println("Emeklilik için kalan süreniz --> " + kalanYil + " yıldır.");
        } else System.out.println("Emekliliği haketmişsiniz.");
    }

    public static void  emeklilikHesapla(String ad , int age){
        System.out.println("Merhaba " + ad);
        emeklilikHesapla(age);
    }

    public static void  emeklilikHesapla(int dogumYil, String ad){
        System.out.println("Merhaba " + ad);
        int age = yasHesapla(dogumYil);
        emeklilikHesapla(age);
    }
}
