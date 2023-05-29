/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayListUpdate {
    public static void main(String[] args) {
        System.out.println("Adding and Updating an element to an ArrayList.");
        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println("Original list : " + colors);

        colors.add(2,"Yellow");

        System.out.println("list after added \"Yellow\" : " + colors);
        colors.remove("Green");

        System.out.println("After removing \"Green\" from list : " + colors);

        //Updating an element by set()
        colors.set(3,"BEYAZ");
        System.out.println("After updating \"White\" in the list : " + colors);
    }
}
