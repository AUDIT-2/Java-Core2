/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Vehicle;

public class Elektrikli extends Vehicle implements ElektrikMotorlu{

    public Elektrikli(String marka, String model) {
        super(marka, model);
    }

    @Override
    void start() {
        elektrikMotorCalistir();
    }

    @Override
    void stop() {
        System.out.println("Motoru durdurdum.");
    }

    @Override
    public void elektrikMotorCalistir() {
        System.out.println("Elektrik motoru çalıştırıldı.");
    }
}
