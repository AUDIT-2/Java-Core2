/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day23_ScannerClass;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZoneIdDateTimeExample {
    public static void cityDateTime(String name){
        ZoneId sehirSaatDilimi = ZoneId.of(name);
        ZonedDateTime sehirTarihSaat = ZonedDateTime.now(sehirSaatDilimi);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy - HH:mm:ss z");
        System.out.println(name + " --> " + dtf.format(sehirTarihSaat));
    }
    public static void main(String[] args) {
        //Mevcut şehirlere göre saat dilimlerini listeler.
        Set<String> zoneIdleri = ZoneId.getAvailableZoneIds();
        for (String zoneId : zoneIdleri){
            System.out.println(zoneId);
        }

        cityDateTime("Japan");
        cityDateTime("Europe/Berlin");
        cityDateTime("Europe/London");
        cityDateTime("Asia/Hong_Kong");
        cityDateTime("Europe/Istanbul");
        cityDateTime("America/New_York");
        cityDateTime("America/Los_Angeles");
    }
}
