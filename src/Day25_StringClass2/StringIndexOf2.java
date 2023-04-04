/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class StringIndexOf2 {
    public static void findIndexOfWord(String str, String kelime) {
        int count = 0;
        int index = str.indexOf(kelime);
        System.out.println("Cümle         : \n" + str);
        System.out.println("Aranan kelime : \n" + kelime);
        cizgiYaz(str.length());

        while (index > -1) {
            count++;
            System.out.println(count + ". index : " + index);
            index = str.indexOf(kelime,index+1);
        }
        if(count !=0){
            System.out.println(kelime + " kelimesi cümle içerisinde " + count + " adet vardır.");
        } else System.out.println(kelime + " kelimesi cümle içerisinde bulunmamaktadır!");
    }
    public static void cizgiYaz(int adet){
        for (int i = 0; i < adet; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String myStr = "Hello planet earth, you are a great planet.";
        String kelime = "planet";
        findIndexOfWord(myStr,kelime);
    }
}
