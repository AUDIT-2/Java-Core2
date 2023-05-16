/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.RunTimePolyMorphism;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void role(){
        System.out.println("May name is " +  name + " and I  am a person.");
    }
}
