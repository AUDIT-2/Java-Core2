/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day20_ClassesAndObjects;

public class Televizyon {
    String marka;
    String model;
    int ekranSize;
    int sesLevel = 5;
    int kanal = 1;
    boolean acikMi = false;

    public Televizyon(String marka, String model, int ekranSize){
        this.marka = marka;
        this.model = model;
        this.ekranSize = ekranSize;
    }
    public void tvAc(){
        acikMi = true;
        System.out.println(marka + " marka " + model + " model TV açıldı.");
    }
    public void tvKapat(){
        acikMi = false;
        System.out.println(marka + " marka " + model + " model TV kapatıldı.");
    }
    public void kanalDegistir(int kanal){
        if(acikMi && kanal >=1 && kanal <= 250){
            this.kanal = kanal;
            System.out.println("Televizyonun yayın yaptığı kanal : " + this.kanal);
        } else System.out.println("Televizyon kapalı ya da değiştirmek istediğiniz kanal uygun değil!");
    }
    public void sesYukselt(int sesLevel){
        if(acikMi && sesLevel >= 1 && sesLevel <= 30){
            this.sesLevel = sesLevel;
            System.out.println("TV'nin sesi : " + sesLevel);
        } else System.out.println("TV kapalı ya da ses seviyesi sınırlar içerisinde değil!");
    }

    public void bilgileriniYaz(){
        System.out.println("Televizyona ait bilgiler");
        System.out.println("------------------------");
        System.out.println("Markası   : " + marka);
        System.out.println("Modeli    : " + model);
        System.out.println("Ekran size: " + ekranSize + " inç");
        System.out.println("-------------------------");
    }
}
