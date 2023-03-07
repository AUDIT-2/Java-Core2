/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

public class ForLoopCarpimTablosu {

    public static void main(String[] args) {
        //1 * 1
        //1 * 2
        //1 * 3
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + " sayısının çarpım tablosu");
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("---------------");
        }
    }
}
