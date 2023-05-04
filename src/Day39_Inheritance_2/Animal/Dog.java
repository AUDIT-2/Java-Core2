/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2.Animal;

public class Dog extends Animal {
    public Dog(String name, int age, String color) {
        //Parent class constructor calls
        super(name, age, color);
    }

    @Override
    public void makeSound(){
        System.out.println("Hav...hav...haavvv");
    }
    public void move(){
        System.out.println("I am a dog and I am running with my four legs.");
    }

    @Override
    public String toString() {
        return "I am a Dog \n" + super.toString();
    }
}
