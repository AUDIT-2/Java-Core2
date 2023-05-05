/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2.Animal;

public class Bird extends Animal{

    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat(){
        System.out.println("I am a bird. I am eating only wheats and warms.");
    }
    @Override
    public void makeSound(){
        System.out.println("Cik..cik..cik");
    }
    @Override
    public void move(){
        super.move();//Calling move() method of parent class.
        System.out.println("I am bird and I can move my legs and fly with my wings.");
    }
    public void fly(){
        System.out.println("I am a bird and flying over the trees.");
    }

}
