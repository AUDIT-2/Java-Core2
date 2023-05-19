/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.VehicleSystem;
/*
In this example, the Vehicle class is an abstract class that defines the properties and methods common(generalization) to all types of vehicles.
The Car, Plane and Train classes extend the Vehicle class and provide specific implementations for the move() method.
The Plane class also implements the Flyable interface which defines the fly() method that all flyable vehicles must have.
The SeaPlane class also implements the Flyable and canFloat interface which defines the fly() and floats() methods that all flyable and canFloat vehicles must have.
The Boat class also implements the CanFloat interface which defines the floats() method that all float-able  vehicles must have.
The TransportationSystem class uses polymorphism by creating variables of type Vehicle and assigning objects of different types (Car, Plane, Train,Boat, Helicopter) to them.
 */

public abstract class Vehicle {
   private int capacity;
   private int speed;

    public Vehicle(int capacity, int speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Abstract method must be implemented by sub Classes
   public abstract void move();
}
