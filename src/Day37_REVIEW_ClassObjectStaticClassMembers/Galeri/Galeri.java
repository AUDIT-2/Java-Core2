/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Galeri;

import Day36_StaticClassMembers_1.StaticAndNonStaticBlock;

import java.util.ArrayList;

public class Galeri {
    static String name;
    static String address;

    static ArrayList<Araba> arabalar = new ArrayList<>();

    static {
        name = "XYZ Halk Oto galerisi.";
        address = "Koşuyolu caddesi no: 234/12 Beşiktaş/Istanbul";

        Araba araba = new Araba("Toyota","Corolla","TYT-491234","06ABC4568");
        arabalar.add(araba);
        arabalar.add(new Araba("Honda","Civic","HND-491234","06BC3268"));
        arabalar.add(new Araba("Honda","Accord","HND-499235","24KBC3268"));
        arabalar.add(new Araba("Honda","Civic","HND-497239","20B3268"));
        arabalar.add(new Araba("Honda","City","HND-491221","06AC3268"));
        arabalar.add(new Araba("Toyota","Corolla","TYT-781234","06DR4568"));
        arabalar.add(new Araba("Honda","Jazz","HND-499034","35BC3268"));
        arabalar.add(new Araba("Mercedes","E500","MRC-441234","06Z3268"));
        arabalar.add(new Araba("Ford","Taunus","FRD-651234","71C3268"));
        arabalar.add(new Araba("Ford","Focus","FRD-654534","01CC8901"));
        arabalar.add(new Araba("Toyota","Avensis","TYT-361234","34BC458"));
        arabalar.add(new Araba("Toyota","City","TYT-981234","45DR234"));
        arabalar.add(new Araba("Volkswagen","Passat","WWW-552334","10AC3268"));
    }

    private Galeri(){

    }

    public static void showArabalar(){
        System.out.println("Galerimizdeki arabaların listesi.");
        System.out.println("--------------------------------");
        System.out.println("Toplam " + arabalar.size() + " adet araba var.");

        int srNo = 1;
        for(Araba araba :arabalar){
            System.out.println(srNo + "- " + araba);
            srNo++;
        }
    }
    public static void listArabalarByName(String name){
        int sayac = 0;
        int srNo = 1;
        for (Araba araba:arabalar){
            if(araba.getName().equalsIgnoreCase(name)){
                System.out.println(srNo + "- " + araba);
                sayac++;
                srNo++;
            }
        }
        if(sayac == 0){
            System.out.println("Galeride " + name + " isimli araba yok.");
        }else System.out.println(name + " isimli arabadan toplam : " + sayac + " adet var.");
    }

    public static void listArabalarByNameModel(String name, String model){
        int sayac = 0;
        int srNo = 1;

        for (Araba araba:arabalar){
            if(araba.getName().equalsIgnoreCase(name) && araba.getModel().equalsIgnoreCase(model)){
                System.out.println(srNo + "- " + araba);
                sayac++;
                srNo++;
            }
        }
        if(sayac == 0){
            System.out.println("Galeride " + name + " isimli ve " + model + " model araba yok.");
        }else System.out.println(name + "-" + model +  " isimli arabadan toplam : " + sayac + " adet var.");
    }

    public static int getArabaSayisi(){
        return arabalar.size();
    }
    public static void arabaEkle(Araba araba){
        arabalar.add(araba);
        System.out.println(araba.getName() + "-" + araba.getModel() + " marka-model araba Galeriye eklendi.");
    }
    public static void arabaSilVIN(String vin){
        int sayac = 0;
        for (Araba araba:arabalar){
            if(araba.getVIN().equalsIgnoreCase(vin)){
                sayac++;
                System.out.println("Aşağıdaki bilgilere sahip araba Galeri kayıtlarında mevcut.");
                System.out.println(araba);
                arabalar.remove(araba);
                System.out.println("Araba galeri kayıtlarından silindi!");
                break;
            }
        }
        if(sayac == 0) System.out.println(vin + " şase numaralı araç galiride yok.");
    }
    public static void arabaSilPlaka(String plaka){
        //HOMEWORK
    }

}
