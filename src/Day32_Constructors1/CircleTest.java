/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day32_Constructors1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(); //Instance(object) of class has created with no-args constructor ---> object
        circle.radius = 15;
        System.out.println("circle.radius = " + circle.radius);

        System.out.println("circle = " + circle);

        Circle circle1 = new Circle(25,3); //Instance(object) of class has created with parameterized constructor ---> object

        System.out.println("circle1 = " + circle1);
        System.out.println("circle1.radius = " + circle1.radius);

        circle1.setRadius(33);
        System.out.println("circle1.radius = " + circle1.radius);

        System.out.println("Dairenin alanı = " + circle1.getArea());
        double alan = circle1.getArea();
        System.out.println("Dairenin alanı = " + alan);

        double hacim = circle1.getVolume();
        System.out.println("hacim = " + hacim);

        double hacim1 = circle1.getArea() *  4;
        System.out.println("hacim1 = " + hacim1);

        System.out.println("circle1.showInfo() = " + circle1.showInfo());
        String str = circle1.showInfo();
        System.out.println(str);
    }
}
