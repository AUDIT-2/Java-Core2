/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeywordMethodHiding.Banka;

public class ABCBank extends Banka{
    private float rate = 0.08f; //Parent class rate variable is hided in child class

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
                "Myrate=" + this.rate + " " +
                "ParentRate = " + super.rate + //Parent class rate variable
                "} " + super.toString(); //Parent class toString() method
    }
}
