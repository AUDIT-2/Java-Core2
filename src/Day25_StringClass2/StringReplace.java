/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class StringReplace {
    public static void main(String[] args) {
        String str = "This web site is BootFlowAcademy.com";
        System.out.println(str);

        str =  str.replace("com","edu");// replaces a string
        System.out.println(str);

        str = str.replace('s','S'); //replaces single character
        System.out.println(str);
    }
}
