/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day12_TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Ternary operator in Java.");
        int x,y;
        x = 20;

        //if else...
        if(x==20){
            y = 61; //True
        }else {
            y = 90; //False
        }
        System.out.println("if else....");
        System.out.println("x ---> " + x);
        System.out.println("y ---> " + y);
        System.out.println();

        //Ternary --->  (condition) ? true : false
        y = (x==20) ? 61 : 90;

        System.out.println("Ternary operator...");
        System.out.println("x ---> " + x);
        System.out.println("y ---> " + y);
    }
}
