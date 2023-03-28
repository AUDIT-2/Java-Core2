/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day23_ScannerClass;

import java.time.LocalDate;
import java.util.Scanner;

public class SiparisKargoTarihi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate siparisTarihi;
        int yil;
        int ay;
        int gun;
        int teslimatHaftaSure = 2;
        int teslimatGunSure = 5;

       /* System.out.print("Sipariş yıl bilgisini giriniz : ");
        yil = input.nextInt();
        System.out.print("Sipariş ay bilgisini giriniz : ");
        ay = input.nextInt();
        System.out.print("Sipariş gün bilgisini giriniz : ");
        gun = input.nextInt();*/

        System.out.print("Sipariş tarihini yyyy mm dd formatta giriniz: ");
        yil = input.nextInt();
        ay = input.nextInt();
        gun = input.nextInt();

     //  siparisTarihi = LocalDate.now();//Sipariş tarihi bugünse

        siparisTarihi = LocalDate.of(yil,ay,gun);
        System.out.println("siparisTarihi = " + siparisTarihi);

        System.out.println("Siparişinizin teslimat tarihi(hafta) : "
                + siparisTarihi.plusWeeks(teslimatHaftaSure));

        System.out.println("Siparişinizin teslimat tarihi(gun) : "
                + siparisTarihi.plusDays(teslimatGunSure));
    }
}
