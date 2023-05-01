/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers;

public class StaticHesapMakinesi {
    public static double sonuc;

    public static double getSonuc(){
        return sonuc;
    }

    public static double topla(int sayiA, int sayiB){
        System.out.println("Parametre olarak integer alan metod.");
        sonuc =  sayiA + sayiB;
        return sonuc;
    }

    public static double topla(double sayiA, double sayiB){
        System.out.println("Parametre olarak double alan metod.");
        sonuc =  sayiA + sayiB;
        return sonuc;
    }

    //VAR ARGS
    public static double topla(int... sayilar) {//Var args
        for(int sayi : sayilar){
            sonuc += sayi;
        }
        return sonuc;
    }

    public static double carp(int sayiA, int sayiB) {
        sonuc = sayiA * sayiB;
        return sonuc;
    }
}
