/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day32_Constructors1;

public class Musteri {
    String adi;
    int hesapNo;
    String TCKimlikNo;
    long telefon;
    double bakiye;

    public Musteri(String adi, String TCKimlikNo, long telefon, double bakiye) {
        this.adi = adi;
        this.TCKimlikNo = TCKimlikNo;
        this.telefon = telefon;
        this.bakiye = bakiye;
    }

    public double getBakiye(){
        return bakiye;
    }
    public void showInfoListe(){
        System.out.print(hesapNo + " " + adi + " " + TCKimlikNo + " " + telefon + " " + bakiye);
        System.out.println();
    }
    public void showInfo(){
        System.out.println("***** Müşteri Bilgileri *****");
        System.out.println("Müşterinin adı            : " + adi);
        System.out.println("Müşterinin TC Kimlik no   : " + TCKimlikNo);
        System.out.println("Müşterinin telefonu       : " + telefon);
        System.out.println("Müşterinin hesap no       : " + hesapNo);
        System.out.println("Müşterinin hesap bakiyesi : " + bakiye);
    }

}
