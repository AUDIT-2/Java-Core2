/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day24_StringClass1;

public class PrintingAddressOfObjects {
    public static void main(String[] args) {
        System.out.println("Printing address of Objects.");
        Object obj1 = new Object(); //dummy
        Object obj2 = new Object();

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
        System.out.println("(obj1==obj2) = " + (obj1 == obj2));

        String str1 = "Merhaba";
        String str2 = "Merhaba";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("(str1==str2) = " + (str1 == str2));

        System.out.println("Address of str1 = " + Integer.toHexString(System.identityHashCode(str1)));
        System.out.println("Address of str2 = " + Integer.toHexString (System.identityHashCode(str2)));

        String str3 = new String("Merhaba");
        String str4 = new String("Merhaba");
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
        System.out.println("(str3 == str4) = " + (str3 == str4));

        System.out.println("Address of str3 = " + Integer.toHexString (System.identityHashCode(str3)));
        System.out.println("Address of str4 = " + Integer.toHexString (System.identityHashCode(str4)));

    }
}
