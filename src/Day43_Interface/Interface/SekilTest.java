/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Interface;

public class SekilTest {
    public static void main(String[] args) {
        //Callig a static method of an Interface
        Sekil.merhaba();

        //Accessing static fields of an Interface. All fields(properties,attributes, variables) are public,static and final in an Interface
        System.out.println(Sekil.MAX_LENGTH);
        System.out.println(Sekil.MAX_WIDTH);

        Kare kare1 = new Kare();
        kare1.draw();
        System.out.println(kare1.getArea(12, 25));
        System.out.println(kare1.getPerimeter(12, 25));

        kare1.drawDef();
    }
}
