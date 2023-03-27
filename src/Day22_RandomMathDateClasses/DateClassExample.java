/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.util.Date;

public class DateClassExample {
    public static void main(String[] args) {
        Date tarih = new Date();
        long time1 = tarih.getTime(); // 1 Ocak 1970 saat 00:00 dan günümüze kadar geçen süre milisaniye cinsinden.
        System.out.println("time1 = " + time1);

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear()); //Senenin kaçıncı günü
        System.out.println("tarih.getMonth() = " + tarih.getMonth()); // 0 - 11
        System.out.println("tarih.getDay() = " + tarih.getDay()); //Haftanın kacıncı günü
        System.out.println("tarih.getDate() = " + tarih.getDate()); //Ayın günü

        Date tarih1 = new Date(2022,4,25);

        System.out.println("tarih1.equals(tarih) = " + tarih1.equals(tarih));
        System.out.println("tarih1.after(tarih) = " + tarih1.after(tarih));
        System.out.println("tarih1.before(tarih) = " + tarih1.before(tarih));
    }
}
