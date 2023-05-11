/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_Abstraction.Arac;

public abstract class Arac {
    //instance variables
   private int kapiSayisi;
   private String marka;
   private String renk;
   private boolean emniyetKemeri = false;

   //Subclasses must implement these methods.
   protected abstract void start(boolean emniyetKemeri);
   protected abstract void stop();
   protected abstract void move();
   protected abstract void turnRight(int angle);
   protected abstract void turnLeft(int angle);

    public Arac(int kapiSayisi, String marka, String renk) {
        this.kapiSayisi = kapiSayisi;
        this.marka = marka;
        this.renk = renk;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public boolean isEmniyetKemeri() {
        return emniyetKemeri;
    }

    public void setEmniyetKemeri(boolean emniyetKemeri) {
        this.emniyetKemeri = emniyetKemeri;
    }

    protected void printInfo(){
        System.out.println("Marka       : " + getMarka());
        System.out.println("Renk        : " + getRenk());
        System.out.println("Kapı sayısı : " + getKapiSayisi());
    }
}
