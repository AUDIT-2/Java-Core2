/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("i= " + i);
            for (int j = 0; j < 2; j++) {
                System.out.println("j = " + j);
            }
        }
    }
}
