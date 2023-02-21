/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day08_LogicalOperators;

public class LpgicalOR {
    public static void main(String[] args) {
        //Logical OR(||)

        System.out.println("-------------------------");
        System.out.println("Logical OR(||).");

        System.out.println((5>3) || (8>5));
        System.out.println(true || true);

        System.out.println((5<3) || (8>5));
        System.out.println(false || true);

        System.out.println((5>3) || (8<5));
        System.out.println(true || false);

        System.out.println((5<3) || (8==5));
        System.out.println(false || false);

        System.out.println();

        int a = 10;
        int b = 5;
        int c = 20;

        //|| short circuit logical OR--->
        System.out.println(a>b || a++ < c); //true
        System.out.println("a = " + a); // a = 10 first condition is true therefore second is not checked

        System.out.println();
        System.out.println(a>b | a++ < c); //true
        System.out.println("a = " + a); // a = 11 because second condition is evaluates and a = 11
    }
}
