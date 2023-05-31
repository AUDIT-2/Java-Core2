/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Hastane {
    public static void main(String[] args) {
        PriorityQueue<Hasta> hastalar = new PriorityQueue<>();

        Hasta hasta1 = new Hasta("Mehmet",34);
        Hasta hasta2 = new Hasta("Ali",120);
        Hasta hasta3 = new Hasta("Hatice",12);
        Hasta hasta4 = new Hasta("Zeki",33);

        hastalar.add(hasta1);
        hastalar.add(hasta2);
        hastalar.add(hasta3);
        hastalar.add(hasta4);

        for (Hasta hasta:hastalar){
            System.out.println("hasta = " + hasta);
        }

        System.out.println("hastalar.poll() = " + hastalar.poll());
        System.out.println("hastalar.poll() = " + hastalar.poll());
        System.out.println("hastalar.poll() = " + hastalar.poll());
        System.out.println("hastalar.poll() = " + hastalar.poll());
        System.out.println("hastalar.poll() = " + hastalar.poll());

    }
}
