/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day50_Collection3;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> vectorList = new Vector<>();
        vectorList.add(1234);
        vectorList.add(126734);
        vectorList.add(122234);
        vectorList.add(34);

        System.out.println(((Vector<Integer>) vectorList).elementAt(0));
        System.out.println(vectorList.get(0));
        System.out.println();
        System.out.println(vectorList);

        for (Integer eleman : vectorList) {
            System.out.println(eleman);
        }
    }
}
