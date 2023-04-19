/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day33_Constructors2;

import java.util.ArrayList;

public class Kurs {
    String name;
    int maxCapacity;
    int emptyCapacity;
    ArrayList<Ogrenci> ogrenciler;

    public Kurs(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.ogrenciler = new ArrayList<>();
        getEmptyCapacity();
    }
    public int getEmptyCapacity(){
        return emptyCapacity = maxCapacity - ogrenciler.size();
    }

    public void ogrenciEkle(Ogrenci ogrenci){
        if(emptyCapacity > 0){
            ogrenciler.add(ogrenci);
            getEmptyCapacity();
        } else System.out.println("Kurs kapasitesi dolu olduğundan öğrenci eklenemedi!");
    }

    public String ogrenciListe(){
        String str = "";


        for (Ogrenci ogrenci :ogrenciler){
           /* str += ogrenci.number + "\t\t" + ogrenci.name + "\t\t" + ogrenci.city + "\t\t" + ogrenci.country + "\n";*/
            str += ogrenci.ogrenciListeFormatted();
        }
        return str;
    }

    public String toString(){
        String str = "";
        str += "Kursun ad    : " + name + "\n";
        str += "Max kapasite : " + maxCapacity + "\n";
        str += "Boş kapasite : " + emptyCapacity + "\n\n";
        str += "No         Ad              Şehir                     Ülke\n";
        str += "---------  --------------- ------------------------  ------------------------ \n";
        str += ogrenciListe();
        return  str;
    }
}
