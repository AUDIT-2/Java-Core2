/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListJoinTwoLinkedList {
    //Userdefined method
    public static List<String> join(List<String> list1, List<String> list2){
        List<String> joinedList = new LinkedList<>();
        for(String eleman : list1){
            joinedList.add(eleman);
        }
        for(String eleman : list2){
            joinedList.add(eleman);
        }
        return joinedList;
    }
    public static void main(String[] args) {
        System.out.println("Comparing two given list.");

        List<String> colors1 = new LinkedList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Black");
        colors1.add("White");
        colors1.add("Pink");
        System.out.println("\n List-1 "+ colors1);

        List<String> colors2 = new LinkedList<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Black");
        colors2.add("Pink");
        System.out.println("\n List-2 "+ colors2);

        List<String> joinedList = new ArrayList<>();

        joinedList = join(colors1,colors2); //Kendi yazdığımız metodu çağırıyoeuz.
        System.out.println("joinedList = " + joinedList);
        System.out.println();

        //By using List interface method addAll() .List interface inde tanımlı .addAll() metodu. Interface i implement eden bütün classlarda ortak
        List<String> joinedList1 = new LinkedList<>();
        joinedList1.addAll(colors1);
        joinedList1.addAll(colors2);
        System.out.println("joinedList1 = " + joinedList1);
    }
}
