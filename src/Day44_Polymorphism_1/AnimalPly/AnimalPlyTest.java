/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.AnimalPly;

public class AnimalPlyTest {
    public static void main(String[] args) {
        Animal animal; //Polymorphic variable--Parent class Animal type
        animal = new Animal("Ordinary Animal");
        animal.sound();

        animal = new Cat("Tekir");
        animal.sound();

        animal = new Dog("Karabaş");
        animal.sound();

        animal = new Duck("Donald Duck");
        animal.sound();
    }
}
