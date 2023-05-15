/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Animal;

public interface KosabilenYuzebilen extends Yuzebilir {
    //An interface can extend another interface.
    @Override //Yuzebilir interface ine ait metod.
    void swim();

    void run();
}
