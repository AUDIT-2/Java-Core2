/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.VehicleSystem;

public class Helicopter extends Vehicle implements Flyable{
    public Helicopter(int capacity, int speed) {
        super(capacity, speed);
    }

    @Override
    public void fly() {
        System.out.println("Ben bir helikopterim.Uçabilirim");
    }

    @Override
    public void move() {
        System.out.println("Yavaş hareket ederim.");
    }
}
