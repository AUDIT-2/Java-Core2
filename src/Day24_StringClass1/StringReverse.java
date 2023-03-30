/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day24_StringClass1;

public class StringReverse {

    public static String reversingString(String str){
        String revStr = "";
        for (int i = str.length()-1; i >=0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }

    public static boolean isPalindrome(String str1){
        String reverseStr = "";
        reverseStr = reversingString(str1);
        if(str1.equals(reverseStr)){
            return true;
        }else return false;
    }

    public static boolean isPalindromeKisa(String str1){
        return (str1.equals(reversingString(str1)));
    }
    public static void main(String[] args) {
        String str1 = "kavak";
       String reverseStr =  reversingString(str1);

        System.out.println("str1 = " + str1);
        System.out.println("reverseStr = " + reverseStr);

        System.out.println("isPalindrome(str1) = " + isPalindrome(str1));
        if(isPalindrome(str1)){
            System.out.println(str1 + " Palindrome bir kelimedir.");
        }else System.out.println(str1 + " Palindrome bir kelime değildir.");

        System.out.println();
        System.out.println("Kısa metod");
        if(isPalindromeKisa(str1)){
            System.out.println(str1 + " Palindrome bir kelimedir.");
        }else System.out.println(str1 + " Palindrome bir kelime değildir.");
    }
}
