/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.PriorityQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Queue<Integer> queue = new LinkedList<>();

        //First In First Out---FIFO--İlk giren ilk çıkar
        System.out.println("Queue................");
        queue.add(12);
        queue.add(14);
        queue.add(2);
        queue.add(45);
        queue.add(5);
        queue.add(1);
        queue.add(100);

        System.out.println("Queue : " + queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println();
        System.out.println("PriorityQueue............");
        priorityQueue.add(12);
        priorityQueue.add(14);
        priorityQueue.add(2);
        priorityQueue.add(45);
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(100);

        System.out.println("PriorityQueue : " + priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        PriorityQueue<String> isimler = new PriorityQueue<>();
        isimler.add("Mehmet");
        isimler.add("Hasan");
        isimler.add("Naci");
        isimler.add("Ali");
        isimler.add("Fatma");

        System.out.println("isimler.poll() = " + isimler.poll());
        System.out.println("isimler.poll() = " + isimler.poll());
        System.out.println("isimler.poll() = " + isimler.poll());

    }
}
