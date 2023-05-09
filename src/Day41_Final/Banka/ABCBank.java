/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_Final.Banka;

public class ABCBank extends Banka{
    private float rate = 0.08f;

    @Override
    public float getRateOfInterest(){
        return rate;
    }
    public float getRateSuper(){
        return super.getRateOfInterest();
    }

    @Override
    public String toString() {
        return "ABCBank{" +
                "Myrate=" + rate + " " +
                "ParentRate = " + super.rate +
                "} " + super.toString();
    }
}
