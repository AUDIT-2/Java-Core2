/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day20_ClassesAndObjects;

public class Student {
    //Data members-Instance(Örnek)-Nesne-Object
    String name;
    int okulNo;
    String sinif;

    //Class member-variable-field
    static String okulAdi = "Boot Flow Academy";

    //Constructor
    public Student(String name, int okulNo, String sinif){
        this.name = name;
        this.okulNo = okulNo;
        this.sinif = sinif;
    }
    //Constructor
    public Student(String name){
        this.name = name;
    }

    //Method
    public void derseGir(String ders){
        System.out.println("Benim adım : " + name);
        System.out.println(ders + " dersine giriyorum.");
    }

    //Method
    public void bilgileriniYaz(){
        System.out.println("Öğrenci bilgileri");
        System.out.println("-----------------------------------");
        System.out.println("Okulu         : " + okulAdi);
        System.out.println("Öğrenci Adı   : " + name);
        System.out.println("Öğrenci No    : " + okulNo);
        if (sinif != null){
            System.out.println("Öğrenci Sınıfı: " + sinif);
        }
        System.out.println("------------------------------------");
    }
}
