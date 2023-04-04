/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class StringStartWithEndWith {
    public static void main(String[] args) {
        String str = "Merhaba dünya Merhaba";

        System.out.println(str);
        System.out.println("str.startsWith(\"Merhaba\") = " + str.startsWith("Merhaba"));
        System.out.println("str.endsWith(\"Merhaba\") = " + str.endsWith("Merhaba"));
        System.out.println("-----------------------------------");

        System.out.println("str.startsWith(\"Ankara\") = " + str.startsWith("Ankara"));


    }
}
