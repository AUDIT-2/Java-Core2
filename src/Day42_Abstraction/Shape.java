/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_Abstraction;

public abstract class Shape {
    protected final double PI = 3.14;
    //Generalisation
    //These are abstract methods which are mandatory to be implemented by subclasses
    protected abstract double calculateArea(); //Must be overridden-implemented within subclasses
    protected abstract void draw(); //Must be overridden-implemented within subclasses

    //Normal method
    //This is none-abstract class which is non-mandatory to be implemented by subclasses
    //It may be overridden or not.
    protected void showInfo(){
       System.out.println("I am abstract and parent class.");
   }
   public static void merhaba(){
       System.out.println("Merhaba. Ben bir statik metodum.");
   }
}
