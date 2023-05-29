/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2.LinkedList;

import java.util.LinkedList;

public class ListLinkedListRemoveFirstElm {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList <> ();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
        System.out.println("Original linked  list: " + linkedList);

        System.out.println("Removed element: "+linkedList.pop());

        System.out.println("Linked list after pop operation: "+linkedList);
    }
}
