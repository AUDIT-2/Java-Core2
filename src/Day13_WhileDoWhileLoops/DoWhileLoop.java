/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day13_WhileDoWhileLoops;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Do while loop.");

        //do while loop
        System.out.println("do while loop....");
        int sayac = 0;
        do {
            //Loop body- en az bir kez mutlaka çalışır.
            sayac++;
            System.out.println(sayac);
        }while (sayac < 10); //Loop body nin tekrar edip etmeyeceğine karar verdiğimiz kontrol koşulu

        System.out.println();//Boş bir satır yazar

        //While loop
        System.out.println("While loop....");
        sayac = 0;
        while (sayac < 10){ //Loop body nin tekrar edip etmeyeceğine karar verdiğimiz kontrol koşul
            //Loop body
            sayac++;
            System.out.println(sayac);
        }
    }
}
