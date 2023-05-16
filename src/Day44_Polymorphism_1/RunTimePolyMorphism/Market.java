/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.RunTimePolyMorphism;

public class Market extends Person{
    public Market(String name) {
        super(name);
    }

    @Override
    public void role() {
        System.out.println("May name is " + name  + " And I am customer.");
    }
}
