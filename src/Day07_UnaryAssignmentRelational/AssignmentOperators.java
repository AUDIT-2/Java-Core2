/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day07_UnaryAssignmentRelational;

public class AssignmentOperators {
    public static void main(String[] args) {
        System.out.println("Assignment operators in Java.");
        int num1, num2;
        //"=" assignment
        num1 = 10;
        num2 = 15;

        //num2 = num2 + num1
        num2 = num2 + num1;
        System.out.println("num2 = num2 + num1 : " + num2);

        //num2 += num1
        num2 = 15;
        num2 += num1;
        System.out.println("num2 += num1 : " + num2);

        num2 = 15;
        //num2 = num2- num1
        num2 = num2 - num1;
        System.out.println("num2 = num2 - num1 : " + num2);

        //num2 -= num1
        num2 = 15;
        num2 -= num1;
        System.out.println("num2 -= num1 : " + num2);

        num2++;
        System.out.println("num2++ : " + num2);

        num2 += 1;
        System.out.println("num2 += 1: " + num2);
    }
}
