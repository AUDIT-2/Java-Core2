/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.AnimalPly;

public class AnimalPlyTest {
    public static void main(String[] args) {
        Animal animal; //Polymorphic variable--->Parent class Reference Type Animal
        animal = new Animal("Ordinary Animal");
        animal.sound(); //Method of Animal---parent class

        animal = new Cat("Tekir"); //Instance type Cat
        animal.sound(); //Overridden method of Animal class in side the Cat class

        animal = new Dog("Karabaş"); //Instance type Dog
        animal.sound(); //Overridden method of Animal class in side the Dog class

        animal = new Duck("Donald Duck"); //Instance type Duck
        animal.sound(); //Overridden method of Animal class in side the Duck class
    }
}
