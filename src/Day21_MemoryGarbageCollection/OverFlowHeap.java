/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day21_MemoryGarbageCollection;

public class OverFlowHeap {
    public static void main(String[] args) {
        System.out.println("Heap Memory >Error< -OutofMemory");
        String str = "Merhaba";

        for (int i = 0; i < 100; i++) {
            str += str;
            System.out.println(str);
            System.out.println("str.length() = " + str.length());
        }

    }
}
