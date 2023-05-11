/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_Abstraction;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
       setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0){
            this.radius = radius;
        } else this.radius = 1;
    }

    @Override
    protected double calculateArea() {
        return radius * radius * super.PI;
    }

    @Override
    protected void draw() {
        System.out.println("Drawing a Circle with radius = " + getRadius());
    }
}
