/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("An Animal",5,"Black");

        System.out.println(animal);

        animal.makeSound();
        animal.eat();
        animal.move();

        System.out.println();

        Dog kopek1 = new Dog("Lessi",15,"White");
        System.out.println(kopek1);
        kopek1.makeSound();
        kopek1.eat();
        kopek1.move();

        System.out.println();
        Bird kus1 = new Bird("Cici kuş",3,"Yellow");
        System.out.println(kus1);
        kus1.makeSound();
        kus1.eat();
        kus1.move();
    }
}
