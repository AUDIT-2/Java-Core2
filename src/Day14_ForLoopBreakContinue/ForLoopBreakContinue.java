/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

public class ForLoopBreakContinue {
    public static void main(String[] args) {
        //Break statement
        System.out.println("Break...");
        for (int i = 0; i < 5; i++) {
            if(i == 3 ){
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Continue...");

        for (int i = 0; i < 5; i++) {
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }

    }
}
