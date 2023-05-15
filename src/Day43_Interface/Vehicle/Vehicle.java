/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Vehicle;

public abstract class Vehicle {
    String marka;
    String model;

    public Vehicle(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }
    abstract void start();
   abstract void stop();
}
