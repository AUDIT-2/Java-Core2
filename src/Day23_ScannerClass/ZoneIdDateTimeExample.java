/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day23_ScannerClass;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZoneIdDateTimeExample {
    public static void cityDateTime(String name){
        ZoneId sehirSaatDilimi = ZoneId.of(name); //Parametre olarak gönderilen şehrin ZoneId sini bulur.
        ZonedDateTime sehirTarihSaat = ZonedDateTime.now(sehirSaatDilimi); //ZoneId ye göre şehrin tarih ve saat bilgisini oluşturur.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy - HH:mm:ss z"); //Formatlı olarak gösterim için
        //System.out.println(name + " --> " + dtf.format(sehirTarihSaat)); //Belirlenen formata göre Şehrin tarih ve saat bilgisini yazar.

        // printf metodu ile yazdırma
        System.out.printf("%35s : %s %n", name, dtf.format(sehirTarihSaat));
    }
    public static void cityDateTimeFark(String city1, String city2){
        ZoneId sehir1 = ZoneId.of(city1); //Parametre olarak gönderilen şehrin ZoneId sini bulur.
        ZonedDateTime sehir1TarihSaat = ZonedDateTime.now(sehir1); //ZoneId ye göre şehrin tarih ve saat bilgisini oluşturur.

        ZoneId sehir2 = ZoneId.of(city2);
        ZonedDateTime sehir2TarihSaat = ZonedDateTime.now(sehir2);

        Duration tarihSaatFark = Duration.between(sehir2TarihSaat.toLocalDateTime(),sehir1TarihSaat.toLocalDateTime());

        System.out.println(city1 + " ile " + city2 + " arasındaki tarih/saat farkı : " + tarihSaatFark.toHours());
    }
    public static void main(String[] args) {
        //Sistemde Mevcut şehirlerin tarih ve saat dilimlerini oluşturur..
        Set<String> zoneIdleri = ZoneId.getAvailableZoneIds();
        //For each... Listedeki Kıta/Şehirlerin zoneId lerini yazdırır.
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
        cityDateTime("America/Chicago");
        cityDateTime("Europe/Brussels");
        cityDateTime("Europe/Amsterdam");
        cityDateTime("CET"); //Avrupa merkezi saat dilimi

        System.out.println();
        cityDateTimeFark("Japan","Europe/Istanbul");
        cityDateTimeFark("Europe/London","Europe/Istanbul");
        cityDateTimeFark("Europe/Amsterdam","Europe/Istanbul");
        cityDateTimeFark("America/New_York","Europe/Istanbul");
        cityDateTimeFark("America/Chicago","Europe/Istanbul");
        cityDateTimeFark("Asia/Hong_Kong","Europe/Istanbul");
    }
}
