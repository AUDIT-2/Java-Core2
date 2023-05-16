/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.AnimalPly;

public class ZooPlyTest {
    public static void main(String[] args) {
        ZooPly zooply = new ZooPly("ABC Hayvanat Bahçesi-POLY");

        Animal animal;

        animal = new Dog("Karabaş");
        zooply.addAnimal(animal);

        animal = new Cat("Mahur");
        zooply.addAnimal(animal);

        //Sub class a özel metoda ulaşmak için poly-variable sub class türüne cast edilmelidir.
        ((Cat)animal).tirmala();

        animal = new Duck("Ördek");
        zooply.addAnimal(animal);

        animal = new Bird("Cici kuş");
        zooply.addAnimal(animal);

        animal = new Lion("Aslan Kral");
        zooply.addAnimal(animal);

        zooply.listAnimals();
    }
}
