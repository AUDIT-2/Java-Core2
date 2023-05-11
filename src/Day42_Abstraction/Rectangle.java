/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_Abstraction;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0){
            this.width = width;
        } else this.width = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length > 0){
            this.length = length;
        } else this.length = 1;
    }

    @Override
    protected double calculateArea() {
        return width * length;
    }

    @Override
    protected void draw() {
        System.out.println("Drawing a rectangle with length = " + getLength() + " and width = " + getWidth());
    }
}
