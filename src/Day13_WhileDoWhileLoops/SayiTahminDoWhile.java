/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day13_WhileDoWhileLoops;

import java.util.Scanner;

public class SayiTahminDoWhile {
    //Do while loop ile sayı tahmin oyunu
    public static void main(String[] args) {
        int rastgeleSayi = (int)(Math.random() * 10 + 1) ; // 1-10 arası rastgele bir sayı üretir

        Scanner scanner = new Scanner(System.in);
        int tahminim;
        int tahminSayisi = 0;

        System.out.println("Java'da do while loop ile sayı tahmin oyununa hoş geldiniz.");
        System.out.println("Sizin için 1-10 arasında rastgele bir sayı tuttum.");
        System.out.println("-----------------------------------------------------------");
        do {
            tahminSayisi++;
            System.out.print("Tahmininizi giriniz : ");
            tahminim = scanner.nextInt();
            if(tahminim > rastgeleSayi){
                System.out.println("Tahminin benim tuttuğum sayıdan büyük.");
            }else if(tahminim == rastgeleSayi) {
                //System.out.println("*** Tebrikler bildiniz. ***");
                System.out.println("*** Tebrikler " + tahminSayisi + " tahminde bildiniz ***");
            }else System.out.println("Tahminin benim tuttuğum sayıdan küçük.");
        }while (tahminim != rastgeleSayi);
    }
}
