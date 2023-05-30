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

        int size = 1000;
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

        //Thread--ArrayList- n ot thread safe
        Thread t1 = new Thread(()->{
            System.out.println("Thread-1 Çalıştı");
            for (int i = 0; i < size; i++) {
                multiThreadArrayList.add(i);
            }
        });
        Thread t2 = new Thread(()->{
            System.out.println("Thread-2 Çalıştı");
            for (int i = 0; i < size; i++) {
                multiThreadArrayList.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();;
        System.out.println("Size of multiThreadArrayList  : " + multiThreadArrayList.size());

        //Thread--Vector Thread safe
         t1 = new Thread(()->{
            for (int i = 0; i < size; i++) {
                multiThreadVectorList.add(i);
            }
        });
         t2 = new Thread(()->{
            for (int i = 0; i < size; i++) {
                multiThreadVectorList.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();;
        System.out.println("Size of multiThreadVectorList : " + multiThreadVectorList.size());
    }
}
