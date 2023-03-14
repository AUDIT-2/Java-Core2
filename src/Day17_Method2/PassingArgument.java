/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day17_Method2;

public class PassingArgument {
    public static void main(String[] args) {
        ekrandaGoster(100);
        int number = 34;
        ekrandaGoster(number);

        number = 50;
        ekrandaGoster(number);
        double sayiDbl = 25.5;

        ekrandaGoster((int)sayiDbl);
        ekrandaGoster((int)23.4);
    }

    public static void ekrandaGoster(int sayi){
        System.out.println("Parametre olarak gönderilen değer = " + sayi);
    }
}
