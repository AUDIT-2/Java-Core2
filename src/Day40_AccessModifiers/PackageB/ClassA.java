/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.PackageB;

public class ClassA {
    public static void main(String[] args) {
        System.out.println("Access modifiers in Java. Accessing different class with in same package.");
        AccessModifiers obj = new AccessModifiers();

        obj.name = "Ahmet"; //Public
       // obj.id = 1234; //Private- Can access only within same class
        obj.TCNo = "1234556678"; //Protected-Same package
        obj.okulNo = 5667; //Default //Same package

        //Private-Only same class members can access.
       /* int toplam = obj.privateToplam(12,5);
        System.out.println("toplam = " + toplam);*/

        obj.proMethod();
        obj.defMethod();
        obj.pubMethod();
    }
}
