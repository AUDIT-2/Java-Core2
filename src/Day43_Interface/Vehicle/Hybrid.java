/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Vehicle;

public class Hybrid extends Vehicle implements BenzinMotorlu,ElektrikMotorlu{
    public Hybrid(String marka, String model) {
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
        System.out.println("Benzin motoru çalıştırıldı.");
    }

    @Override
    public void elektrikMotorCalistir() {
        System.out.println("Elektril motoru çalıştırıldı.");
    }
}
