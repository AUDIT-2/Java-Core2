/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2;

public class Square extends Shape{

    @Override
    public void draw(){
        System.out.println("I am a square shape and drawing square.");
    }

    @Override
    protected void getArea(){
        System.out.println("Overriding version of super.getArea()");
    }
    //Method overload
    public void getArea(int x, int y){
        System.out.println("Area of Square : " + (x * y));
    }
}
