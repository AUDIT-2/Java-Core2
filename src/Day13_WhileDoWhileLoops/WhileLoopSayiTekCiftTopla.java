/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day13_WhileDoWhileLoops;

import java.util.Scanner;

public class WhileLoopSayiTekCiftTopla {
    //Klavyeden girilen tam sayıya kadar olan tek sayıların ve çift sayıların toplamını hesaplayan bir program yazınız.
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        int tekSayilarToplam = 0;
        int ciftSayilarToplam = 0;
        int genelToplam = 0;

        int sayi = 0;
        int sayac = 0;

        System.out.print("Klavyeden bir tam sayı giriniz : ");
        sayi = klavye.nextInt();

        while (sayac <= sayi){
            if(sayac % 2 == 0){
                ciftSayilarToplam += sayac;
            }else tekSayilarToplam += sayac;
            sayac++;
        }
        //if kullanmadan çift sayıların toplamını bulan loop
       /* sayac = 0;
        while (sayac <= sayi){
            ciftSayilarToplam += sayac;
            sayac += 2;
        }*/

        System.out.println("Çift sayıların toplamı = " + ciftSayilarToplam);
        System.out.println("Tek sayıların toplamı  = " + tekSayilarToplam);
        System.out.println("Genel toplam = " + (ciftSayilarToplam + tekSayilarToplam));
    }
}
