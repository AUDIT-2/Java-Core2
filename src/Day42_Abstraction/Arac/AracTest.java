/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_Abstraction.Arac;

import java.util.ArrayList;
import java.util.Arrays;

public class AracTest {
    //Parent class sub class ların referanslarını tutabiliği için Parent Class türünde bir ArrayList oluşturduk.
    //Dolayısıyla Parent class tan miras alan bütün sub classlar bu ArrayList e eklenebilir.
    static ArrayList<Arac> garaj = new ArrayList<>();

       /* ArrayList<Sedan>  sedanGaraj = new ArrayList<>();
        ArrayList<Kamyon>  kamyonGaraj = new ArrayList<>();*/

    public static void aracParket(Arac arac) {
        garaj.add(arac);
        System.out.println(arac.getMarka() + " marka araç parkedildi.");
        System.out.println("Garajda " + garaj.size() + " adet araç var.");
    }
    public static void aracListe(){
        //For ...each
        System.out.println("Garajda bulunan araçların listesi.");
        for (Arac eleman:garaj){
            eleman.printInfo();
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(4, "Mercedes", "Beyaz");
        sedan1.printInfo();

        sedan1.setEmniyetKemeri(true);
        sedan1.start();
        sedan1.move();
        sedan1.turnRight(45);
        sedan1.stop();
        sedan1.move();

        System.out.println();
        Kamyon kamyon1 = new Kamyon(2, "Dodge", "Kırmızı");
        kamyon1.printInfo();
        kamyon1.setEmniyetKemeri(false);
        kamyon1.start();
        kamyon1.move();

        aracParket(sedan1);
        aracParket(kamyon1);

        //Parent class has its subclasses references
        //Parent class türünde sub class oluşturabilirz.
        Arac kamyon2 = new Kamyon(2,"Ford","Siyah");
        Arac sedan2 = new Sedan(4,"Toyota","Mavi");

        aracParket(sedan2);
        aracParket(kamyon2);

        aracListe();

        System.out.println(sedan1.getClass().getName());
        System.out.println(sedan2.getClass().getName());

        sedan1.sedanMetod();//Instance Class type is Sedan.Casting is not needed.
        ((Sedan) sedan2).sedanMetod(); //Instance Class type is parent(Arac). In order to run Instance own method it has to be casted to subClass(Sedan).
    }
}
