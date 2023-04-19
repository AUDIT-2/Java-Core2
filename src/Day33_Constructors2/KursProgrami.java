/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day33_Constructors2;

import java.util.Scanner;

public class KursProgrami {
    public static void main(String[] args) {
        Scanner veriGir = new Scanner(System.in);
        String kursAdi="";
        int kursKapasite = 0;

        Kurs kurs;

        System.out.print("Kursun adını giriniz : " );
        kursAdi = veriGir.nextLine();

        System.out.print("Kapsiteyi giriniz : ");
        kursKapasite = Integer.parseInt(veriGir.nextLine()) ;

        kurs = new Kurs(kursAdi,kursKapasite);
       // Kurs kurs = new Kurs("Core Java",3);

        System.out.println("kurs.getEmptyCapacity() = " + kurs.getEmptyCapacity());

        System.out.println("Kursa öğrenci eklemek için aşağıdaki bilgileri giriniz.");

        boolean devamMi = true;
        Ogrenci ogrenci;
        while (devamMi && kurs.emptyCapacity > 0){
            System.out.print("Öğrencinin adını giriniz      : ");
            String ogrAd = veriGir.nextLine();
            System.out.print("Öğrencinin numarasını giriniz : ");
            int ogrNumber = Integer.parseInt(veriGir.nextLine());

            ogrenci = new Ogrenci(ogrNumber,ogrAd);
            kurs.ogrenciEkle(ogrenci);
            System.out.print("Öğrenci eklemeye devam etmek istiyor musun(E/H)? ");
            if(veriGir.nextLine().equalsIgnoreCase("H")){
                break;
            }
        }
        System.out.println(kurs);
    }
}
