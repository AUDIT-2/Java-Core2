/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.AnimalPly;

public class ZooTest {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("ABC Hayvanat Bahçesi");

        Dog dog1 = new Dog("Karabaş");
        zoo.addDog(dog1);

        Cat cat1 = new Cat("Tekir");
        zoo.addCat(cat1);

        Duck duck1 = new Duck("White");
        zoo.addDuck(duck1);

        Dog dog2 = new Dog("Pardon");
        zoo.addDog(dog2);

        zoo.dogList();
        zoo.catList();
        zoo.duckList();
    }
}
