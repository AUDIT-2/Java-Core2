/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_Abstraction.Arac;

public class Sedan extends Arac { //Sedan is-a Arac
    boolean hareketEdebilir = false;
    public Sedan(int kapiSayisi, String marka, String renk) {
        super(kapiSayisi, marka, renk);
    }

    @Override
    protected void start() {
        if(isEmniyetKemeri()){
            System.out.println("Started successfully.");
            hareketEdebilir = true;
        }
    }

    @Override
    protected void stop() {
        System.out.println(getMarka() + " araç durdu.");
        this.hareketEdebilir = false;

    }

    @Override
    protected void move() {
        if (hareketEdebilir){
            System.out.println(getMarka() + " araç hareket etti.");
        } else System.out.println("Araç çalışmıyor. Hareket edemem.");
    }

    @Override
    protected void turnRight(int angle) {
        if(angle > 0 && angle < 120){
            System.out.println(angle + " derece sağa döndü.");
        }
    }

    @Override
    protected void turnLeft(int angle) {
        if(angle > 0 && angle < 120){
            System.out.println(angle + " derece sola döndü.");
        }
    }
    public void sedanMetod(){
        System.out.println("Ben sedan metoduyum.");
    }
}
