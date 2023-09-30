/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day50_Collection3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListVectorThread  {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vectorList = new Vector<>();

        List<Integer> multiThreadArrayList = new ArrayList<>();
        List<Integer> multiThreadVectorList = new Vector<>();

        int size = 100_000; //Number of elements
        long start = 0;
        long end = 0;

        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList adding performance(Seq.) : " + (end-start));

        //Vector
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            vectorList.add(i);
        }
        end = System.nanoTime();
        System.out.println("Vector adding performance(Seq.)    : " + (end-start));
        System.out.println();

        //Thread--ArrayList- not thread safe
        Thread t1 = new Thread(()->{
            int count = 0;
            for (int i = 0; i < size; i++) {
                multiThreadArrayList.add(i);
                count++;
            }
            System.out.println("multiThreadArrayList Thread 1- " + count + " defa çalıştı.");
        });

        Thread t2 = new Thread(()->{
            int count = 0;
            for (int i = 0; i < size; i++) {
                multiThreadArrayList.add(i);
                count++;
            }
            System.out.println("multiThreadArrayList Thread 2- " + count + " defa çalıştı.");
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Size of multiThreadArrayList  : " + multiThreadArrayList.size());
        System.out.println("Missing number of elements    : " + ((2 * size) - multiThreadArrayList.size()));
        System.out.println();

        //Thread--Vector Thread safe
         t1 = new Thread(()->{
             int count = 0;
            for (int i = 0; i < size; i++) {
                multiThreadVectorList.add(i);
                count++;
            }
             System.out.println("multiThreadVectorList Thread 1- " + count + " defa çalıştı.");
        });
         t2 = new Thread(()->{
             int count = 0;
             for (int i = 0; i < size; i++) {
                 multiThreadVectorList.add(i);
                 count++;
             }
             System.out.println("multiThreadVectorList Thread 2- " + count + " defa çalıştı.");
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();;
        System.out.println("Size of multiThreadVectorList : " + multiThreadVectorList.size());
        System.out.println("Missing number of elements    : " + ((2 * size) - multiThreadVectorList.size()));
    }
}
