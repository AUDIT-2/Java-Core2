/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day04_Variables2;

public class StringExample {
    public static void main(String[] args) {
        //  int vize1, vize2, finalNotu;
        int vize1;
        int vize2;
        int finalNotu;
        float sinifGecmeNotu; //CamelCase isimlendirme standardı
        boolean gectiMi;
        char subeAdi = 'B';

        String ogrenciAd; //Metinsel-text türü verileri saklayabileceğimiz veri tip

        ogrenciAd = "Ayşe Smith";

        vize1 = 100;
        vize2 = 95;
        finalNotu = 85;

        gectiMi = true; //true or false
        sinifGecmeNotu = (vize1 + vize2 + finalNotu) / 3.0F;

        System.out.println("Öğrenci adı       : " + ogrenciAd);
        System.out.println("Öğrencinin şubesi : " + subeAdi);
        System.out.println("1.Vize notu       : " + vize1);
        System.out.println("2.Vize notu       : " + vize2);
        System.out.println("Final Notu        : " + finalNotu);
        System.out.println("----------------------------");
        System.out.println("Sınıf geçme notu ....: " + sinifGecmeNotu);
        System.out.println("Sınıfı geçti mi?     : " + gectiMi);

    }
}


