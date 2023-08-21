/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

public class Deneme {
    public static void main(String[] args) {

        /*
        9829-♥
        10084-❤
        9728-☀
        9786-☺
        9996-✌
        11088-⭐
        10145-➡
        11013-⬅
        11014-⬆
        11015-⬇
        10052-❄

         */
      /*  for (int i = 0; i < 65500; i++) {
            System.out.print(i + "-" +(char) i);
            if(i %15==0) System.out.println();
        }*/


        /*
            ⭐
            ⭐⭐
            ⭐⭐⭐
            ⭐⭐⭐⭐
         */
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) 11088);
            }
            System.out.println();
        }
        System.out.println();

        /*
        ⭐⭐⭐⭐⭐
        ⭐⭐⭐⭐
        ⭐⭐⭐
        ⭐⭐
        ⭐
         */
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) 11088);

            }
            System.out.println();
        }

        /*
                 ♥
                ♥♥
               ♥♥♥
              ♥♥♥♥
             ♥♥♥♥♥
         */
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) 9829);
            }
            System.out.println();
        }

        /*
            ♥♥♥♥♥
             ♥♥♥♥
              ♥♥♥
               ♥♥
                ♥

         */
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) 9829);

            }
            System.out.println();
        }
        System.out.println();
        /*
            ♥♥♥♥♥
            ♥♥♥♥♥
            ♥♥♥♥♥
            ♥♥♥♥♥
            ♥♥♥♥♥
         */

        // outer loop to handle rows
        for (int i = 0; i < rows; i++) {

            // inner loop to handle columns
            for (int j = 0; j < rows; j++) {
                System.out.print((char) 9829);
            }
            // printing new line for each row
            System.out.println();
        }
    }
}
