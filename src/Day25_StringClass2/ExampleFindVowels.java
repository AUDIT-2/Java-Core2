/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class ExampleFindVowels {
    public static String findVowels(String str){
        String result = "";
        String vowels = "aeoöiuü";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if(str.charAt(i) == vowels.charAt(j)){
                    result += str.charAt(i) + "," ;
                }
            }
        }
        String tempResult = "";
        for (int i = 0; i < result.length()-1; i++) {
           tempResult += result.charAt(i);
        }
        return  tempResult;
    }

    public static void main(String[] args) {
        System.out.println("Finding vowels in a string.");
        String str = "Hello world.";
        System.out.println("String is   : " + str);
        System.out.println("Vowels are  : " + findVowels(str));

    }
}
