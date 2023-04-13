/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day30_WrapperClass2;

public class WrapperParseStrRetArr {
    public static String[] parseString(String str) {
        String[] result = new String[3];

        //Initialization of array with empty String
        for (int i = 0; i < result.length; i++) {
            result[i] = "";
        }

        System.out.println("str = " + str);
        System.out.println("--------------------------");
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result[0] += str.charAt(i); //Letters
            } else if (Character.isDigit(str.charAt(i))) {
                result[1] += str.charAt(i); //Digits

            } else {
                result[2] += str.charAt(i); //Special Chars
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "sajdnkjdkjsfl871246817BDJBA??77JHBJD";
        String[] parsedString = parseString(str);

        System.out.println("Letters = " + parsedString[0]);
        System.out.println("Number of letters = " + parsedString[0].length());

        System.out.println("Digits = " + parsedString[1]);
        System.out.println("Number of digits = " + parsedString[1].length());

        System.out.println("Special Chars = " + parsedString[2]);
        System.out.println("Number of Special Chars = " + parsedString[2].length());

    }
}
