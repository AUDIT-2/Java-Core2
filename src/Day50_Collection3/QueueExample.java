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
import java.util.Queue;

public class QueueExample {
    //First in First Out--FIFO
    public static void main(String[] args) {
        Queue<String> sira = new LinkedList<>();
        List<String> kasiyer = new ArrayList<>();

        sira.add("Ahmet"); //Queue doluysa hata verir.
        sira.offer("Mehmet"); //Queue doluysa hata vermez.
        sira.offer("Hasan");
        sira.offer("Ayşe");
        sira.offer("Beyza");
        sira.offer("Mustafa");

        System.out.println("Sırada bekleyenlerin listesi:");
        System.out.println("-----------------------------");
        for (String eleman:sira){
            System.out.println(eleman);
        }
        System.out.println();
        /*sira.forEach((eleman)-> System.out.println(eleman)); //Anonymous function-lambda
        sira.forEach(System.out::println); //Method referance*/

        String siradaki = "";
        System.out.println("sira.peek() = " + sira.peek());

        siradaki = sira.poll();
        kasiyer.add(siradaki);
        System.out.println("sira = " + sira);
        System.out.println("kasiyer = " + kasiyer);

        siradaki = sira.poll();
        kasiyer.add(siradaki);
        System.out.println("sira = " + sira);
        System.out.println("kasiyer = " + kasiyer);

        siradaki = sira.poll();
        kasiyer.add(siradaki);
        System.out.println("sira = " + sira);
        System.out.println("kasiyer = " + kasiyer);

        siradaki = sira.poll();
        kasiyer.add(siradaki);
        System.out.println("sira = " + sira);
        System.out.println("kasiyer = " + kasiyer);

        siradaki = sira.poll();
        kasiyer.add(siradaki);
        System.out.println("sira = " + sira);
        System.out.println("kasiyer = " + kasiyer);

        siradaki = sira.poll();
        kasiyer.add(siradaki);
        System.out.println("sira = " + sira);
        System.out.println("kasiyer = " + kasiyer);

        siradaki = sira.poll();
        kasiyer.add(siradaki);
        System.out.println("sira = " + sira);
        System.out.println("kasiyer = " + kasiyer);

        sira.poll(); //does not throw an exception if the queue is empty
        sira.remove(); //throws an exception if the queue is empty

       /* System.out.println("sira.poll() = " + sira.poll());

        System.out.println("sira.peek() = " + sira.peek());*/

    }

}
