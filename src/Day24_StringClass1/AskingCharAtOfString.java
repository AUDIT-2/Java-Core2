/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day24_StringClass1;

import java.util.Random;

public class AskingCharAtOfString {

    public static String harfSor(String str){
        Random random = new Random();
        int harfindex = random.nextInt(str.length());
        System.out.println("harf = " + str.charAt(harfindex) + " " + (harfindex + 1) + ". harf");

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == harfindex) {
                result +=str.charAt(harfindex);
                continue;
            }
            result +="*";
        }
        return result;
    }
    public static void main(String[] args) {
        /*Random random = new Random();
        String str = "Falanca";
        int harfindex = random.nextInt(str.length());
        System.out.println("Kelimenin harf sayısı :" + str.length());
        System.out.println("harf = " + str.charAt(harfindex) + " " + (harfindex + 1) + ". harf");

        for (int i = 0; i < str.length(); i++) {
            if (i == harfindex) {
                System.out.print(str.charAt(harfindex));
                continue;
            }
            System.out.print("*");
        }*/

        System.out.println("harfSor(\"ahmet\") = " + harfSor("Ahmet"));
    }
}
