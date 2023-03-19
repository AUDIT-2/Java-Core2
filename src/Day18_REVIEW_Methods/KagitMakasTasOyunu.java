/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day18_REVIEW_Methods;

import java.util.Scanner;

public class KagitMakasTasOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oyuncuSecimi = "";
        String bilgisayarinSecimi = "";
        int rastgeleSayi = 0;
        rastgeleSayi = (int)(Math.random() * 3 + 1);

        System.out.println("Haydi Kağıt, Makas ve Taş oyunu oynayalım!");
        System.out.print("Seçiminizi yapınız (kagit, makas , tas) : ");
        oyuncuSecimi = scanner.nextLine();

        while (!oyuncuSecimi.equals("kagit") && !oyuncuSecimi.equals("makas") && !oyuncuSecimi.equals("tas")){
            System.out.println("Yanlış seçim yaptınız.");
            System.out.print("Seçiminizi yapınız (kagit, makas , tas) : ");
            oyuncuSecimi = scanner.nextLine();
        }

        switch (rastgeleSayi){
            case 1:
                bilgisayarinSecimi = "kagit";
                break;
            case 2:
                bilgisayarinSecimi = "makas";
                break;
            case 3:
                bilgisayarinSecimi = "tas";
                break;
        }
        System.out.println("Bilgiayarın seçtiği : " + bilgisayarinSecimi);

        if(oyuncuSecimi.equals(bilgisayarinSecimi)){ //String değerler == ile karşılaştırılmaz. Onun yerine .equals() metodu kullanılır.
            System.out.println("Berabere kaldınız.");
        } else if (oyuncuSecimi.equals("kagit")) {
            if(bilgisayarinSecimi.equals("makas")){
                System.out.println("Bilgisayar kazandı");
            } else System.out.println("Siz kazandınız.");

        }else if(oyuncuSecimi.equals("makas")){
            if (bilgisayarinSecimi.equals("tas")){
                System.out.println("Bilgisayar kazandı");
            } else System.out.println("Siz kazandınız.");
        } else if (oyuncuSecimi.equals("tas")) {
            if (bilgisayarinSecimi.equals("kagit")){
                System.out.println("Bilgisayar kazandı");
            } else System.out.println("Siz kazandınız.");
        }
    }
}
