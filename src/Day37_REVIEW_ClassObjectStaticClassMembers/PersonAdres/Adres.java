/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.PersonAdres;

public class Adres {
    private String cadde;
    private String ilce;
    private String il;

    public Adres(String cadde, String ilce, String il) {
        setCadde(cadde);
        setIlce(ilce);
        setIl(il);
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il.trim().toUpperCase();
    }

    public String getFullAdres(){
        return getCadde() + " " + getIlce() + "/" + getIl();
    }
    @Override
    public String toString() {
        String str = " \n   Cadde      : " + getCadde() + "\n";
        str +=       "   İlçe       : " + getIlce() + "\n";
        str +=       "   İl         : " + getIl() +"\n";
        return str;
    }
}
