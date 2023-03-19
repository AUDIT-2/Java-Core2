/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day18_REVIEW_Methods;

import java.util.Scanner;

public class Palindrome {
    public static int reversingInteger(int sayi){
        int reverseSayi = 0;
        while (sayi > 0){
            reverseSayi = reverseSayi * 10 + sayi % 10;
            sayi = sayi / 10; // say = 0
        }
        return reverseSayi;
    }
    public static void main(String[] args) {
        //Palindrome sayılar tersinin kendisine eşit olduğu sayılardır. Mesela sayi= 121  tersSayi = 121   sayi==tersSayi ---> palindromedur.
        Scanner sc = new Scanner(System.in);
        int sayi = 0;
        boolean isPalindrome = false;

        System.out.print("Palindrome olup olmadığını test edeceğiniz bir tam sayı giriniz : ");
        sayi = sc.nextInt();

        if(sayi == reversingInteger(sayi)){
            isPalindrome = true;
        }
        System.out.println("is palindrome = " + isPalindrome);

        if(sayi == reversingInteger(sayi)){
            System.out.println(sayi +  " bir palindrome sayıdır.");
        } else System.out.println(sayi +  " bir palindrome sayı değildir.");

        int tersInt = 0;
        tersInt = reversingInteger(sayi);

        if(sayi == tersInt){
            System.out.println(sayi +  " bir palindrome sayıdır.");
        } else System.out.println(sayi +  " bir palindrome sayı değildir.");
    }
}
