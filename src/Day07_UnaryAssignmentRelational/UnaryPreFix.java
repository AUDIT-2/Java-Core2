/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day07_UnaryAssignmentRelational;

public class UnaryPreFix {
    public static void main(String[] args) {
        System.out.println("Unary example prefix...");
        int val = 0;
        int num = 10;

        System.out.println("val = " + val);
        System.out.println("num = " + num);
        System.out.println("-------------");

        val = ++num; //prefix unary opers-- "num" değişkeninin değeri 1 artırılır sonra "val" değişkenine atanır
        /*
        num = num + 1;
        val = num;
         */

        System.out.println("val = " + val);
        System.out.println("num = " + num);
        System.out.println("-------------");

        val = --num;
         /*
        num = num - 1;
        val = num;
         */
        System.out.println("val = " + val);
        System.out.println("num = " + num);
        System.out.println("-------------");

    }
}
