/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day06_CastOperators;

public class CastingToChar {
    public static void main(String[] args) {
        char harf1, harf2, harf3;
        int num = 65;
        harf1 = (char) num; // Explicit Casting- int --> char narrowing
        System.out.println("char deger = " + harf1); // ASCII code tablosundaki 65 sayısının char tipine dönüştürülmesi sonucu 'A' harfini yazdırır.

        int num2 = harf1; // Implicit Casting --> char to int automatic casting-widening
        System.out.println("int deger = " + num2);

        harf2 = 'B';
        harf3 = 67;

        System.out.println("Harf1, harf2 , harf 3 : " + harf1 + " - " +  harf2 + " - " + harf3);

        char harf4 = 32755;
        System.out.println("harf4 = " + harf4);

        //Boolean can not be casted to any primitive data types
        boolean bl = true;
        //int i = (int) bl; //Hata verir
    }
}
