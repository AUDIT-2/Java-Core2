/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassFormatter {
    public static void main(String[] args) {
        Date tarih = new Date();

        System.out.println("tarih = " + tarih);
        SimpleDateFormat formatYazdir = new SimpleDateFormat("yyyy");
        System.out.println("format.format(tarih)-YIL = " + formatYazdir.format(tarih));

        formatYazdir = new SimpleDateFormat("MM");
        System.out.println("formatYazdir.format(tarih) = " + formatYazdir.format(tarih));
        formatYazdir = new SimpleDateFormat("MMM");
        System.out.println("formatYazdir.format(tarih) = " + formatYazdir.format(tarih));
        formatYazdir = new SimpleDateFormat("MMMM");
        System.out.println("formatYazdir.format(tarih)--Ay = " + formatYazdir.format(tarih));

        formatYazdir = new SimpleDateFormat("dd");
        System.out.println("formatYazdir.format(tarih)--Gün = " + formatYazdir.format(tarih));

        formatYazdir = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println("formatYazdir.format(tarih) = " + formatYazdir.format(tarih));
        formatYazdir = new SimpleDateFormat("dd/MMMM/yyyy");
        System.out.println("formatYazdir.format(tarih) = " + formatYazdir.format(tarih));

        formatYazdir = new SimpleDateFormat("hh:mm:ss");
        System.out.println("formatYazdir.format(tarih) = " + formatYazdir.format(tarih));
        formatYazdir = new SimpleDateFormat("HH:mm:ss");
        System.out.println("formatYazdir.format(tarih) = " + formatYazdir.format(tarih));

        formatYazdir = new SimpleDateFormat("MMMM-yyyy - HH:mm:ss");
        System.out.println("formatYazdir.format(tarih) = " + formatYazdir.format(tarih));
    }
}
