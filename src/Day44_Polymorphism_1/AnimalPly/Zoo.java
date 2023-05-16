/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.AnimalPly;

import java.util.ArrayList;

public class Zoo {
    private String name;

    //Non-polymorphic way to create instance of classes
    //When it is needed to add new type of animal new ArrayList has to be created to hold instance of new class
    //Also new add method and new list method has to be created for to new type of Animal
    private final ArrayList<Cat> cats;
    private final ArrayList<Dog> dogs;
    private final ArrayList<Duck> ducks;
    private final ArrayList<Bird> birds;

    public Zoo(String name) {
        this.name = name;
        this.cats = new ArrayList<>();
        this.dogs = new ArrayList<>();
        this.ducks = new ArrayList<>();
        this.birds = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addBird(Bird bird){
        birds.add(bird);
    }
    public void addCat(Cat cat){
        cats.add(cat);
    }
    public void addDog(Dog dog){
        dogs.add(dog);
    }
    public void addDuck(Duck duck){
        ducks.add(duck);
    }
    public void dogList(){
        System.out.println("Köpeklerin listesi");
        System.out.println("------------------");
        for (Dog dog:dogs){
            System.out.println(dog.name);
        }
        System.out.println();
    }
    public void catList(){
        System.out.println("Kedilerin listesi");
        System.out.println("------------------");
        for (Cat cat:cats){
            System.out.println(cat.name);
        }
        System.out.println();
    }
    public void duckList(){
        System.out.println("Ördeklerin listesi");
        System.out.println("------------------");
        for (Duck duck:ducks){
            System.out.println(duck.name);
        }
        System.out.println();
    }
    public void birdList(){
        System.out.println("Kuşların listesi");
        System.out.println("------------------");
        for (Bird bird:birds){
            System.out.println(bird.name);
        }
        System.out.println();
    }
}
