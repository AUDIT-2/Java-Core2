/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day15_BranchingLabeledStatements;

public class WhileBreak {
    public static void main(String[] args) {
        int balance = 10;

        while (true){
           if(balance < 9) break;
           balance = balance - 9; //balance -= 9;

        }
        System.out.println("Balance is = " + balance);
        System.out.println("Döngünün dışındayım.");
    }
}
