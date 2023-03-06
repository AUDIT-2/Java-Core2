/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day13_WhileDoWhileLoops;

public class WhileExercise1 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            //Point A ---Always true
            System.out.println("Point A "+ (count < 10));
            System.out.println("Welcome to java.");
            count++;
            //Point B-- True yalnız count = 10 olduğunda false
            System.out.println(count +" Point B "+ (count < 10));
        }
        //Point C
        System.out.println("Point C "+ (count<10));
    }
}
