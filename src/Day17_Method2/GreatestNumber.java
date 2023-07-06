/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day17_Method2;

public class GreatestNumber {
    public static void main(String[] args) {
        System.out.println("greatestNumber(10,3,5) = " + greatestNumber(10, 3, 5));
        System.out.println("greatestNumber(34,43,12) = " + greatestNumber(34, 43, 12));
        System.out.println("greatestNumber(23,12,67) = " + greatestNumber(23, 12, 67));
        System.out.println("greatestNumber(12,3,-12) = " + greatestNumber(12, 3, -12));

        int enBuyukSayi = greatestNumber(10, 5, 3);
        System.out.println("enBuyukSayi = " + enBuyukSayi);

    }

    public static int greatestNumber(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else max = c;
        return max;
    }
}
