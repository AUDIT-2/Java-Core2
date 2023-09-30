/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;


public class ListLinkedListIteratorSpecificIndex {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList<>();
        // use add() method to add values in the linked list
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
// set Iterator at specified index
       // Iterator itr = linkedList.listIterator(); //Starts with first element
        Iterator itr = linkedList.listIterator(2); //Starts with 2.index element
        System.out.println("itr.hasNext() = " + itr.hasNext());
        System.out.println("itr.next() = " + itr.next());
        System.out.println("itr.next() = " + itr.next());
        System.out.println("itr.next() = " + itr.next());
        System.out.println();
        // print list from third position
        itr = linkedList.listIterator(2);
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        itr = linkedList.listIterator();
        //Remove with iterator
        while (itr.hasNext()) {
            String val = (String) itr.next();
            if(val.equals("White")){
                itr.remove();
            }
        }
        System.out.println();
        // print list after removing an element
        itr = linkedList.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
