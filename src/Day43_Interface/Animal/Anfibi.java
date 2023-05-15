/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Animal;

public class Anfibi extends Animal implements KosabilenYuzebilen{
    @Override
    public void eat() {
        System.out.println("I am an Anfibi type animal. And I eat what I find.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep wherever find a place which is safe for me.");
    }

    @Override
    public void swim() {
        System.out.println("I am an Anfibi type animal.And I may swim in see or lake");
    }

    @Override
    public void run() {
        System.out.println("I am an Anfibi type animal. I may run in land");
    }
}
