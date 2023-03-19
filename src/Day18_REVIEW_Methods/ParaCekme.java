/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day18_REVIEW_Methods;

import java.util.Scanner;

public class ParaCekme {
    public static void paraCek(int cekilecekMiktar){
        int numberOf200 = 0;
        int numberOf100 = 0;
        int numberOf50 = 0;;
        int numberOf20 = 0;;
        int numberOf10 = 0;;
        int numberOf5 = 0;;

        numberOf200 = cekilecekMiktar / 200;       //Çekilecek para miktarı içerisinde kaç adet 200TL var.
        cekilecekMiktar = cekilecekMiktar % 200;   //Çekilecek para miktarından 200TL leri çıkarıyoruz.

        numberOf100 = cekilecekMiktar / 100;       //Çekilecek para miktarı içerisinde kaç adet 100TL var.
        cekilecekMiktar = cekilecekMiktar % 100;    //Çekilecek para miktarından 100TL leri çıkarıyoruz.

        numberOf50 = cekilecekMiktar / 50;
        cekilecekMiktar = cekilecekMiktar % 50;

        numberOf20 = cekilecekMiktar / 20;
        cekilecekMiktar = cekilecekMiktar % 20;

        numberOf10 = cekilecekMiktar / 10;
        cekilecekMiktar = cekilecekMiktar % 10;

        numberOf5 = cekilecekMiktar / 5;
        cekilecekMiktar = cekilecekMiktar % 5;

        System.out.println("numberOf200 = " + numberOf200);
        System.out.println("numberOf100 = " + numberOf100);
        System.out.println("numberOf50 = " + numberOf50);
        System.out.println("numberOf20 = " + numberOf20);
        System.out.println("numberOf10 = " + numberOf10);
        System.out.println("numberOf5 = " + numberOf5);

        System.out.println("Ödenmesi gereken kalan para miktarı = " + cekilecekMiktar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Falanca Bankaya hoş geldiniz.");
        System.out.print("Çekeceğiniz para miktarını giriniz : ");
        int paraMiktar = sc.nextInt();

        paraCek(paraMiktar); //metodu çağırıyoruz.
    }
}
