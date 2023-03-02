/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day12_TernaryOperator;

public class TernaryExample4 {
    public static void main(String[] args) {
        System.out.println("Nested operation with ternary operator.");
        int sayi1, sayi2, sayi3, enbuyukSayi;

        sayi1 = 300;
        sayi2 = 1505;
        sayi3 = 60;
        enbuyukSayi = 0;

        //iki sayıdan büyük olanı bulan ternary operasyonu
        enbuyukSayi = (sayi1 > sayi2) ? sayi1 : sayi2;
        System.out.println("En büyük sayı = " + enbuyukSayi);

        //üç sayı arasında en büyüğünü bulan ternary operasyonu

        //Ternary-1
        enbuyukSayi = (sayi1 > sayi2)
                ? ((sayi1 > sayi3) ? sayi1 :sayi3)
                : ((sayi2 > sayi3) ? sayi2 :sayi3);

        System.out.println("3 sayıdan en büyük olanı(Ternary-1) = " + enbuyukSayi);

        //Ternary-2           (1.Condition)                true    (false- 2.Condition) true   false
        enbuyukSayi = ((sayi1 > sayi2)&&(sayi1 > sayi3)) ? sayi1 : (sayi2 > sayi3) ?   sayi2:  sayi3;
        System.out.println("3 sayıdan en büyük olanı(Ternary-2) = " + enbuyukSayi);

        //if else...
        if(sayi1 > sayi2 && sayi1 > sayi3){
            enbuyukSayi = sayi1;
        }else if (sayi2 > sayi3){
            enbuyukSayi = sayi2;
        }else enbuyukSayi = sayi3;
        System.out.println("3 sayıdan en büyük olanı(if else) = " + enbuyukSayi);
    }
}
