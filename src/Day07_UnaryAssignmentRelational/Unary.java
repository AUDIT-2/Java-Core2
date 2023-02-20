/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day07_UnaryAssignmentRelational;

public class Unary {
    public static void main(String[] args) {
        System.out.println("Unary operators in Java.");
        int num = 10;
        System.out.println("num = " + num);
        num++; //num = num + 1 ---> num is operand(işlenen-işleme tabi tutulan)  ++ is unary operator
        System.out.println("num++ = " + num);

        num = num + 1;
        System.out.println("num = num + 1 : ---> " + num);

        num--;
        System.out.println("num-- = " + num);

        num = num - 1;
        System.out.println("num = num - 1 : ---> " + num);
    }
}
