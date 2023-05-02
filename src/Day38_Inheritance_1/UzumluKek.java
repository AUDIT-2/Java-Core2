/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritance_1;

public class UzumluKek extends Kek{
    private int uzum;

    public UzumluKek(String name, int un, int seker, int yag, int sut, int kabartmaTozu, int yumurta, int uzum) {
        //Calling Base class constructor to assign base class properties
        super(name, un, seker, yag, sut, kabartmaTozu, yumurta);

        setUzum(uzum);
        /*this.uzum = uzum;*/
    }

    public int getUzum() {
        return uzum;
    }

    public void setUzum(int uzum) {
        this.uzum = uzum;
    }

    @Override
    public String toString() {
        return "UzumluKek{" +
                "uzum=" + uzum +
                "} " + super.toString();
    }
}
