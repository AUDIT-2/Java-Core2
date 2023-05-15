/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Animal;

public class Bird extends Animal implements Ucabilir,Kosabilir{

    public Bird() {
    }

    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println("I am a bird and I can eat tiny animals and wheats.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep on top of the trees.");
    }

    @Override
    public void fly(){
        System.out.println("I am bird and I fly with my wings.");
    }

    @Override
    public void run() {
        System.out.println("I am bird and I run with my two feets.");
    }
}
