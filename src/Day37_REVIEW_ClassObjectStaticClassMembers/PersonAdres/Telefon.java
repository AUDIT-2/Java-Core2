/*
 * Copyright (c) 2023.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.PersonAdres;

public class Telefon {
    private int bolgeKodu;
    private int telefon;

    public Telefon(int bolgeKodu, int telefon) {
        /*this.bolgeKodu = bolgeKodu;
        this.telefon = telefon;*/
        setBolgeKodu(bolgeKodu);
        setTelefon(telefon);
    }

    public int getBolgeKodu() {
        return bolgeKodu;
    }

    public void setBolgeKodu(int bolgeKodu) {
        this.bolgeKodu = bolgeKodu;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
    public String getFullTelefon(){
        return "("+getBolgeKodu()+")" + getTelefon();
    }
}
