/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day28_REVIEW_Arrays;

import java.util.Arrays;

public class StringtoCharArray {
    public static void main(String[] args) {
        String str = "Ankara";
        char[] harfler;
        harfler = str.toCharArray();

        System.out.println("Arrays.toString(harfler) = " + Arrays.toString(harfler));

        for (int i = 0; i < harfler.length; i++) {
            System.out.print(harfler[i] + " ");
        }
        System.out.println();
        //Reverse printing
        for (int i = harfler.length-1; i >= 0; i--) {
            System.out.print(harfler[i] + " ");
        }
    }
}
