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
        System.out.println("I am a chicken. I eat worms and corn.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep on a stick.");
    }

    @Override
    public void run() {
        System.out.println("I am chicken and I run with my two feet.");
    }
}
