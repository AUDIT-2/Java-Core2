/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day21_MemoryGarbageCollection;

public class OverFlowStack {
    public static void recursiveMethod(int i){
        System.out.println(i);
        recursiveMethod(i + 1);
    }

    public static void recursiveMethodDogru(int i){
        if(i > 100){
            return;
        }
        System.out.println(i);
        recursiveMethodDogru(i + 1);
    }

    public static void main(String[] args) {
        System.out.println("Stack Memory Error-Example");
        //recursiveMethod(1);
        recursiveMethodDogru(1);
    }
}
