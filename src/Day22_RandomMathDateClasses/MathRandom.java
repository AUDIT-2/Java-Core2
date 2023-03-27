/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;


public class MathRandom {
    public static void main(String[] args) {
        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.random() = " + ((int)(Math.random() * 10)));

        // altSinir + (int) (Math.random() * ustSinir) --- altSinir - ustSinir arası tamsayı...ustSinir hariç

        int rastgeleSayi = 10 + (int) (Math.random() * 100-10); // 10 - 100 arası tamsayı....100 dahil değil

        int altSinir = 10;
        int ustSinir = 15;

        rastgeleSayi = altSinir + (int) (Math.random() * (ustSinir - altSinir)) ;

        System.out.println(rastgeleSayi);
    }
}
