/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day07_UnaryAssignmentRelational;

public class OrnekUnaryPostPrefix {
    public static void main(String[] args) {
        System.out.println("Postfix ve Prefix aritmetik örneği.");

        int val = 0;
        int num = 5;
        int temp = 0;

       // val = ++num + num++ + num-- + --num; // val = ?  num = ?
        temp = ++num;
        val = val + temp;
        System.out.println( " val = " + val + " temp--> ++num = " + temp);

        temp = num++;
        val = val + temp;
        System.out.println( " val = " + val + " temp--> num++ = " + temp);

        temp = num--;
        val = val + temp;
        System.out.println( " val = " + val + " temp--> num-- = " + temp);

        temp = --num;
        val = val + temp;
        System.out.println( " val = " + val + " temp--> --num = " + temp);

        /*
        val = 0;
        num = 5;
        val = ++num + num++ + num-- + --num;
        val = 6 + 6 + 7 + 5
         */

        System.out.println("----------------------");
        System.out.println("val = " + val);
        System.out.println("num = " + num);
    }
}
