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
        //Example integer is 7895
        int sayi = 7895; // output ---> reverseSayi = 5987
        int lastDigit = 0;
        int reverseSayi = 0;

        System.out.println("Given Integer = " + sayi);
        System.out.println("-------------------------");
        //Algoritma
        //reverseSayi = reverseSayi * 10 + lastDigit;

        System.out.println("Sayı      = " + sayi);
        System.out.println("Reversed integer = " + reverseSayi);
        lastDigit = sayi % 10; // lastDigit = 5
        reverseSayi = reverseSayi * 10 + lastDigit;
        sayi = sayi / 10; // sayi = 789

        System.out.println();
        System.out.println("LastDigit = " + lastDigit);
        System.out.println("Sayı      = " + sayi);
        System.out.println("Reversed integer = " + reverseSayi);

        lastDigit = sayi % 10; // lastDigit = 9
        reverseSayi = reverseSayi * 10 + lastDigit;
        sayi = sayi / 10; // sayi = 78

        System.out.println();
        System.out.println("LastDigit = " + lastDigit);
        System.out.println("Sayı      = " + sayi);
        System.out.println("Reversed integer = " + reverseSayi);

        lastDigit = sayi % 10; // lastDigit = 8
        reverseSayi = reverseSayi * 10 + lastDigit;
        sayi = sayi / 10; // say = 7
        System.out.println();
        System.out.println("LastDigit = " + lastDigit);
        System.out.println("Sayı      = " + sayi);
        System.out.println("Reversed integer = " + reverseSayi);

        lastDigit = sayi % 10; // lastDigit = 7
        reverseSayi = reverseSayi * 10 + lastDigit;
        sayi = sayi / 10; // say = 0

        System.out.println();
        System.out.println("LastDigit = " + lastDigit);
        System.out.println("Sayı      = " + sayi);
        System.out.println("Reversed integer = " + reverseSayi);
    }
}
