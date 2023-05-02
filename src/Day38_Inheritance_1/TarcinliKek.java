/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritance_1;

public class TarcinliKek extends Kek{

    private int tarcin;
    private int havuc;

    public TarcinliKek(String name, int un, int seker, int yag, int sut, int kabartmaTozu, int yumurta, int tarcin, int havuc) {
        //Calling Base class constructor to assign base class properties
        super(name, un, seker, yag, sut, kabartmaTozu, yumurta);

        setHavuc(havuc);
        setTarcin(tarcin);
       /* this.tarcin = tarcin;
        this.havuc = havuc;*/
    }

    public int getTarcin() {
        return tarcin;
    }

    public void setTarcin(int tarcin) {
        this.tarcin = tarcin;
    }

    public int getHavuc() {
        return havuc;
    }

    public void setHavuc(int havuc) {
        this.havuc = havuc;
    }

    @Override
    public String toString() {
        return "TarcinliKek{" +
                "tarcin=" + tarcin +
                ", havuc=" + havuc +
                "} " + super.toString();
    }
}
