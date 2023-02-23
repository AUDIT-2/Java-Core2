/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day08_LogicalOperators;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Reversing an Integer.");
        //Write a java program to reverse a given integer number.
        //Example integer is 789
        int sayi = 789; // output ---> reverseSayi = 987
        int lastDigit = 0;
        int reverseSayi = 0;

        System.out.println("Given Integer       = " + sayi);
        //Algoritma
        //reverseSayi = reverseSayi * 10 + lastDigit;

        lastDigit = sayi % 10; // lastDigit = 9
        reverseSayi = reverseSayi * 10 + lastDigit;
        sayi = sayi / 10; // sayi = 78

       /* System.out.println("sayi        = " + sayi);
        System.out.println("Ters sayı   = " + reverseSayi);*/

        lastDigit = sayi % 10; // lastDigit = 8
        reverseSayi = reverseSayi * 10 + lastDigit;
        sayi = sayi / 10; // sayi = 7

       /* System.out.println("sayi        = " + sayi);
        System.out.println("Ters sayı   = " + reverseSayi);*/

        lastDigit = sayi % 10; // lastDigit = 7
        reverseSayi = reverseSayi * 10 + lastDigit;
        sayi = sayi / 10; // say = 0

       /* System.out.println("sayi        = " + sayi);
        System.out.println("Ters sayı   = " + reverseSayi);*/

        System.out.println("Reversed integer    = " + reverseSayi);
    }
}
