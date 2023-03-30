/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day24_StringClass1;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("String methods in Java.");
        String str1 = "Java Course";
        String str2 ="";

        System.out.println("str1.length() = " + str1.length());
        System.out.println("str2.length() = " + str2.length());

        str2 = "                             Java Course    ";
        System.out.println("str2 = " + str2);
        System.out.println("str2.length() = " + str2.length());

        //.trim()
        str2 = str2.trim();

        System.out.println("str2.trim() = " + str2);
        System.out.println("str2.length() = " + str2.length());

        //.charAt()

        System.out.println("str1.charAt(0) = " + str1.charAt(0)); //ilk karakter
        System.out.println("str1.charAt(2) = " + str1.charAt(2)); //Üçüncü karakter
        char harf = str1.charAt(3);
        System.out.println("harf = " + harf);

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + ",");
        }

        /*Scanner input = new Scanner(System.in);
        System.out.print("Devam etmek için (Evet/E) giriniz: ");
        String devamMi = input.next();
        if(devamMi.charAt(0)=='E' || devamMi.equals("Evet")){
            System.out.println("Devam ettik.");
        } else System.out.println("Programdan çıkıldı.");*/

    }
}
