/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day08_LogicalOperators;

public class LogicalAND {
    public static void main(String[] args) {
        System.out.println("Logical AND(&&).");
        System.out.println("--------------------------");

        System.out.println("(5>3) && (8>5) ---> " + ((5>3) && (8>5)));
        System.out.println(" true && true  ---> " + (true && true));
        System.out.println();

        System.out.println("(5<3) && (8>5) ---> " + ((5<3) && (8>5)));
        System.out.println("false && true  ---> "+ (false && true));
        System.out.println();

        System.out.println("(5>3) && (8<5) ---> " + ((5>3) && (8<5)));
        System.out.println("true && false  ---> " + (true && false));
        System.out.println();

        System.out.println("(5<3) && (8==5)---> " + ((5<3) && (8==5)));
        System.out.println("false && false ---> " + (false && false));
        System.out.println();

        System.out.println("-------------------------");
        System.out.println("Short circuit AND");
        System.out.println("-------------------------");
        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();

        //&& short circuit Conditional AND---> if first condition is false no need to check the second or others expressions
        //&& operator evaluates the second expression only if the first one is true.

        System.out.println("a < b && a++ < c ---> " + (a<b && a++ < c)); //false && true  ---> false
        System.out.println("a = " + a); // prints 10 because second condition is not checked
        System.out.println();

        //& logical AND---> the operators always evaluates both expressions.
        System.out.println("a < b & a++ < c ---> " + (a<b & a++ < c)); //false & true  ---> false
        System.out.println("a = " + a); // prints 11 because second condition is checked

    }
}
