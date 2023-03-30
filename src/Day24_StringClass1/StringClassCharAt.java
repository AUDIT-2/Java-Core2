/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day24_StringClass1;

public class StringClassCharAt {
    //J,a,v,a, C,o,u,r,s,e  expected output
    public static void main(String[] args) {
        String str1 = "Java Course";
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + ",");
        }
        System.out.println();

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
            if ((i != str1.length()-1) && (str1.charAt(i)!=' ')){
                System.out.print(",");
            }
        }
    }
}
