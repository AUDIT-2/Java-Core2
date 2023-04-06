/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day27_Arrays2;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];

        System.out.println("Arrays class'ının deepToString() metodu ile dizi elemanlarının yazdırılması");
        System.out.println(Arrays.deepToString(numbers));

        for (int r = 0; r < numbers.length; r++) {//traverse the row---satırı dolaşır
            for (int c = 0; c < numbers[r].length; c++) {//traverse the column ---sutunları dolaşır
                numbers[r][c] = r + c;
            }
        }
        System.out.println(Arrays.deepToString(numbers));

        for (int r = 0; r < numbers.length; r++) {//traverse the row---satırı dolaşır
            for (int c = 0; c < numbers[r].length; c++) {//traverse the column ---sutunları dolaşır
                System.out.print(numbers[r][c] + " ");
            }
            System.out.println();
        }
    }
}
