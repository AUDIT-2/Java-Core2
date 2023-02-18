/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day03_Variables1;

public class HizUzaklikHesaplama {
    public static void main(String[] args) {
        System.out.println("Hız, uzaklık ve süre hesaplama programı.");
        //Distance = Speed * Time
        int distance; //Hesaplanacak mesafe değişkeni
        int speed;
        int time;

        distance = 100 * 5;
        System.out.println("Katedilen mesafe : " + distance + " Km");

        speed = 150;
        time = 7;
        distance = speed * time;
        System.out.println("Hız = " + speed + " (Km/saat)");
        System.out.println("Süre = " + time + " (Saat)");
        System.out.println("Katedilen mesafe : " + distance + " Km");

    }
}
