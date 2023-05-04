/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2.Animal;

import java.util.ArrayList;
import java.util.Objects;

public class Zoo {
    private String name;
    private String address;

    private ArrayList<Dog> dogs; //Instance of Dog class can be added to this arraylist
    private ArrayList<Bird> birds; //Instance of Bird class can be added to this arraylist
    private ArrayList<Animal> animals; //Instance of Animal and any child of Animal class can be added to this arraylist
    private ArrayList typeless; //Instance of any class(Integer,String....) can be added to this arraylist

    public Zoo(String name, String address){
        dogs = new ArrayList<>();
        birds = new ArrayList<>();
        animals = new ArrayList<>();
        typeless = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addDog(Dog dog){
        dogs.add(dog);
        typeless.add(dog);
    }
    public void addBird(Bird bird){
        birds.add(bird);
        typeless.add(bird);
        animals.add(bird);

        typeless.add("Merhaba");
        typeless.add(1234);
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public ArrayList getTypeless(){
        return typeless;
    }
    public ArrayList<Dog> getDogs(){
        return dogs;
    }
    public ArrayList<Bird> getBirds(){
        return birds;
    }
    public ArrayList<Animal> getAnimals(){
        return animals;
    }
}
