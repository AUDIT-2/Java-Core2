/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day07_UnaryAssignmentRelational;

public class UnaryPostFix {
    public static void main(String[] args) {
        System.out.println("Unary example postfix...");
        int val = 0;
        int num = 10;

        System.out.println("val = " + val);
        System.out.println("num = " + num);
        System.out.println("-------------");

        //Postfix unary operation- store the value of "num" to "val" then increase the "num" value by "1"
        val = num++; // val = 10 then num = 11
        /*
        val = num;
        num = num + 1;
         */
        System.out.println("val = " + val);
        System.out.println("num = " + num);
        System.out.println("-------------");

        //num = 11;
        val = num--; //postfix eksiltme
         /*
        val = num;      // val = 11
        num = num - 1;  // num = 10
         */
        System.out.println("val = " + val);
        System.out.println("num = " + num);
        System.out.println("-------------");

    }
}
