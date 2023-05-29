/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ArrayListAdd {
    public static void main(String[] args) {
        System.out.println("Inserting an element to an ArrayList.");
        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println("Original list : " + colors);
        colors.add(0,"Pink");
        System.out.println("Updated list  : " + colors);
        System.out.println();

        //Traversing ArrayList by with using indexed(Classic) for loop
        System.out.println("Traversing list by for loop...");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element index : " + i  + "-" + colors.get(i));
        }

        System.out.println();
        System.out.println("Traversing list by for each...");
        //For each...
        for (String eleman :colors){
            System.out.println(eleman);
        }
        System.out.println();

        //Lambda method - Traversing ArrayList by internal foreach()
        System.out.println("Traversing ArrayList by internal foreach()");
        colors.forEach((eleman)-> System.out.println(eleman));
        System.out.println();

        //Lambda methodMethod reference
        System.out.println("Traversing ArrayList by internal foreach()--> method reference");
        colors.forEach(System.out::println);
        System.out.println();

        //Lambda method
        colors.forEach((eleman)-> {
           eleman = eleman.toUpperCase();
            System.out.println(eleman);
        });
        System.out.println();

        //Traversing list by Iterator
        System.out.println("Traversing list by Iterator");
        Iterator iterator = colors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
