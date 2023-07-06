/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

public class ForLoopTriangleNumber {
    public static void main(String[] args) {
        //Printing a triangle with numbers and *
        int rows = 5; //Outer loop iteration count
        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */
        //Outer loop prints the rows
        for (int i = 1; i <= rows; i++) {
            //inner loop to print numbers
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");

        /*
            1
            2 2
            3 3 3
            4 4 4 4
            5 5 5 5 5
         */
        //Outer loop prints the rows
        for (int i = 1; i <= rows; i++) {
            //inner loop to print numbers
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + " ");
                System.out.print((char) 13456);
            }
            System.out.println();
        }
        System.out.println("-------------");
        /*
             *
             * *
             * * *
             * * * *
             * * * * *
         */
        for (int i = 1; i <= rows; i++) {
            //inner loop to print numbers
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------");
        /*
             * * * * *
             * * * * *
             * * * * *
             * * * * *
         */
        for(int i=1; i<=rows; i++){         // Satir sayisini
            for(int j=1; j<=rows; j++){     // Sutun sayisini
                System.out.print("* ");  // print ile ayni satira yazdir
            }
            System.out.println();        // satir atlatiyor
        }
    }
}
