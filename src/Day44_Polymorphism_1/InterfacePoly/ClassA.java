/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.InterfacePoly;

public class ClassA implements MyInterface{
    @Override
    public void print(String str) {
        System.out.println("ClassA --> " + str);
    }
}
