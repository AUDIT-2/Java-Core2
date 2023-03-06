/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day13_WhileDoWhileLoops;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("While loop in Java.");
        /*System.out.println("Merhaba java.");
        System.out.println("Merhaba java.");
        System.out.println("Merhaba java.");
        System.out.println("Merhaba java.");
        System.out.println("Merhaba java.");*/

        int kacDefa = 10;
        int sayac = 0;
        while (sayac < kacDefa){
            sayac++;
            System.out.println(sayac + " -Merhaba Java.");
        }
        System.out.println("1.Döngü bitti.");

        sayac = 0;
        while (sayac < 15){
            sayac++;
            System.out.println(sayac + " - Java öğreniyorum.");
        }
        System.out.println("2.Döngü bitti.");
    }
}
