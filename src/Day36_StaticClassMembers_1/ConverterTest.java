/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

public class ConverterTest {
    public static void main(String[] args) {
        System.out.println("Converter.kdvHesapla(100) = " + Converter.kdvHesapla(100));
        double kdv = 0;
        kdv = Converter.kdvHesapla(250);
        System.out.println("kdv = " + kdv);

        System.out.println("Converter.boyKiloIndex(1.78,85) = " + Converter.boyKiloIndex(1.78, 85));

    }
}
