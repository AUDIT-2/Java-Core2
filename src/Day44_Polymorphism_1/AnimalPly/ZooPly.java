/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.AnimalPly;

import java.util.ArrayList;

public class ZooPly {
    private String name;
    private final ArrayList<Animal> animals;

    public ZooPly(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void listAnimals(){
        System.out.println("Hayvanat bahçesindeki hayvanlar");
        System.out.println("-------------------------------");
        for (Animal animal:animals){
            System.out.println(animal.getClass().getSimpleName());
            System.out.println("----------");
            System.out.println(animal.name);

            animal.sound();
            if(animal instanceof Cat){
                ((Cat) animal).tirmala();
            }
            if (animal instanceof Dog){
                ((Dog) animal).bite();
            }
            if(animal instanceof  Bird){
                ((Bird) animal).fly();
            }
        }
    }
}
