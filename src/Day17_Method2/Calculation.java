/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day17_Method2;

public class Calculation {
    public static void main(String[] args) {
        calculation(2,6,8);
        calculation(2,4,5);
    }

    public static void calculation(int num1, int num2, int num3){
        int toplam;
        toplam = num1 + num2 + num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        System.out.println("Toplam = " + toplam);
    }
}
