/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

public class ForLoopTriangleNumber {
    public static void main(String[] args) {
        //Printing a triangle with numbers
        int rows = 5; //Outher loop iteration count

        for (int i = 1; i <= rows; i++) {
            //inner loop to print numbers
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
