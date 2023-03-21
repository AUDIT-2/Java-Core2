/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day20_ClassesAndObjects;

public class CarTest {
    public static void main(String[] args) {
        Car araba1 = new Car("Ford","Focus");
        araba1.color = "Beyaz";
        araba1.year = 2020;
        araba1.engineType = "Benzin";

        araba1.showInfo();

        Car araba2 = new Car();
        araba2.color = "Gold";
        araba2.model = "Golf";
        araba2.marka = "Wolkswagen";
        araba2.year = 1999;
        araba2.engineType = "Diesel";

        araba2.showInfo();

        Car araba3  = new Car("Audi","A3","Mavi","Benzin",2023);
        araba3.showInfo();
    }
}
