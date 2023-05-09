/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeywordMethodHiding.Banka;

public class Banka {
    //Parent class
    protected String name;
    protected String address;

    protected float rate = 0.15f;

    protected float getRateOfInterest(){
        return rate;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
