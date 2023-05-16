/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.InterfacePoly;

public class MyInterfacePlyTest {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.print("Merhaba");

        ClassB classB = new ClassB();
        classB.print("Benden de bir merhaba");

        MyInterface mrb; //Polymorphic variable
        mrb = new ClassA();
        mrb.print("PolyMorphic Merhaba-ClassA");

        mrb = new ClassB();
        mrb.print("PolyMorphic Merhaba-ClassB");
    }
}
