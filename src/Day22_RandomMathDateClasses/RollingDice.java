/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.util.Random;

public class RollingDice {
    public static int zarAt(){
        Random zar = new Random();
        return zar.nextInt(6) + 1; //1 - 6 arası rastgele sayı üretir.
    }

    public static void main(String[] args) {
       int sumOfTwoDices = 0;
       int zar1 = 0;
       int zar2 = 0;
       int counter = 0;
       while (sumOfTwoDices != 8){
           counter++;
           zar1 = zarAt();
           zar2 = zarAt();

           System.out.println("Atış sayısı : " + counter);
           System.out.println("Zar-1 : " + zar1);
           System.out.println("Zar-2 : " + zar2);
           System.out.println();
           sumOfTwoDices = zar1 + zar2;
       }
    }
}
