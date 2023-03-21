/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day19_MethodOverloading;

import java.time.LocalDate;

public class LocalDateTarihHesapla {
    public static int ageCalculate(int year){
        //Java da tarih ile ilgili işlemler yapabileceğimiz Class lardan bir tanesi
        LocalDate bugun = LocalDate.now(); //Şuanki tarihi ve ilgili verileri oluşturur.
        System.out.println(bugun);
        int buYil = bugun.getYear(); //Şuanki tarihten yıl bilgisini almak için kullanılan metod .getYear()
        System.out.println("buYil = " + buYil);

        return buYil - year;
    }
    public static void main(String[] args) {
        System.out.println("ageCalculate(1976) = " + ageCalculate(1976));
        System.out.println("ageCalculate(2000) = " + ageCalculate(2000));
    }
}
