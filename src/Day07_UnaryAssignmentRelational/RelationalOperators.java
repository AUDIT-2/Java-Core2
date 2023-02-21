/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day07_UnaryAssignmentRelational;

public class RelationalOperators {
    public static void main(String[] args) {
        System.out.println("Relational operators in Java.");
        //Variable declaration and assignment
        int num1 = 12, num2 = 4;
        boolean esitMi;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //is equal to
        System.out.println("num1 == num2 : " + (num1 == num2)); // 12 == 4 ---> false
        esitMi = num1 == num2;
        System.out.println("num1 == num2 : " + esitMi);

        //is not equal to
        System.out.println("num1 != num2 : " + (num1 != num2)); // 12 != 4 ---> true

        //Greater than
        System.out.println("num1 > num2 : " + (num1 > num2)); // 12 > 4 ---> true

        //Less than
        System.out.println("num1 < num2 : " + (num1 < num2)); // 12 < 4 ---> false

        //Greater than or equal to
        System.out.println("num1 >= num2 : " + (num1 >= num2)); // 12 >= 4 ---> true

        //Less than or equal to
        System.out.println("num1 <= num2 : " + (num1 <= num2)); // 12 <= 4 ---> false
    }
}
