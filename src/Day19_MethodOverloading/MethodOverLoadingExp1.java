/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day19_MethodOverloading;

public class MethodOverLoadingExp1 {
    public static void yazdir(String str){
        System.out.println(str);
    }
    public static void yazdir(int sayi){
        System.out.println(sayi);
    }
    public static void yazdir(double sayi){
        System.out.println(sayi);
    }
    public static void yazdir (String str1, String str2){
        System.out.println(str1 + " " + str2);
    }
    public static void yazdir(String ad, int yas){
        System.out.println(ad + " " + yas + " yaşındadır.");
    }
    public static void yazdir(String ad, String soyad, int yas){
        yazdir(ad,soyad);
        System.out.println(yas + " yaşındadır.");
    }
    public static void main(String[] args) {
        yazdir("Ahmet");
        yazdir(123);
        yazdir(5.67);
        yazdir("Ahmet","Falanca");
        yazdir("Mehmet",45);
        yazdir("Ali","Veli",34);
    }
}
