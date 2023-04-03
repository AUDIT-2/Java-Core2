/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class StringContains {
    public static void main(String[] args) {
        String myStr = "Hello";
        System.out.println("myStr.contains(\"el\") = " + myStr.contains("el"));

        boolean varMi = myStr.contains("Hel");
        if (varMi){
            System.out.println("Hello kelimesi içerisinde Hel vardır.");
        }else System.out.println("Hello kelimesi içerisinde Hel yoktur.");

    }
}
