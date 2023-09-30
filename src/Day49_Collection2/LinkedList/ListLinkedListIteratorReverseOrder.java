/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;


public class ListLinkedListIteratorReverseOrder {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList<>();
        // use add() method to add values in the linked list
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("Pink");
        linkedList.add("Orange");

        // print original list
        System.out.println("Original linked list:" + linkedList);

        //Iterator kullanarak collection ları hem ileri hem de geriye doğru dolaşabilirz.

        Iterator<String> iteratorForward = linkedList.iterator(); //İLeriye doğru-Baştan sona doğru
        // Print list elements in insertion order
        System.out.println("Elements in Insertion Order:");
        while (iteratorForward.hasNext()) {
            System.out.println(iteratorForward.next());
        }
        System.out.println();

        // Print list elements in reverse order
        Iterator<String> iteratorBackward = linkedList.descendingIterator(); //Geriye doğru-Sondan başa doğru
        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (iteratorBackward.hasNext()) {
            System.out.println(iteratorBackward.next());
        }
    }
}
