/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.RunTimePolyMorphism;

public class RuntimePolyTest {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        parentObj.ekranaYaz();

        ChildA childAObj = new ChildA();
        childAObj.ekranaYaz();

        ChildB childBobj = new ChildB();
        childBobj.ekranaYaz();

    }
}
