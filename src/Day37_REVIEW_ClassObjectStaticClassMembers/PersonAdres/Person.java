/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.PersonAdres;

public class Person {
    private String name;
   // private Adres evAdresi, okulAdresi, isAdresi;
    private Adres evAdresi;
    private Adres okulAdresi;
    private Adres isAdresi;

    private Telefon isTelefon;
    private Telefon cepTelefon;
    private Telefon evTelefon;
    private Telefon faxTelefon;

    public Person(String name, Adres evAdresi, Adres okulAdresi, Adres isAdresi) {
    /*    this.name = name;
        this.evAdresi = evAdresi;
        this.okulAdresi = okulAdresi;
        this.isAdresi = isAdresi;*/

        setName(name);
        setEvAdresi(evAdresi);
        setOkulAdresi(okulAdresi);
        setIsAdresi(isAdresi);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public Adres getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(Adres evAdresi) {
        this.evAdresi = evAdresi;
    }

    public Adres getOkulAdresi() {
        return okulAdresi;
    }

    public void setOkulAdresi(Adres okulAdresi) {
        this.okulAdresi = okulAdresi;
    }

    public Adres getIsAdresi() {
        return isAdresi;
    }

    public void setIsAdresi(Adres isAdresi) {
        this.isAdresi = isAdresi;
    }

    public Telefon getIsTelefon() {
        return isTelefon;
    }

    public void setIsTelefon(Telefon isTelefon) {
        this.isTelefon = isTelefon;
    }

    public Telefon getCepTelefon() {
        return cepTelefon;
    }

    public void setCepTelefon(Telefon cepTelefon) {
        this.cepTelefon = cepTelefon;
    }

    public Telefon getEvTelefon() {
        return evTelefon;
    }

    public void setEvTelefon(Telefon evTelefon) {
        this.evTelefon = evTelefon;
    }

    public Telefon getFaxTelefon() {
        return faxTelefon;
    }

    public void setFaxTelefon(Telefon faxTelefon) {
        this.faxTelefon = faxTelefon;
    }
    public String getPersonAdres(){
        String str = "";
        str +=       "Ev adresi     : " +getEvAdresi().getFullAdres() +"\n";
        str +=       "Okul adresi   : " +getOkulAdresi().getFullAdres() +"\n";
        str +=       "İş adresi     : " +getIsAdresi().getFullAdres() +"\n";

        return str;
    }

    @Override
    public String toString() {
        String str = "Adı           : " +getName() + "\n";
       /* str +=       "Ev adresi     : " +getEvAdresi() +"\n";
        str +=       "Okul adresi   : " +getOkulAdresi() +"\n";
        str +=       "İş adresi     : " +getIsAdresi() +"\n";*/
        str += getPersonAdres();

        if(getEvTelefon() !=null) str +=       "Ev telefon    : "  +getEvTelefon().getFullTelefon() +"\n";
        if(getIsTelefon() !=null) str +=       "İş telefon    : "  +getIsTelefon().getFullTelefon() +"\n";
        if(getCepTelefon() !=null) str +=      "Cep telefon   : "  +getCepTelefon().getFullTelefon() +"\n";
        if(getFaxTelefon() !=null)str +=       "FAX           : "  +getFaxTelefon().getFullTelefon() +"\n";
        str += "----------------------------------------------\n";
        return str;
    }
}
