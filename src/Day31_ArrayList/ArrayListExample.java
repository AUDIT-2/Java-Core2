/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("ArrayList in Java.");
        ArrayList<String> arabalar = new ArrayList<>();
        System.out.println("arabalar.size() = " + arabalar.size());
        System.out.println("arabalar.isEmpty() = " + arabalar.isEmpty()); //True

        arabalar.add("TOGG");
        arabalar.add("BMW");
        arabalar.add("Volvo");
        arabalar.add("Mercedes");

        System.out.println("arabalar = " + arabalar);
        System.out.println("arabalar.isEmpty() = " + arabalar.isEmpty()); //False
        System.out.println("arabalar = " + arabalar);

        arabalar.add(2,"Tofaş");

        System.out.println("arabalar = " + arabalar);

        System.out.println("arabalar.get(3) = " + arabalar.get(3));
        System.out.println("arabalar.remove(\"Volvo\") = " + arabalar.remove("Volvo"));//Return true
        System.out.println("arabalar.remove(\"Volvo\") = " + arabalar.remove("Volvo"));//Return false
        System.out.println("arabalar = " + arabalar);

        System.out.println("arabalar.size() = " + arabalar.size());


    }
}
