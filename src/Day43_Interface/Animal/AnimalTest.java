/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Animal;

public class AnimalTest {
    public static void main(String[] args) {
      //  Animal animal = new Animal();
        Bird kus = new Bird("Cici kuş",3,"Yellow");
        kus.eat();
        kus.fly();
        kus.run();
        kus.sleep();

        Frog kurbaga = new Frog("Kermit",15,"Greenish");
        kurbaga.eat();
        kurbaga.run();
        kurbaga.swim();
        kurbaga.sleep();
    }
}
