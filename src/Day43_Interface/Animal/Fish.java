/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Animal;

public class Fish extends Animal implements Ucabilir,Yuzebilir{
    @Override
    public void eat() {
        System.out.println("I am fish and I eat plankton.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep in water with my eyes open.");
    }

    @Override
    public void fly() {
        System.out.println("I am a flying fish.");
    }

    @Override
    public void swim() {
        System.out.println("I am a fish and I swim in water.");
    }
}
