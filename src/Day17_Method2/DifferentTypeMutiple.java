/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day17_Method2;

public class DifferentTypeMutiple {
    public static void main(String[] args) {
        hesaplama(12,5,"Toplama işlemi");
        String aciklama = "Toplama-2 işlemi";

        hesaplama(56,12,aciklama);

        System.out.println(hesaplamaReturn(45,15));

        int toplam = hesaplamaReturn(10,25);
        System.out.println(toplam);

        toplam = hesaplamaReturn(10,hesaplamaReturn(10,35));
        System.out.println(toplam);

        hesaplama(15,hesaplamaReturn(12,45),"Return metod işlemi");
    }

    public static void hesaplama(int aSayisi, int bSayisi, String aciklama){
        int sonuc;
        sonuc = aSayisi + bSayisi;
        System.out.println(aciklama + " sonuç = " + sonuc);
    }

    public static int hesaplamaReturn(int number1, int number2){
       // System.out.println("Return eden metod çalıştı");
        int sonuc;
        sonuc = number1 + number2;
        return  sonuc;
    }
}
