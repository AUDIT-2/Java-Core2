/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day13_WhileDoWhileLoops;

public class WhileLoopExercise2 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 100){
            if(count == 5){
                System.out.println(count + "-Welcome java.");
            }
            if(count == 7){
                System.out.println(count + "-Java öğreniyorum.");
            }
            count++;
        }
    }
}
