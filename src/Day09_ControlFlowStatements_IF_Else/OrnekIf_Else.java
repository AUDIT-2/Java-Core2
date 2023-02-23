/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day09_ControlFlowStatements_IF_Else;

import java.util.Scanner;

public class OrnekIf_Else {
    public static void main(String[] args) {
        //Klavyeden girilen bir tam sayının pozitif bir tam sayı mı?
        //yoksa negatif bir tam sayı mı? olduğunu ekrana yazdıran bir program yazınız.

        Scanner klayve = new Scanner(System.in); //Klavyeden veri girişi için

        System.out.print("Klayyeden bir sayı giriniz : ");
        int number = klayve.nextInt(); //Klavyeden bir tamsayı okuyoruz.

        //Two way if ... else statements
        if(number > 0){
            System.out.println(number +  " pozitif bir sayıdır.");
        } else{
            System.out.println(number +  " negatif bir sayıdır.");
        }

        //Üçüncü bir durumu yani girilen sayının "0" olma ihtimalini de test etmek için
        // else if.... yapısı oluşturmamız gereklidir. Aşağıdaki kod bu 3. durumu da test eder.
        //Yani girilen sayının "0" olma durumunu
        /*

        if(number > 0){
            System.out.println(number +  " pozitif bir sayıdır.");
        }
        else if (number == 0) {
            System.out.println("Sayı sıfırdır.");
        }
        else{
            System.out.println(number +  " negatif bir sayıdır.");
        }

         */
    }
}
