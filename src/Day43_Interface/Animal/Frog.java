/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Animal;

public class Frog extends Animal implements Kosabilir,Yuzebilir{

    //A class can implement multiple interface--- multiple inheritance can be done with interface in Java.
    public Frog() {
    }

    public Frog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println("I am frog. And I eat flies.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep under the rocks.");
    }

    @Override
    public void run() {
        System.out.println("I run with my four legs.");
    }

    @Override
    public void swim() {
        System.out.println("Whenever I need, I can swim in water.");
    }

}
