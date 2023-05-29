/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2.LinkedList;

import java.util.LinkedList;

public class ListLinkedListRemoveIndex {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList <> ();
        // use add() method to add values in the linked list
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("Pink");
        linkedList.add("orange");

        // print the list
        System.out.println("The Original linked list: " + linkedList);

        // Remove the element in third position from the said linked list
        linkedList.remove(2);
        System.out.println("The New linked list: " + linkedList);
    }
}
