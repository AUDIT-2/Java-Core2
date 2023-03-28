/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeClass {
    public static void main(String[] args) {
        LocalTime zaman = LocalTime.now();
        System.out.println("zaman = " + zaman);

        System.out.println("zaman.getHour() = " + zaman.getHour());
        System.out.println("zaman.getMinute() = " + zaman.getMinute());
        System.out.println("zaman.getSecond() = " + zaman.getSecond());
        System.out.println("zaman.getNano() = " + zaman.getNano());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss"); //
        System.out.println("dtf.format(zaman) = " + dtf.format(zaman));

        dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); //24 saat dilimi
        System.out.println("dtf.format(zaman) = " + dtf.format(zaman));

    }
}
