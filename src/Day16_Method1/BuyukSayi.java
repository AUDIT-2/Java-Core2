/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day16_Method1;

import java.util.Scanner;

public class BuyukSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // buyukSayi();
        buyukSayiParams(596,67);
        buyukSayiParams(45,7);
        buyukSayiParams(23,69);
        buyukSayiParams(12,3);
        buyukSayiParams(12,12);

        System.out.print("Birinci tam sayıyı klavyeden giriniz : ");
        int say1 = sc.nextInt();

        System.out.print("İkinci tam sayıyı klavyeden giriniz : ");
        int say2 = sc.nextInt();

        buyukSayiParams(say1,say2);

    }

    public static void buyukSayiParams(int number1, int number2){
        System.out.println("Parametre olarak gönderilen iki sayıdan büyüğünü ekrana yazdıran parametre alan metod.");

        System.out.println("Sayı1 = " + number1);
        System.out.println("Sayı2 = " + number2);
        if (number1 > number2){
            System.out.println(number1 +  " en büyük sayıdır.");
        }else if(number1 == number2) {
            System.out.println("Heriki sayı birbirine eşittir.");
        }else System.out.println(number2 +  " en büyük sayıdır.");

        System.out.println();
    }

    public static void buyukSayi(){
        System.out.println("İki sayıdan büyüğünü ekrana yazdıran metod.");
        int sayi1 = 340;
        int sayi2 = 45;

        System.out.println("Sayı1 = " + sayi1);
        System.out.println("Sayı2 = " + sayi2);
        if (sayi1 > sayi2){
            System.out.println(sayi1 +  " en büyük sayıdır.");
        }else System.out.println(sayi2 +  " en büyük sayıdır.");
    }
}
