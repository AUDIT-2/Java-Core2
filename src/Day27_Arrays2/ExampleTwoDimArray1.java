/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day27_Arrays2;

import java.util.Arrays;

public class ExampleTwoDimArray1 {
    public static void main(String[] args) {
        //int[][] array = new int[4][3]
        int[][] array ={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        array[0][2] = 10;
        array[3][1] = 23;
        array[1][0] = 5;

        System.out.println();
        System.out.println("Printing two dimensional array in table format");
        for (int i = 0; i < array.length; i++) {//row index
            for (int j = 0; j < array[i].length; j++) {//column index
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(array[3][1]);

        System.out.println(Arrays.deepToString(array));
    }
}
