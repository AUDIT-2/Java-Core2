/*
 *
 *  *  * Copyright (c) 2023.
 *  *  * SDET JAVA-13 Java Core
 *  *  * Armada-prog
 *  *  * armada.dscrd@gmail.com
 *
 */

package Day30_WrapperClass2;

import java.io.IOException;
import java.util.Arrays;

public class OdevSortingLetterDigits {
    /*
        Problem Solving

        Creating software involves much more than just writing code. The mechanics
        of editing and running a program are necessary steps, but the heart of software
        development is problem solving. We write a program to solve a particular
        problem.
        In general, problem solving consists of multiple steps:
            1. Understand the problem.
            2. Design a solution.
            3. Consider alternatives to the solution and refine the solution.
            4. Implement the solution.
            5. Test the solution and fix any problems that exist.
     */

    /*
     1-temp ve result isminde iki String değişken oluştur.String'ten bir karakter oku ve temp değşkenine ekle
     2-Karakter letter ise sonraki karaktere bak. Eğer sonraki karakter digit ise temp değişkenine "," ekle
     3-Karakter digit ise sonraki karaktere bak. Eğer sonraki karakter letter ise temp değişkenine "," ekle
     4-1 adımdan itibaren String' te okunacak harf kalmayıncaya dek tekrar et.
     5-temp değişkenini "," ayracını kullanarak String Array'e dönüştür.
     6-String Array'den bir eleman oku
     7-Array.sort() metodunu kullanarak okuduğun elemanı kendi içinde sirala
     8-Sıralanan elemanı(string) result değişkenine ekle
     9-6 adımdan itibaren String Array'de okunacak eleman kalmayıncaya dek adımları tekrar et.
     10- result değşkenini return et.
     */

    public static String sortLettersAndNumbers(String str) {
        String temp = "";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            temp += "" + str.charAt(i); //Okuduğu karakteri temp değişkenine ekle
            if (Character.isLetter(str.charAt(i)) && i < str.length()-1) {
                if (Character.isDigit(str.charAt(i + 1))) { //Letter dan sonraki digitse ',' ekle
                    temp += ",";
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length()-1) {
                if (Character.isLetter(str.charAt(i + 1))) { //Digit ten sonraki Letter sa ',' ekle
                    temp += ",";
                }
            }
        }

        System.out.println(temp);
        //temp = "DC,501,GCCCA,098911"
        String[] arr = temp.split(",");

        for (String each : arr) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            /*for (char eachChar : chars) {
                result += "" + eachChar;
            }*/
            result += new String(chars);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        /*
        Ex:
            Input : "DC501GCCCA098911"
            OutPut: "CD015ACCCG011899"
         */

        String str = "DC501GCCCA098911";
        System.out.println("sortLetNum(str) = " + sortLettersAndNumbers(str));
        
    }
}
