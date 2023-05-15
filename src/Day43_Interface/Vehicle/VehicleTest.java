/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        //Subclass of Hybrid class.
        Car araba = new Car("Toyota","Avensis");

        System.out.println(araba.getMarka());
        System.out.println(araba.getModel());
        araba.benzinMotorCalistir();
        araba.elektrikMotorCalistir();


        //Subclass of Benzinli
        CarA arabaBenzinli = new CarA("Ford","Focus");

        System.out.println(arabaBenzinli.getMarka());
        System.out.println(arabaBenzinli.getModel());
        arabaBenzinli.benzinMotorCalistir();
    }
}
