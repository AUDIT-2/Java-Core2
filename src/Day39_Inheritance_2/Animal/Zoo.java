/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2.Animal;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private String address;

    private ArrayList<Dog> dogs; //Instance of only Dog class can be added to this arraylist
    private ArrayList<Bird> birds; //Instance of only Bird class can be added to this arraylist
    private ArrayList<Animal> animals; //Instance of only Animal and any child of Animal class can be added to this arraylist
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
        dogs.add(dog); //instance of only Dog Class can be added
        typeless.add(dog); //instance of any Class can be added
    }
    public void addBird(Bird bird){
        birds.add(bird); //instance of only Bird Class can be added
        typeless.add(bird); //instance of any Class can be added
        animals.add(bird); //Instance of only Animal and any child of Animal class can be added

        typeless.add("Merhaba"); //instance of any Class can be added
        typeless.add(1234); //instance of any Class can be added
    }

    public void addAnimal(Animal animal){
        animals.add(animal); //Instance of only Animal and any child of Animal class can be added
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
