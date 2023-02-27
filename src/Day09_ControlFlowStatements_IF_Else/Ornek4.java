/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day09_ControlFlowStatements_IF_Else;

public class Ornek4 {
    public static void main(String[] args) {
        System.out.println("Üç sayıdan büyük olanı ekrana yazdıran programı yazınız.");

        int sayi1,sayi2,sayi3;

        sayi1 = 30;
        sayi2 = 40;
        sayi3 = 60;

        if((sayi1 > sayi2) && ( sayi1 > sayi3)){
            System.out.println("En büyük sayı = " + sayi1);
        }else if ((sayi2 > sayi1) && (sayi2 > sayi3)){
            System.out.println("En büyük sayı = " + sayi2);
        }else System.out.println("En büyük sayı = " + sayi3);

    }
}
