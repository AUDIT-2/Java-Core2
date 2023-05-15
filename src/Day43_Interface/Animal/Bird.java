/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Animal;

public class Bird extends Animal implements Ucabilir,Kosabilir{
    //A class can implement multiple interface--- multiple inheritance can be done with interface in Java.
    public Bird() {
    }

    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        //Implementation of interface method
        System.out.println("I am a bird and I can eat tiny animals and wheats.");
    }

    @Override
    public void sleep() {
        //Implementation of interface method
        System.out.println("I sleep on top of the trees.");
    }

    @Override
    public void fly(){
        //Implementation of interface method
        System.out.println("I am bird and I fly with my wings.");
    }

    @Override
    public void run() {
        //Implementation of interface method
        System.out.println("I am bird and I run with my two feets.");
    }
}
