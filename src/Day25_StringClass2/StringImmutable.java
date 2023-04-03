/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class StringImmutable {
    public static void main(String[] args) {
        //Java da String Class immutable ır. Yani değiştirilemez.

        String myStr1 = "Hello ";
        String myStr2 = "Hello ";
        System.out.println("System.identityHashCode(myStr1) = " + System.identityHashCode(myStr1));
        System.out.println("System.identityHashCode(myStr2) = " + System.identityHashCode(myStr2));

        System.out.println("myStr1.concat(\"World\") = " + myStr1.concat("World"));
        System.out.println("myStr1.toUpperCase() = " + myStr1.toUpperCase());

        System.out.println("myStr1 = " + myStr1);
        myStr1 = myStr1.concat("World");
        System.out.println("myStr1 = " + myStr1);

        System.out.println("System.identityHashCode(myStr1) = " + System.identityHashCode(myStr1));
        System.out.println("System.identityHashCode(myStr2) = " + System.identityHashCode(myStr2));
    }
}
