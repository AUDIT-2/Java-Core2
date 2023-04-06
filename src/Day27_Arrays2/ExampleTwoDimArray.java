/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day27_Arrays2;

import Day26_Arrays1.Product;

public class ExampleTwoDimArray {
    public static void main(String[] args) {

        /*
        Default values of data types in Java---Varsayılan veri tip değerleri
        String ----> null
        int    ----> 0
        double ----> 0.0
        boolean ---> false
         */
        System.out.println("Two dimensional Array.");
        int[][] matrix; //declaration
        matrix = new int[8][8]; //Creation
        matrix[2][3] = 1125;
        matrix[3][1] = 30;
        matrix[2][4] = 124;
        matrix[1][3] = 3567;

        System.out.println("              1 2 3 4 5 6 7 8" );
        System.out.println("              - - - - - - - -" );
        for (int i = 0; i < matrix.length; i++) {//traverse the row---satırı dolaşır
            //Prints the rows
            System.out.print((i+1) + ". satır ---> " );
            for (int j = 0; j < matrix.length; j++) {//traverse the row---satırı dolaşır
                //Prints the columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        //Formatted print ---printf()
        System.out.println("-------------------------------------------------------");
        System.out.print("              " );
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%5d" ,i+1);
        }
        System.out.println();
        System.out.println("                  -------------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print((i+1) + ". satır ---> " );
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
