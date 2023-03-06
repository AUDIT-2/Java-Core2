/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day13_WhileDoWhileLoops;

import java.util.Scanner;

public class SayiTahminWhile {
    public static void main(String[] args) {
        System.out.println("Sayı tahmin oyunu.");
       // System.out.println(Math.random());

        int randomNum;
        randomNum = (int)(Math.random() * 10 + 1) ; //10 -> üst limit 1-> alt limit

       /* System.out.println((int)(Math.random() * 100 + 1));
        System.out.println((int)(Math.random() * 1000 + 1));
        System.out.println((int)(Math.random() * 100000 + 1));
        System.out.println((int)(Math.random() * 1000000 + 1));*/

        Scanner scanner = new Scanner(System.in);
        int tahminSayim;

        /*if (tahminSayim == randomNum){
            System.out.println("Tebrikler tuttuğum sayıyı bildiniz.");
            System.out.println("Tuttuğum sayı = " + randomNum);
        }else System.out.println("Tahminiz yanlış!");*/

        System.out.print("1-10 arasında bir sayı tuttum. Tahmininiz ? ");
        tahminSayim = scanner.nextInt();

        int tahminAdedi = 1;
        while (tahminSayim != randomNum){
            tahminAdedi++;
            System.out.println("Tahmininiz yanlış!");
            if(tahminSayim > randomNum){
                System.out.println("Tahmin ettiğiniz sayı benim tuttuğum sayıdan büyük.");
            }else System.out.println("Tahmin ettiğiniz sayı benim tuttuğum sayıdan küçük.");
            System.out.print("Yeni tahmininiz ? ");
            tahminSayim = scanner.nextInt();
        }
        System.out.println("Tebrikler tuttuğum sayıyı " + tahminAdedi + " tahminde bildiniz.");
    }
}
