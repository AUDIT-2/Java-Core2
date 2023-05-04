/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Square kare = new Square();
        kare.draw();
        kare.getArea();
        kare.getArea(10,4);

        Circle daire = new Circle();
        daire.draw();

        Hexagon altigen = new Hexagon();
        altigen.draw();

        Triangle ucgen = new Triangle();
        ucgen.draw();
    }
}
