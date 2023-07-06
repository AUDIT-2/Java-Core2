/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("For loops in Java.");
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello world");
        }

        //Ekrana 10 defa "Merhaba Java" yazan bir for loop oluşturun.
        System.out.println();
        for (int i = 1; i < 10;i++){
            //loop body
            System.out.println(i + "-Merhaba java.");
            if(i % 4 == 0){
                System.out.println("  ->Hello Java.");
            }
        }
        System.out.println();

        //While loop
        System.out.println("While loop");
        int sayac = 1;
        while (sayac < 10){
            //loop body
            System.out.println(sayac + "-Merhaba Java(while)");
            if(sayac % 4 == 0){
                System.out.println("  ->Hello Java.");
            }
            sayac++;
        }
    }
}
