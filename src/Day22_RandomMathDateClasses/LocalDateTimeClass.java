/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("tarihSaat = " + tarihSaat);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy - HH:mm:ss");
        System.out.println("dtf.format(tarihSaat) = " + dtf.format(tarihSaat));

        dtf = DateTimeFormatter.ofPattern("HH:mm:ss - dd-MMMM-yyyy");
        System.out.println("dtf.format(tarihSaat) = " + dtf.format(tarihSaat));

        dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println("dtf.format(tarihSaat) = " + dtf.format(tarihSaat));

        System.out.println("tarihSaat.getHour() = " + tarihSaat.getHour());
        System.out.println("tarihSaat.getMinute() = " + tarihSaat.getMinute());
        System.out.println("tarihSaat.getSecond() = " + tarihSaat.getSecond());

        dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("dtf.format(tarihSaat) = " + dtf.format(tarihSaat));
    }
}
