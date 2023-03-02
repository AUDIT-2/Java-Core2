/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day12_TernaryOperator;

import java.util.Scanner;

public class TernaryExample2 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sayi = 0;
        String mesaj = "";

        System.out.print("Klavyeden bir tam sayı giriniz : ");
        sayi = klavye.nextInt();

        System.out.println("if else.....");
        if(sayi % 2 == 0){
            System.out.println("Sayı çift sayıdır.");
            //mesaj = "Sayı çift sayıdır.";
        }else {
            System.out.println("Sayı tek sayıdır.");
            //mesaj = "Sayı tek sayıdır.";
        }

        System.out.println();//Ekrana boş bir satır yazar

        System.out.println("Ternary.....");
        mesaj =(sayi % 2 == 0) ? "Sayı çift sayıdır." : "Sayı tek sayıdır.";
        System.out.println(mesaj);
    }
}
