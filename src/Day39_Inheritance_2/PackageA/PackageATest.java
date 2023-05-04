/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2.PackageA;

public class PackageATest {
    public static void main(String[] args) {
        PackageA obje1 = new PackageA();

        System.out.println(obje1.no); //Public
        System.out.println(obje1.name);//Public
        System.out.println(obje1.salary);////Same package and other class which has inheritance relationship
        //obje1.secret //private. only same class members can access
        obje1.aMethod();
        obje1.print();
    }
}
