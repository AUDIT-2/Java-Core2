/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day46_Exception1.Errors;

public class OutOfMemory {

    public static void main(String[] args) {
        System.out.println("Büyük bir dizi tanımladım.");
     //   int[] buyukDizi = new int[2_140_000_000];

        int[] enBuyukDizi = new int[Integer.MAX_VALUE];
    }
}
