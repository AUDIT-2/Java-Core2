/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day12_TernaryOperator;

public class TernaryExample1 {
    public static void main(String[] args) {
        int sayi = 0;
        String mesaj = "";

        sayi = 100;
        //if else..
        if(sayi > 50){
            // System.out.println("sayı 50 den büyüktür.");
            mesaj = "sayı 50 den büyüktür."; //true
        }else {
            mesaj = "sayı 50 den küçük veya 50 ye eşittir."; //false
        }
        System.out.println("if else ---> " + mesaj);

        //Ternary operator
        mesaj =(sayi > 50) ? "sayı 50 den büyüktür." : "sayı 50 den küçük veya 50 ye eşittir.";
        System.out.println("Ternary ---> " + mesaj);

        //Assignment yapmadan prinln komutu ile ternary işlem sonucunu ekrana yazdırabiliriz.
        System.out.println("println ---> " + ((sayi > 50) ? "sayı 50 den büyüktür." : "sayı 50 den küçük veya 50 ye eşittir."));
    }
}
