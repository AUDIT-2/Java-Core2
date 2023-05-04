/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2.PackageB;

import Day39_Inheritance_2.PackageA.PackageA;

public class PackageATestB extends PackageA {
    public static void main(String[] args) {
        PackageA objeA = new PackageA();
        System.out.println(objeA.name);//Public
        System.out.println(objeA.no); //Public
        objeA.aPublicMethod(); //Public

        PackageATestB objeB = new PackageATestB();
        System.out.println(objeB.salary); //Protected-Has inheritance relationship
        objeB.aPublicMethod(); //public
        System.out.println(objeB.name);//Public
        System.out.println(objeB.no);//Public

       // objeB.address //default-therefore can not be accessed outside the package

    }
}
