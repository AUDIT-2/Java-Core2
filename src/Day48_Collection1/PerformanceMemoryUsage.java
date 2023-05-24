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

public class PerformanceMemoryUsage {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
       /* System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());
        */

        long oncekiHafizaArrayList = runtime.totalMemory() - runtime.freeMemory();
        int numberOfElement = 20_000_000; //Listeye eklenecek eleman sayısı

        System.out.println("Creating ArrayList... and adding " + numberOfElement + " element to ArrayList........................");
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numberOfElement; i++) {
            arrayList.add(i);
        }
        long sonrakiHafizaArrayList = runtime.totalMemory() - runtime.freeMemory();
        long toplamKullanilanHafizaArrayList = sonrakiHafizaArrayList - oncekiHafizaArrayList;

        System.out.println("ArrayList hafıza kullanımı   : " + (toplamKullanilanHafizaArrayList) + " bytes.");
        System.out.println("ArrayList hafıza kullanımı   : " + (toplamKullanilanHafizaArrayList/1024.0) + " kilo bytes.");
        System.out.println("ArrayList hafıza kullanımı   : " + ((toplamKullanilanHafizaArrayList)/1024.0)/1024.0 + " mega bytes.");
        System.out.println("ArrayList hafıza kullanımı   : " + ((toplamKullanilanHafizaArrayList)/1024.0)/1024.0/1024.0 + " giga bytes.");

        System.out.println();
        System.out.println("Creating LinkedList... and adding " + numberOfElement + " element to LinkedList........................");
        long oncekiHafizaLinkedList = runtime.totalMemory() - runtime.freeMemory();

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < numberOfElement; i++) {
            linkedList.add(i);
        }
        long sonrakiHafizaLinkedList = runtime.totalMemory() - runtime.freeMemory();

        long toplamKullanilanHafizaLinkedList = sonrakiHafizaLinkedList - oncekiHafizaLinkedList;
        System.out.println("LinkedList hafıza kullanımı  : " + (toplamKullanilanHafizaLinkedList) + " bytes.");
        System.out.println("LinkedList hafıza kullanımı  : " + (toplamKullanilanHafizaLinkedList/1024.0) + " kilo bytes.");
        System.out.println("LinkedList hafıza kullanımı  : " + ((toplamKullanilanHafizaLinkedList)/1024.0) /1024.0 + " mega bytes.");
        System.out.println("ArrayList hafıza kullanımı   : " + ((toplamKullanilanHafizaLinkedList)/1024.0)/1024.0/1024.0 + " giga bytes.");

        System.out.println();
        System.out.println(numberOfElement + " elemanlı bir liste için");
        if(toplamKullanilanHafizaLinkedList > toplamKullanilanHafizaArrayList){
            System.out.println("Hafıza kullanımı açısından ArrayList tercih edilebilir.");
        }else System.out.println("Hafıza kullanımı açısından LinkedList tercih edilebilir.");
    }
}
