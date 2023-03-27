/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.util.Random;

public class RandomSayi {
    public static void rasgeleSayiUret(int altSinir,int ustSinir, int adet){
        //Ust sınır dahil
        Random rastgele = new Random();
        int sonuc = 0;
        for (int i = 0; i < adet; i++) {
           sonuc = rastgele.nextInt(ustSinir + 1 - altSinir) + altSinir;
            System.out.println("sonuc(metod) = " + sonuc);
        }
    }

    public static void main(String[] args) {
        Random rastgeleSayi = new Random();

        System.out.println("rastgeleSayi.nextInt() = " + rastgeleSayi.nextInt()); //-2^31 -- +2'31 - 1
        System.out.println("rastgeleSayi.nextInt(10) = " + rastgeleSayi.nextInt(10)); //0 dahil 10 hariç 0-10 arası tamsayı üretir.
        System.out.println("rastgeleSayi.nextDouble() = " + rastgeleSayi.nextDouble());
        System.out.println("rastgeleSayi.nextBoolean() = " + rastgeleSayi.nextBoolean());

        int baslangic = 1;
        int bitis = 11; // bitis değeri dahil değil

        int sonuc = rastgeleSayi.nextInt(bitis-baslangic) + baslangic; // baslangic ile bitis  arasında baslangic değerleri dahil  bitis değeri hariç bu aralıkta sayı ütetir

        System.out.println("sonuc = " + sonuc);

      /*  while (sonuc != 10){
            sonuc = rastgeleSayi.nextInt(bitis-baslangic) + baslangic;
            System.out.println("sonuc = " + sonuc);
        }
*/
      rasgeleSayiUret(10,15,5);
    }
}
