/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListLinkedListConvertArrayList {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList <> ();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
        System.out.println("Original linked list: " + linkedList);

        //Convert a linked list to array list-passing LinkedList instance to ArrayList() constructor
        List<String> arrayList = new ArrayList<>(linkedList);

        for (String str : arrayList){
            System.out.println(str);
        }
    }
}
