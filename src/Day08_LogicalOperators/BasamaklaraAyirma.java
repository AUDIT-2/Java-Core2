/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day08_LogicalOperators;

public class BasamaklaraAyirma {
    public static void main(String[] args) {
        System.out.println("Sayıyı basamaklara ayırma.");
        System.out.println("--------------------------");
        int sayi = 6547;
        int birler, onlar, yuzler, binler;

        birler = sayi % 10;
        System.out.println("birler \t\t= " + birler); // "\t" ---> klavyedeki TAB

        sayi = sayi / 10; //654
        onlar = sayi % 10;
        System.out.println("onlar \t\t= " + onlar);

        sayi = sayi / 10; //65
        yuzler = sayi % 10;
        System.out.println("yuzler \t\t= " + yuzler);

        sayi = sayi / 10; //6
        binler = sayi % 10;
        System.out.println("binler \t\t= " + binler);

    }
}
