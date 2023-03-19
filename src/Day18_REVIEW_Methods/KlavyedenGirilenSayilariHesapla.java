/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day18_REVIEW_Methods;

import java.util.Scanner;

public class KlavyedenGirilenSayilariHesapla {
    public static double cokSayiTopla(){
        Scanner klavye =  new Scanner(System.in);
        double toplam = 0;
        int sayi = 1;
        int araToplamSayac = 1;

        while (sayi > 0){
            System.out.print("Klavyeden pozitif bir tam sayı giriniz : ");
            sayi = klavye.nextInt();
            toplam += sayi; //toplam = toplam + sayi
            if(araToplamSayac % 5 == 0){
                System.out.println("Ara toplam = " + toplam);
            }
            araToplamSayac++;
        }
        return toplam;
    }

    public static void main(String[] args) {
        System.out.println("Klavyeden girilen pozitif sayıların toplamını hesaplayan program");
        System.out.println("Klavyeden 0 veya negatif bir sayı girildiğinde programı sonlandırabilirsiniz");

        double anaToplam = cokSayiTopla();
        System.out.println("---------------");
        System.out.println("Klavyeden girilen sayıların toplamı = " + anaToplam);
    }
}
