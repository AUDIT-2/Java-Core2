/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class StringSubString {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(str.substring(6)); //world
        System.out.println(str.substring(0, 5)); //Hello

        int index = str.indexOf("world");
        System.out.println("str.substring(index) = " + str.substring(index));

    }
}
