/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2;

public class Shape {
    public void draw(){
        System.out.println("I am a method(SUPER) which draws lines.");
    }

    protected void getArea(){ //Protected access modifier. only class may call which has inheritance relationship
        System.out.println("Calculate area of shape.");
    }
}
