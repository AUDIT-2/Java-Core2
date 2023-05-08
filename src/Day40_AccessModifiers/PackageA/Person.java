/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.PackageA;

public class Person {
    protected String name;
    protected String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    protected void displayInfo(){
        System.out.println("Person Info");
        System.out.println("--------------------");
        System.out.println("Name     : " + name);
        System.out.println("Address  : " + address );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
