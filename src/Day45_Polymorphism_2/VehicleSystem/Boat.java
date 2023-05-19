/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.VehicleSystem;

public class Boat extends Vehicle implements CanFloat{
    public Boat(int capacity, int speed) {
        super(capacity, speed);
    }

    @Override
    public void move() {
        System.out.println("Boat is moving on its wheels.");
    }

    @Override
    public void floats() {
        System.out.println("Boat floats on the sea by the max speed of " + this.getSpeed() + " and carry " + this.getCapacity() + " passengers.");
    }
}
