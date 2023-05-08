/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.PackageA;

import Day40_AccessModifiers.PackageB.AccessModifiers;

public class ClassPackageA extends AccessModifiers{
    public static void main(String[] args) {
        System.out.println("Access modifiers in Java. Accessing different class from different package.");
        AccessModifiers obj = new AccessModifiers();

        obj.name = "Ahmet"; //Public
        // obj.id = 1234; //Private- Can access only within same class
        // obj.TCNo = "1234556678"; //Protected-Same package
        // obj.okulNo = 5667; //Default //Same package

        //Private-Only same class members can access.
        /* int toplam = obj.privateToplam(12,5);
        System.out.println("toplam = " + toplam);*/

        // obj.proMethod();
        // obj.defMethod();
        obj.pubMethod();

        ClassPackageA obje1 = new ClassPackageA(); //ClassPackageA is a child-sub class of AccessModifiers class

        obje1.name = "Ali"; //public
        obje1.TCNo = "123718327"; //protected
        obje1.proMethod(); //Protected method
        obje1.pubMethod(); //Public method

        //obje1.defMethod();
    }

}
