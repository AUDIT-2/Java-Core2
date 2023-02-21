/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day08_LogicalOperators;

public class LogicalNOT {
    public static void main(String[] args) {
        System.out.println("Logical NOT in Java.");
        int a = 10;
        int b = 15;

        //! (NOT) ---> değilini alma
        // !(true)  ---> false
        // !(false) ---> true
        System.out.println("(a > b) ---> " + (a > b)); //false
        System.out.println("!(a > b) ---> " + !(a > b)); // !(false) ---> true
    }
}
