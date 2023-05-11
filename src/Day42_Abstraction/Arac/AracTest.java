/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day42_Abstraction.Arac;

import java.util.ArrayList;

public class AracTest {
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

        sedan1.setEmniyetKemeri(false);
        sedan1.start(true);
        sedan1.move();
        sedan1.turnRight(45);
        sedan1.stop();
        sedan1.move();

        System.out.println();
        Kamyon kamyon1 = new Kamyon(2, "Dodge", "Kırmızı");
        kamyon1.printInfo();

        aracParket(sedan1);
        aracParket(kamyon1);

        Arac kamyon2 = new Kamyon(2,"Ford","Siyah");
        Arac sedan2 = new Sedan(4,"Toyota","Mavi");

        aracParket(sedan2);
        aracParket(kamyon2);

        aracListe();

        System.out.println(sedan1.getClass());
        System.out.println(sedan2.getClass());

        sedan1.sedanMetod();
        ((Sedan) sedan2).sedanMetod(); //Instance is parent type. In order to run its method it has to be casted.
    }
}
