/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.util.Random;

public class RandomExample1 {
    //Write code that generates a random odd integer (not divisible by 2)
    // between 50 and 99 inclusive.

    public static void rasgeleSayiUret(int altSinir,int ustSinir){
        //Alt ve Ust sınır dahil
        Random rastgeleSayi = new Random();
        int tekSayi = 0;

        while (true){
            tekSayi = rastgeleSayi.nextInt(ustSinir + 1 - altSinir) + altSinir;
            if(tekSayi % 2 != 0){
                System.out.println("Sayi = " + tekSayi);
                break;
            }
        }
    }

    public static void rastgeleayiUret(int altSinir, int ustSinir, int adet){
        for (int i = 0; i < adet; i++) {
            System.out.print(i + 1 + " ---> ");
            rasgeleSayiUret(altSinir,ustSinir);
        }
    }

    public static void main(String[] args) {
        int altSinir = 50;
        int ustSinir = 99;

        rasgeleSayiUret(altSinir,ustSinir);
        rastgeleayiUret(altSinir,ustSinir,10);
    }
}
