/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day09_ControlFlowStatements_IF_Else;

public class ControlFlow_IF {
    public static void main(String[] args) {
        //Conditional statement
        System.out.println("Control flow statements(IF...Else) in Java");
        int sayi;
        sayi = 10;

        System.out.println(sayi > 0); //parantezin içerisindeki boolean-expression un sonucuna göre true ya da false bir değer yazdırır.

        if (sayi > 0){
            System.out.println("Sayi positif bir sayıdır.");
        }
        System.out.println(sayi > 5);

        if(sayi > 5){
            System.out.println("Sayi 5 ten büyüktür.");
            System.out.println("İkinci satır.");
        }
        if(sayi > 3) System.out.println("Sayi 3 ten büyüktür.");

        boolean kontrol = false;
        kontrol = (sayi > 7);

        if(kontrol){
            System.out.println("Sayi 7 ten büyüktür.");
        }
        System.out.println("Sayi = " + sayi);

        //Syntax
        /*
        if (kontrol-işlem){
            //true
            Karşılaştırma sonucu true ise çalışacak kod satırı
        }
         */
    }
}
