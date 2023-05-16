/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.AnimalPly;

public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("I am a Bird.");
        System.out.println("My name is " + name + " and I make sound ...Cik...cik");
    }

    public void fly(){
        System.out.println("Benim adım " + name);
        System.out.println("Ben bir kuşum");
        System.out.println("Beni yakalayamazsın çünkü ben uçabiliyorum!!!");
    }
}
