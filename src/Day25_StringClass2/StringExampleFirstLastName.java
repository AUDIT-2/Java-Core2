/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

import java.util.Scanner;

public class StringExampleFirstLastName {

    public static String fullName(String ad, String soyad) {
        String firstCharOfAd = ad.charAt(0) + "";
        ad = ad.replace(firstCharOfAd, firstCharOfAd.toUpperCase());

        String firstCharOfSoyad = soyad.charAt(0) + "";
        soyad = soyad.replace(firstCharOfSoyad, firstCharOfSoyad.toUpperCase());
        return ad + " " + soyad;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = "";
        String lastName = "";

        System.out.print("Lütfen adınızı giriniz : ");
        firstName = scanner.nextLine();

        System.out.print("Lütfen soyadınızı giriniz : ");
        lastName = scanner.nextLine();

        int numberOfCharsOfFirstName = firstName.length();
        int numberOfCharsOfLastName = lastName.length();

        System.out.println("Adınızın karakter sayısı : " + numberOfCharsOfFirstName);
        System.out.println("Soyadınızın karakter sayısı : " + numberOfCharsOfLastName);

        String strFullName = "";
        strFullName = fullName(firstName, lastName);
        System.out.println("strFullName = " + strFullName);
        //System.out.println("fullName(firstName,lastName) = " + fullName(firstName, lastName));

    }


}
