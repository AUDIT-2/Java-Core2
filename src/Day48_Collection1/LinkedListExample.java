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
            System.out.println("getFirst()");
            System.out.println(((LinkedList<String>) citiesLinkedList).getFirst());
        }else System.out.println("citiesLinkedList LinkedList olmadığından .getFirst() metodu çalıştırılmadı.");

        System.out.println();
        if(citiesLinkedList instanceof LinkedList<String>){
            System.out.println("getLast()");
            System.out.println(((LinkedList<String>) citiesLinkedList).getLast());
        }else System.out.println("citiesLinkedList LinkedList olmadığından .getLast() metodu çalıştırılmadı.");
    }
}
