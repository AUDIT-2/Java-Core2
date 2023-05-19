/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.VehicleSystem;

/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

public class SeaPlane extends Vehicle implements Flyable,CanFloat{
    private int attitude;

    public SeaPlane(int capacity, int speed, int attitude) {
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
        System.out.println("Sea Plane is moving at " + this.getSpeed() + " km/h in air.");
    }

    @Override
    public void fly() {
        System.out.println("The sea plane is flying at " + this.attitude + " feet.");
    }
    public void banaOzel(){
        System.out.println("Bana özel metod.");
    }

    @Override
    public void floats() {
        System.out.println("Ben bir deniz uçağıyım. Aynı zamanda yüzebilirim.");
    }
}

