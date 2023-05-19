/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.VehicleSystem;

public class Car extends Vehicle { //Car is a Vehicle

    public Car(int capacity, int speed) {
        super(capacity, speed);
    }

    @Override
    public void move() {
        System.out.println("Car is moving at " + this.getSpeed() + " km/h on the road.");
        System.out.println("Car has " + this.getCapacity() + " passengers.");
    }
}
