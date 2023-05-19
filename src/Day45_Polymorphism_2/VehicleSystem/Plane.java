/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.VehicleSystem;

public class Plane extends Vehicle implements Flyable,CanFloat{
    private int attitude;

    public Plane(int capacity, int speed, int attitude) {
        super(capacity, speed);
        this.attitude = attitude;
    }

    public int getAttitude() {
        return attitude;
    }

    public void setAttitude(int attitude) {
        this.attitude = attitude;
    }

    @Override
    public void move() {
        System.out.println("Plane is moving at " + this.getSpeed() + " km/h in air.");
    }

    @Override
    public void fly() {
        System.out.println("The plane is flying at " + this.attitude + " feet.");
    }
    public void banaOzel(){
        System.out.println("Bana özel metod.");
    }

    @Override
    public void floats() {
        System.out.println("Ben bir deniz uçağıyım. Aynı zamanda yüzebilirim.");
    }
}
