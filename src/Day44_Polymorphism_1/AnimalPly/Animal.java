/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.AnimalPly;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound(){
        System.out.println("My name is " + name + " I am an animal.");
    }
}
