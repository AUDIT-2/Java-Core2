/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2.LinkedList;

import java.util.LinkedList;

public class ListLinkedListRetrieveFirstLastElm {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList <> ();
        //Adding element to LinkedList
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
        System.out.println("Original linked list: " + linkedList);

        // Retrieve but does not remove, the first element of a linked list
        String firstElm = linkedList.peekFirst();
        System.out.println("First element in the list: " + firstElm);
        System.out.println("Original linked list: " + linkedList);

        // Retrieve but does not remove, the last element of a linked list
        String lastElm = linkedList.peekLast();
        System.out.println("Last element in the list: " + lastElm);
        System.out.println("Original linked list: " + linkedList);
    }
}
