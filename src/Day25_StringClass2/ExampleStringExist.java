/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class ExampleStringExist {
    public static int checkWord(String str1, String str2){
        return str1.indexOf(str2);
    }
    public static void main(String[] args) {
        String str1 = "Your parcel is delivered to your postcode: DA124DA";
        String str2 = "delivered";

        System.out.println("Sentence : " + str1);
        System.out.println("Word     : " + str2);

        System.out.println("Found index : " + checkWord(str1,str2));
    }
}
