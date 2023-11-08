/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day15_BranchingLabeledStatements;

public class DoWhileContinue {
    public static void main(String[] args) {
        int start = 0;
        int sum = 0;

        do {
            if(start % 2 == 0){
                continue;
            }
            sum = sum + start; // sum += start;
        }while (start++ < 10);
        System.out.println("sum = " + sum);
    }
}
