/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day08_LogicalOperators;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Swapping two numbers.");
        int a = 10;
        int b = 5;
        // a= 5, b = 10 after swapping

        //Solution 1- Using a third variable,
        System.out.println("Solution 1- Using a third variable");
        int temp;

        System.out.println("a before swapping = " + a);
        System.out.println("b before swapping = " + b);

        //Algoritma
        temp = a;
        a = b;      // a ---> b
        b = temp;   // b ---> a
        System.out.println("a after swapping = " + a);
        System.out.println("b after swapping = " + b);

        System.out.println("---------------------------");
        System.out.println("Solution 2- Without using  a third variable");

        a = 10;
        b = 5;
        System.out.println("a before swapping = " + a);
        System.out.println("b before swapping = " + b);

        //Algoritma
        a = a + b; // a = 10 + 5 ---> a = 15
        b = a - b; // b = 15 - 5 ---> b = 10
        a = a - b; // a = 15 - 10 ---> a = 5

        System.out.println("a after swapping = " + a);
        System.out.println("b after swapping = " + b);
    }
}
