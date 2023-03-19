/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day18_REVIEW_Methods;

import java.util.Scanner;

public class ReversingIntegerWithLoop {
    public static int reversingInteger(int sayi){
        int reverseSayi = 0;
        while (sayi > 0){
            reverseSayi = reverseSayi * 10 + sayi % 10;
            sayi = sayi / 10; // say = 0
        }
        return reverseSayi;
    }

    public static void main(String[] args) {
        int sayi = 12312331;
        int reverseSayi = 0;

        System.out.println("sayi = " + sayi);

        /*reverseSayi = reverseSayi * 10 + sayi % 10;
        sayi = sayi / 10; // say = 0

        System.out.println("sayi = " + sayi);

        reverseSayi = reverseSayi * 10 + sayi % 10;
        sayi = sayi / 10; // say = 0

        System.out.println("sayi = " + sayi);
        reverseSayi = reverseSayi * 10 + sayi % 10;
        sayi = sayi / 10; // say = 0*/

       /* while (sayi > 0){
            reverseSayi = reverseSayi * 10 + sayi % 10;
            sayi = sayi / 10; // say = 0
        }
        System.out.println("reverseSayi = " + reverseSayi);
        */

        System.out.println("reversingInteger(sayi) = " + reversingInteger(sayi));
        System.out.println("reversingInteger(123) = " + reversingInteger(123));
        System.out.println("reversingInteger(12345) = " + reversingInteger(12345));
        System.out.println("reversingInteger(9876543) = " + reversingInteger(9876543));

        Scanner klavye = new Scanner(System.in);
        System.out.print("Klavyeden bir tam sayı giriniz : ");
        // System.out.println("Girdiğiniz sayının tersi = " + reversingInteger(klavye.nextInt()));
        int girilenSayi = klavye.nextInt();
        System.out.println("Girdiğiniz sayının tersi = " + reversingInteger(girilenSayi));

    }
}
