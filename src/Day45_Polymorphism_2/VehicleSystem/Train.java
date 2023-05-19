/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.VehicleSystem;

public class Train extends Vehicle{
    public Train(int capacity, int speed) {
        super(capacity, speed);
    }

    @Override
    public void move() {
        System.out.println("Train is moving at " + this.getSpeed() + " km/h on the railroad.");
    }
}
