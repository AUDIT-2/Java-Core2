/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Animal;

public class Tavuk extends Animal implements Kosabilir{
    @Override
    public void eat() {
        //Implementation of interface method
        System.out.println("I am a chicken. I eat worms and corn.");
    }

    @Override
    public void sleep() {
        //Implementation of interface method
        System.out.println("I sleep on a stick.");
    }

    @Override
    public void run() {
        //Implementation of interface method
        System.out.println("I am chicken and I run with my two feet.");
    }
}
