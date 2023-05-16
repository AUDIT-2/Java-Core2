/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.InterfacePoly;

public class MyInterfacePlyTest {
    public static void main(String[] args) {
        //Non PolyMorphic declaration
        ClassA classA = new ClassA();
        classA.print("Merhaba");

        ClassB classB = new ClassB();
        classB.print("Benden de bir merhaba");

        //PolyMorphic declaration
        MyInterface mrb; //Polymorphic variable-Interface can hold reference of its subclasses
        mrb = new ClassA(); //variable mrb holds the reference of its subclass ClassB
        mrb.print("PolyMorphic Merhaba");

        mrb = new ClassB(); //variable mrb holds the reference of its subclass ClassB
        mrb.print("PolyMorphic Merhaba");
    }
}
