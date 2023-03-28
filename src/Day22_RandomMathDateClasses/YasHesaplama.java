/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class YasHesaplama {
    public static void ageCalculate(int yil, int ay, int gun){
        LocalDate bugun = LocalDate.now();
        LocalDate dogumTarihi = LocalDate.of(yil, ay, gun);
        Period myAge = Period.between(dogumTarihi,bugun);

        System.out.println("Yaşınız : " + myAge.getYears() + " yıl,"
                + myAge.getMonths() + " ay,"
                + myAge.getDays() + " gün.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz : ");
        int dogYil = sc.nextInt();

        System.out.print("Lütfen doğum ayınızı giriniz : ");
        int dogAy = sc.nextInt();

        System.out.print("Lütfen doğum gün bilgisini giriniz : ");
        int dogGun = sc.nextInt();

        ageCalculate(dogYil,dogAy,dogGun);
    }
}
