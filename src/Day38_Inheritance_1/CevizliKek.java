/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritance_1;

public class CevizliKek extends Kek{
    private int vanilya;
    private int ceviz;

    public CevizliKek(String name, int un, int seker, int yag, int sut, int kabartmaTozu, int yumurta, int vanilya, int ceviz) {
        //Calling Base class constructor to assign base class properties
        super(name, un, seker, yag, sut, kabartmaTozu, yumurta);

        setVanilya(vanilya);
        setCeviz(ceviz);
       /* this.vanilya = vanilya;
        this.ceviz = ceviz;*/
    }

    public int getVanilya() {
        return vanilya;
    }

    public void setVanilya(int vanilya) {
        this.vanilya = vanilya;
    }

    public int getCeviz() {
        return ceviz;
    }

    public void setCeviz(int ceviz) {
        this.ceviz = ceviz;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "  Ceviz miktarı(adet)      : " +getCeviz() + "\n";

      /*  return "CevizliKek{" +
                "vanilya=" + vanilya +
                ", ceviz=" + ceviz +
                "} " + super.toString();*/
        return str;
    }
}
