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
        //Implementation of interface method

    }

    @Override
    void stop() {
        //Implementation of interface method

    }

    @Override
    public void benzinMotorCalistir() {
        //Implementation of interface method
        System.out.println("Benzin motoru çalıştırıldı.");
    }

    @Override
    public void elektrikMotorCalistir() {
        //Implementation of interface method
        System.out.println("Elektril motoru çalıştırıldı.");
    }
}
