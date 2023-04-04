/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day26_Arrays1;

public class PassingArrayToMethod {
    public static void diziyiYazListe(String[] dizi){
        System.out.println("Liste halinde yazdırıyorum.");
        System.out.println("---------------------------");
        for (String eleman:dizi){
            System.out.println(eleman);
        }
    }
    public static void diziyiYazListe(int[] dizi){
        System.out.println("Liste halinde yazdırıyorum.");
        System.out.println("---------------------------");
        for (int eleman:dizi){
            System.out.println(eleman);
        }
    }
    public static void diziyiYazListe(double[] dizi){
        System.out.println("Liste halinde yazdırıyorum.");
        System.out.println("---------------------------");
        for (double eleman:dizi){
            System.out.println(eleman);
        }
    }

    public static void diziyiYazListe(String[] dizi, boolean buyukHarf){
        System.out.println("Liste halinde yazdırıyorum.");
        System.out.println("---------------------------");
        for (String eleman:dizi){
            if(buyukHarf){
                System.out.println(eleman.toUpperCase());
            }else System.out.println(eleman);
        }
    }
    public static void diziyiYazListe(String[] dizi, String str){
        System.out.println("Liste halinde yazdırıyorum.");
        System.out.println("---------------------------");
        for (String eleman:dizi){
            if(eleman.equals(str)){
                System.out.println(eleman.toUpperCase());
            }else System.out.println(eleman);
        }
    }

    public static void main(String[] args) {
        String[] sehirler = {"Ankara","Edirne","Kayseri","Malatya"};
        int[] sayilar = {3,4,5,23,78,90};
        double[] dblSayilar = {2.4,5.67,23.75};

        diziyiYazListe(sehirler);
        diziyiYazListe(sayilar);
        diziyiYazListe(dblSayilar);

        diziyiYazListe(sehirler,true);
        diziyiYazListe(sehirler,"Edirne");

    }
}
