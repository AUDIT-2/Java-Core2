/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ListLinkedListClone {
    public static void main(String[] args) {
        // create an empty linked list
        //List<String> linkedList = new LinkedList <> (); //List interface türünde instance oluşturduk
        LinkedList<String> linkedList = new LinkedList <> ();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
        System.out.println("Original linked  list: " + linkedList);

        //You can also write your own clone method.
        //Cloning a LinkedList with
        LinkedList<String > newCloned;
        //newCloned = (LinkedList) ((LinkedList<String>) linkedList).clone(); //List interface ile kullanırsak bu şekilde cast yapmamız gerekir.
        newCloned = (LinkedList<String>) linkedList.clone(); //List interface ile bir instance oluşturulursa cast etmek gerekir.
        System.out.println("Cloned linked list   : " + newCloned);
    }
}
