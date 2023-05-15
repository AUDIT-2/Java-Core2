/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Animal;

public interface KosabilenYuzebilen extends Yuzebilir {
    //An interface can extend another interface.

    //Abstract method by default public modifier.
    //Child class which implements this interface must implement the method.
    @Override //Yuzebilir interface ine ait metod.
    void swim();

    //Abstract method by default public modifier.
    //Child class which implements this interface must implement the method.
    void run();
}
