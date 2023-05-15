/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Car araba = new Car("Toyota","Avensis");
        CarA arabaBenzin = new CarA("Ford","Focus");

        araba.benzinMotorCalistir();
        araba.elektrikMotorCalistir();

        arabaBenzin.benzinMotorCalistir();
    }
}
