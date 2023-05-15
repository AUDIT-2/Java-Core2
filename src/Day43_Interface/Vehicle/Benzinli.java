/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Vehicle;

public class Benzinli extends Vehicle implements BenzinMotorlu{

    public Benzinli(String marka, String model) {
        super(marka, model);
    }

    @Override
    void start() {

    }

    @Override
    void stop() {

    }

    @Override
    public void benzinMotorCalistir() {

    }
}
