/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

import java.util.Scanner;

public class SimpleQuiz {
    //Klavyeden girilen sayı kadar soru aritmetik işlem sorus soran program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soruSayisi = 0;
        int cevap = 0;
        int dogruSay = 0;
        int yanlisSay = 0;

        System.out.print("Kaç adet soru oluşturayım? ");
        soruSayisi = sc.nextInt();

        for (int i = 1; i <= soruSayisi ; i++) {
            int sayi1 = (int)(Math.random() * 10 + 1);
            int sayi2 = (int)(Math.random() * 10 + 1);

            //sayi1 her zaman sayı2 den büyük olsun
            if(sayi1 < sayi2){
                int temp = sayi1;
                sayi1 = sayi2;
                sayi2 = temp;
            }
            System.out.println(i + ". soru ---> " + sayi1 + " + " + sayi2 + " =  ?" );
            System.out.print("Cevabınız --> ");
            cevap = sc.nextInt();
            if((sayi1 + sayi2) == cevap){
                System.out.println("Doğru bildiniz.");
                dogruSay++;
            } else {
                System.out.println("Cevabınız yanlış!!!");
                yanlisSay++;
            }
        }
        System.out.println("Doğru cevap sayınız = " + dogruSay);
        System.out.println("Yanlış cevap sayınız = " + yanlisSay);
    }
}
