/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

public class DayOfWeek {
    public static void main(String[] args) {
        int weeks = 4;
        int days = 7;

        //Nested---> iç-içe for loop
        //Outer loop prints weeks
        for (int i = 1; i <=weeks ; i++) {
            System.out.println("Week : " + i);
            //inner loop prints days
            for (int j = 1; j <=days; j++) {
                System.out.println("Day : " + j);
            }
        }
    }
}
