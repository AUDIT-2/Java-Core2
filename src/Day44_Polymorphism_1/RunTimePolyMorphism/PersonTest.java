/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.RunTimePolyMorphism;

public class PersonTest {
    public static void main(String[] args) {
        Person person; // person --> Polymorphic variable

        person = new Person("Ahmet");
        System.out.println("Address of person = " + person);
        person.role();

        person = new Family("Mehmet");
        System.out.println("Address of person = " + person);
        person.role();

        person = new Market("Ayşe");
        System.out.println("Address of person = " + person);
        person.role();
    }
}
