/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritance_1;

public class PortakalliKek extends Kek{
    private int portakal;

    public PortakalliKek(){
        super();
    }
    public PortakalliKek(String name, int un, int seker, int yag, int sut, int kabartmaTozu, int yumurta, int portakal) {
        //Calling Base class constructor to assign base class properties
        super(name, un, seker, yag, sut, kabartmaTozu, yumurta);
        setPortakal(portakal);
       /* this.portakal = portakal;*/
    }

    public int getPortakal() {
        return portakal;
    }

    public void setPortakal(int portakal) {
        this.portakal = portakal;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "  Portakal miktarı(adet)   : " +getPortakal() + "\n";

        /* return "PortakalliKek{" +
                "portakal=" + portakal +
                "} " + super.toString();*/

        return str;
    }
}
