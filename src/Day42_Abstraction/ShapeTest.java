/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_Abstraction;

public class ShapeTest {
    public static void main(String[] args) {
        Shape.merhaba();

        Rectangle kare = new Rectangle(5,5);
        System.out.println("Kare'nin alanı = " + kare.calculateArea());
        kare.draw();

        Circle daire = new Circle(5);
        System.out.println("Daire'nin alanı = " + daire.calculateArea());
        daire.draw();
    }
}
