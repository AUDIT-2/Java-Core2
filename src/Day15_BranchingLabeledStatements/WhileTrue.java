/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day15_BranchingLabeledStatements;

public class WhileTrue {
    public static void main(String[] args) {
        int sayac = 1;
        while (true){
            System.out.println(sayac + "- Merhaba");
            sayac++;
            if(sayac > 10) break;
        }
        System.out.println("------------");

        boolean devam = true;
        sayac = 1;
        while (devam){
            System.out.println(sayac + "- Merhaba(devam)");
            sayac++;
            if(sayac > 10) devam = false;
        }
    }
}
