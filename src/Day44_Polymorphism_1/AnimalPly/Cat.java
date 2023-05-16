/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.AnimalPly;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("My name is " + name + " and I make sound ...Miyav...miyav");
    }
}
