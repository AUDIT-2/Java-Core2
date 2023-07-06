/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day18_REVIEW_Methods;

import java.util.Scanner;

public class KelimeBulmaOyunu {
    public static void oyun(){
        Scanner kelimeGir = new Scanner(System.in);
        String kelime = "";
        String tahminKelime = "";

        int rastgeleKelime = (int)(Math.random() * 5 + 1); // 1 - 5 arası rastgele bir tamsayı

        switch (rastgeleKelime){
            case 1:
                kelime = "armut";
                break;
            case 2:
                kelime = "elma";
                break;
            case 3:
                kelime = "kiraz";
                break;
            case 4:
                kelime = "kavun";
                break;
            case 5:
                kelime = "erik";
                break;
        }
        //System.out.println("Bilgisayarın seçtiği kelime = " + kelime);
        int tahminSayisi = 0;
        while (true){
            tahminSayisi++;
            System.out.print("Kelime tahmininiz : ");
            tahminKelime = kelimeGir.nextLine();

            if(kelime.equals(tahminKelime)){ //String karşılaştırma işlemlerinde "==" kullanılmaz. onun yerine .equals() metodu kullanılır
                System.out.println("Tebrikler doğru bildiniz");
                System.out.println(tahminSayisi + " tahminde bildiniz.");
                break;
            }else System.out.println("Kelimeyi doğru tahmin edemediniz!");
            if(tahminKelime.equals("bitir")) {
                System.out.println("Kelime tahmin oyununu oynadığınız için teşekkürler.");
                System.out.println("Programdan çıkılıyor.");
                break;
            }
        }
    }
    public static void menu(){
        System.out.println("---------Kelime Tahmin Oyunu-----------");
        System.out.println(".......................................");
        System.out.println("........... KELİME LİSTESİ.............");
        System.out.println(".. armut, elma , kiraz , kavun, erik ..");
        System.out.println(".......................................");
        System.out.println();
    }

    public static void main(String[] args) {
        menu();
        oyun();
    }
}
