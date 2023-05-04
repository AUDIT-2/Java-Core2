/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2.Animal;

public class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(){
        System.out.println("I am an animal and I am moving.");
    }
    public void eat(){
        System.out.println("I am eating food.");
    }

    public void makeSound(){
        System.out.println("I am making some kind of sound.");
    }

    @Override
    public String toString(){//Object class ına ait toString() metodun etkisiz hale getirip yeni halini yazdık
        return "Name : " + this.getName() + " Age: " + this.age + " Color: " + this.color;
    }

}
