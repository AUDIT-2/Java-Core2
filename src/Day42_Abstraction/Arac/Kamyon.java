/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_Abstraction.Arac;

public class Kamyon extends Arac{//Kamyon is-a Arac

    public Kamyon(int kapiSayisi, String marka, String renk) {
        super(kapiSayisi, marka, renk);
    }

    @Override
    protected void start(boolean emniyetKemeri) {

    }

    @Override
    protected void stop() {

    }

    @Override
    protected void move() {

    }

    @Override
    protected void turnRight(int angle) {

    }

    @Override
    protected void turnLeft(int angle) {

    }
}
