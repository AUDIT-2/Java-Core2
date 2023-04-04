/*
 * Copyright (c) 2023.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class StringEmptyNull {
    public static void main(String[] args) {
        String str1 = ""; //Empty string and it has an address value
        String str2 = null; // Null string does not have any value, and it has no address OR has an address which points to 0
        String str3; // Null string does not have any value, and it is not created therefore has no address.

        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2)); //Address is = 0

        //Initialization is required  to print.
        //System.out.println("System.identityHashCode(str3) = " + System.identityHashCode(str3)); // Can not print an address because it is not being created.

        System.out.println("str1.isEmpty() = " + str1.isEmpty()); // it prints true for "" and false for "  "
        System.out.println("str1.isBlank() = " + str1.isBlank()); // it prints true for "" and true for "  "

        str1 = " ";
        System.out.println("str1.isEmpty() = " + str1.isEmpty());
        System.out.println("str1.isBlank() = " + str1.isBlank());

    }
}
