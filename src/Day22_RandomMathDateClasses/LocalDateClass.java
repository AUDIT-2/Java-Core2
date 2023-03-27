/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();

        System.out.println("tarih = " + tarih);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("dtf.format(tarih) = " + dtf.format(tarih));

        dtf = DateTimeFormatter.ofPattern("MMMM");
        System.out.println("dtf.format(tarih) = " + dtf.format(tarih));

        dtf = DateTimeFormatter.ofPattern("dd");
        System.out.println("dtf.format(tarih) = " + dtf.format(tarih));

        dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println("dtf.format(tarih) = " + dtf.format(tarih));

        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getEra() = " + tarih.getEra());
        System.out.println("tarih.lengthOfMonth() = " + tarih.lengthOfMonth());

    }
}
