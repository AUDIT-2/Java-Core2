package Day31_ArrayList.Otopark;

import java.time.LocalDateTime;

public class ArabaNEW {
    String marka;
    String plateNumber;
    LocalDateTime enterDateTime;
    LocalDateTime exitDateTime;
    long kalisSure;

    public ArabaNEW() {

    }

    public ArabaNEW(String marka, String plateNumber) {
        this.marka = marka.toUpperCase();
        this.plateNumber = plateNumber.toUpperCase();
    }

    public void sureHesapla(){
        long saniye;
        long dakika = 0;
        long saat = 0;

        if (this.exitDateTime != null) {
            saniye = (this.enterDateTime.getSecond() - this.exitDateTime.getSecond());
            dakika = (this.enterDateTime.getMinute() - this.exitDateTime.getMinute()) + 125;
            saat = (this.enterDateTime.getHour() - this.exitDateTime.getHour()) * 60;
            this.kalisSure =  Math.abs(dakika) + Math.abs(saat); //dakika cinsinden
        }
    }
    @Override
    public String toString() {
        return  "Aracın Markası : " + marka + "\n" +
                "Plakası        : " + plateNumber + "\n" +
                "Giriş tarihi   : " + enterDateTime + "\n" +
                "Çıkış tarihi   : " + (exitDateTime == null ? "Araç otoparkta" : exitDateTime);
    }
}
