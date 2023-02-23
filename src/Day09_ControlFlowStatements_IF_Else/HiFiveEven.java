/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day09_ControlFlowStatements_IF_Else;

import java.util.Scanner;

public class HiFiveEven {
    public static void main(String[] args) {
        System.out.println("Hi Five - Even...");
        Scanner klavye = new Scanner(System.in);//Klavyeden veri okumak için

        int sayi;

       // System.out.println("Klayyeden bir sayı giriniz : "); //veri girişi bir alt satırda olur
        System.out.print("Klayyeden bir sayı giriniz : ");
        sayi = klavye.nextInt();

        System.out.println("Klavyeden girilen sayı = " + sayi);
      if(sayi % 2 == 0 && sayi != 0){
            System.out.println(sayi + " ikinin katıdır.");
            System.out.println("Hi even.");
        }
      if(sayi % 5 == 0 && sayi != 0){
            System.out.println(sayi + " beşin katıdır.");
            System.out.println("Hi five.");
        }
    }
}
