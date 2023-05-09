/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_Final.Banka;

public class XYZBank extends Banka {
    private float rate = 0.09f; //Parent class rate variable is hided in child class

    @Override
    public float getRateOfInterest(){
        return rate;
    }
    @Override
    public String toString() {
        return "XYZBank{" +
                "Myrate=" + rate + " " +
                "ParentRate = " + super.rate +
                "} " + super.toString();
    }
}
