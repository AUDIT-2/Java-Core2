/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day48_Collection1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> citiesLinkedList = new LinkedList<>();

        citiesLinkedList.add("Ankara");
        citiesLinkedList.add("Mersin");
        citiesLinkedList.add("Bolu");
        citiesLinkedList.add("Ordu");
        citiesLinkedList.add("Karaman");

        System.out.println(citiesLinkedList);

        System.out.println("For each...");
        for (String eleman:citiesLinkedList){
            System.out.println(eleman);
        }

        System.out.println();
        System.out.println("For loop...");
        for (int i = 0; i < citiesLinkedList.size(); i++) {
            System.out.println(citiesLinkedList.get(i));
        }

        System.out.println();
        if(citiesLinkedList instanceof LinkedList<String>){
            System.out.println("List interface inde olmayan LinkedList'e ait getFirst() metodu");
            //Child class a ait bir metod olduğundan cast işlemi gerekli
            System.out.println("LinkedListeki ilk eleman : " + ((LinkedList<String>) citiesLinkedList).getFirst());
        }else System.out.println("citiesLinkedList LinkedList olmadığından .getFirst() metodu çalıştırılmadı.");

        System.out.println();
        if(citiesLinkedList instanceof LinkedList<String>){
            System.out.println("List interface inde olmayan LinkedList'e ait getLast() metodu");
            //Child class a ait bir metod olduğundan cast işlemi gerekli
            System.out.println("LinkedListeki son eleman : " + ((LinkedList<String>) citiesLinkedList).getLast());
        }else System.out.println("citiesLinkedList LinkedList olmadığından .getLast() metodu çalıştırılmadı.");

        System.out.println();
        System.out.println("LinkedList--> push() metodundan önce");
        System.out.println(citiesLinkedList);
        System.out.println();
        if(citiesLinkedList instanceof LinkedList<String>){
            System.out.println("List interface inde olmayan LinkedList'e ait push() metodu LinkedList in başına ekleme yapar.");
            //Child class a ait bir metod olduğundan cast işlemi gerekli
            System.out.println("LinkedListin başına eleman eklendi...");
            ((LinkedList<String>) citiesLinkedList).push("Mersin");
        }
        System.out.println();
        System.out.println("LinkedList--> push() metodundan sonra");
        System.out.println(citiesLinkedList);
    }
}
