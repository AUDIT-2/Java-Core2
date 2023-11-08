/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day29_WrapperClass1;

public class WrapperExample {
    public static void main(String[] args) {
        //Integer caching mechanism in java.
        Integer intW1 = 12345;
        Integer intW2 = 12345;
        Integer intW3 = 127;
        Integer intW4 = 127;

        System.out.println("(intW1 == intW2) = " + (intW1 == intW2));
        System.out.println("(intW3 == intW4) = " + (intW3 == intW4)); // -128 ile 127 Integer Caching mechanism--bu nedenle == operatörü ile karşılaştırma yapılabilir

        System.out.println("System.identityHashCode(intW1) = " + System.identityHashCode(intW1));
        System.out.println("System.identityHashCode(intW2) = " + System.identityHashCode(intW2));
        System.out.println("System.identityHashCode(intW3) = " + System.identityHashCode(intW3));
        System.out.println("System.identityHashCode(intW4) = " + System.identityHashCode(intW4));

        Double dblW1 = 1245.0;
        Double dblW2 = 1245.0;
        Double dblW3 = 127.0;
        Double dblW4 = 127.0;
        System.out.println("(dblW1 == dblW2) = " + (dblW1 == dblW2));
        System.out.println("(dblW3 == dblW4) = " + (dblW3 == dblW4)); //Double class ında caching mekanizması olmadığından == ile karşılaştırma yapılmamalıdır.

        System.out.println("dblW1.equals(dblW2) = " + dblW1.equals(dblW2));
    }
}
