/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day09_ControlFlowStatements_IF_Else;

public class Ornek3 {
    public static void main(String[] args) {
        //iki sayıdan büyüğünü bulan ve ekrana yazdıran programı yazınız.
        int sayi1, sayi2;

        sayi1 = 5;
        sayi2 = 565;

        if( sayi1 > sayi2){
            System.out.printf(sayi1 + " > " + sayi2);
        }else if (sayi1 < sayi2){
            System.out.printf(sayi2 + " > " + sayi1);
        } else { //say1 == sayi2
            System.out.println("sayi1 = " + sayi1);
            System.out.println("sayi2 = " + sayi2);
            System.out.println("Her iki sayı birbirine eşittir.");
        }
    }
}
