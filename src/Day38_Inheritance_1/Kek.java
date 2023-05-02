/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritance_1;

public class Kek {
    private String name;
    private int un;
    private int seker;
    private int yag;
    private int sut;
    private int kabartmaTozu;
    private int yumurta;
    private boolean karistiMi = false;

    public Kek(){

    }
    public Kek(String name, int un, int seker, int yag, int sut, int kabartmaTozu, int yumurta) {
        //Calling setter methods to assign initial values of data members of class
        setName(name);
        setUn(un);
        setSeker(seker);
        setYag(yag);
        setSut(sut);
        setKabartmaTozu(kabartmaTozu);
        setYag(yumurta);

  /*      this.name = name;
        this.un = un;
        this.seker = seker;
        this.yag = yag;
        this.sut = sut;
        this.kabartmaTozu = kabartmaTozu;
        this.yumurta = yumurta;*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public int getUn() {
        return un;
    }

    public void setUn(int un) {
        this.un = un;
    }

    public int getSeker() {
        return seker;
    }

    public void setSeker(int seker) {
        this.seker = seker;
    }

    public int getYag() {
        return yag;
    }

    public void setYag(int yag) {
        this.yag = yag;
    }

    public int getSut() {
        return sut;
    }

    public void setSut(int sut) {
        this.sut = sut;
    }

    public int getKabartmaTozu() {
        return kabartmaTozu;
    }

    public void setKabartmaTozu(int kabartmaTozu) {
        this.kabartmaTozu = kabartmaTozu;
    }

    public int getYumurta() {
        return yumurta;
    }

    public void setYumurta(int yumurta) {
        this.yumurta = yumurta;
    }

    public boolean isKaristiMi() {
        return karistiMi;
    }

    public void setKaristiMi(boolean karistiMi) {
        this.karistiMi = karistiMi;
    }

    public void karistir(int dakika){
        System.out.println("Kek karışımı " + dakika + " karıştırılıyor.");
        setKaristiMi(true);
    }
    @Override
    public String toString() {
        String str = "";
        str += "Kekin adı                  : " +getName() + "\n";
        str += "  Un miktarı(gr)           : " +getUn() + "\n";
        str += "  Şeker miktarı(gr)        : " +getSeker() + "\n";
        str += "  Yağ miktarı(gr)          : " +getYag() + "\n";
        str += "  Yumurta miktarı(adet)    : " +getYumurta() + "\n";
        str += "  Süt miktarı(gr)          : " +getSut() + "\n";
        str += "  Kabartma T. miktarı(pkt) : " +getYumurta() + "\n";

        return str;
        /*return "Kek{" +
                "name='" + name + '\'' +
                ", un=" + un +
                ", seker=" + seker +
                ", yag=" + yag +
                ", sut=" + sut +
                ", kabartmaTozu=" + kabartmaTozu +
                ", yumurta=" + yumurta +
                '}';*/
    }
}
