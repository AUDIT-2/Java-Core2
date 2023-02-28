/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day11_SwitchCase;

import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        Scanner islemOpr = new Scanner(System.in);
        Scanner sayiGir = new Scanner(System.in);

        String islemOperatoru = "";
        int sayi1 = 0;
        int sayi2 = 0;
        int sonuc = 0;

        System.out.println("Hesap makinesi....");
        System.out.println("------------------");
        System.out.println("İşlem operatörleri---> '+' , '-', '*', '/' ");

        System.out.print("İşlem operatörünü giriniz ---> ");
        islemOperatoru = islemOpr.nextLine();

        System.out.print("1.sayıyı giriniz ---> ");
        sayi1 = sayiGir.nextInt();

        System.out.print("2.sayıyı giriniz ---> ");
        sayi2 = sayiGir.nextInt();

        if(sayi1 != 0 && sayi2 != 0){
            switch (islemOperatoru){
                case "+":
                    sonuc = sayi1 + sayi2;
                    break;
                case "-":
                    sonuc = sayi1 - sayi2;
                    break;
                case "*":
                    sonuc = sayi1 * sayi2;
                    break;
                case "/":
                    sonuc = sayi1 / sayi2;
                    break;
                default:
                    System.out.println("Yanlış bir operatör girdiniz!");
            }
            System.out.println("İşlem sonuc ---> " + sonuc);
        } else System.out.println("Girdiğiniz sayılar 0'dan farklı olmalıdır!");
    }
}
