/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day15_BranchingLabeledStatements;

public class LabelledDoWhile {
    public static void main(String[] args) {
        int i = 0;
        outer:
        do {
            System.out.println("Outer loop.");
            i = 8;
            inner:
            while (true){
                System.out.println("inner loop.");
                System.out.println(i--);
                if(i==4){
                    break outer;
                }
            }
        }while (true);
    }
}
