/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Vehicle;

public class Benzinli extends Vehicle implements BenzinMotorlu{
    //Vehicle sınıfından türetilen ve BenzinMotorlu interface ini implement eden bir sınıf.

    public Benzinli(String marka, String model) {
        super(marka, model);
    }


    @Override
    void start() {
        //Implementation of interface method
        benzinMotorCalistir();
    }

    @Override
    void stop() {
        //Implementation of interface method
        System.out.println("Motoru durdurdum.");
    }

    @Override
    public void benzinMotorCalistir() {
        //Implementation of interface method
        System.out.println("Benzin motoru çalıştırıldı.");
    }
}
