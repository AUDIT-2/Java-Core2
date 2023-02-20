/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day07_UnaryAssignmentRelational;

public class UnaryPostFixPrefixExample {
    public static void main(String[] args) {
        System.out.println("Postfix ve Prefix aritmetik örneği.");

        int val = 0;
        int num = 10;

        val = ++num + num++ + num-- + --num;
        System.out.println("val = " + val);
        System.out.println("num = " + num);
        /*
              ++num ---> num = 10 + 1 ---> 11

              num = 11
              num = num + 1  num = 11
              num = 11

              num = 12
              num = num -1
              num = 12

              num = 11
              num = num - 1
              num = 10


            val = 11 + 11 + 12 + 10
            val = 44
         */

        System.out.println("-------------------");
        val = ++num + num++ + num-- + num--;
        System.out.println("val = " + val);
        System.out.println("num = " + num);
        /*
            val = 11 + 11 + 12 + 11
            val = 45
         */
    }
}
