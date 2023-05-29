/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2;

import java.util.ArrayList;
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

        //Traversing ArrayList by with using  for index
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element index : " + i  + "-" + colors.get(i));
        }


    }

}
