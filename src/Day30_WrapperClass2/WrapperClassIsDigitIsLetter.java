/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day30_WrapperClass2;

public class WrapperClassIsDigitIsLetter {
    public static void parseString(String str) {
        String letters = "";
        String digits = "";
        String specialChars = "";
        int countLetters = 0;
        int countDigits = 0;
        int countSpecial = 0;

        System.out.println("str = " + str);
        System.out.println("--------------------------");
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letters += str.charAt(i);
                countLetters++;
            } else if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
                countDigits++;
            } else {
                specialChars += str.charAt(i);
                countSpecial++;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("countLetters = " + countLetters);
        System.out.println();

        System.out.println("digits = " + digits);
        System.out.println("countDigits = " + countDigits);
        System.out.println();

        System.out.println("specialChars = " + specialChars);
        System.out.println("countSpecial = " + countSpecial);

    }

    public static void main(String[] args) {
        String str = "Abcx7634756387yxşjbjkasdğ8999?*/&snbkd";
        parseString(str);

        str = "Abcx7634dlknalkfnslkdfnlsakdnl.fglsd09832048230958304968406387yxşjbjkasdğ8999?*/&snbkd";
        parseString(str);
    }
}
