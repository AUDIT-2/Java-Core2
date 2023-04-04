/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class ExampleNumberOfOccurance {
    public static int numberOccurance(String str,char chr){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == chr) count++;
        }
        return count;
    }
    public static void main(String[] args) {

        String str = "Hello world. I am learning Java.";
        char chr = 'a';

        System.out.println(str);
        System.out.println("chr = " + chr);
        System.out.println("Cümlenin içerisinde " + chr + " harfi " + numberOccurance(str, chr) + " defa geçmektedir.");
    }
}
