/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day23_ScannerClass;

import java.util.Scanner;

public class ScannerClassExample {
    public static double daireAlanHesapla(double yariCap){
        double alan = yariCap * yariCap * Math.PI;
        return alan;
    }
    public static double cevreHesapla(double yariCap){
        return 2 * Math.PI * yariCap; //Dairenin çevresi
    }

    public static void main(String[] args) {
        double alanHesabi = daireAlanHesapla(2.5);
        System.out.println("alanHesabi = " + alanHesabi);

        System.out.println("Dairenin çevresi : " + cevreHesapla(2.5));

        Scanner input = new Scanner(System.in);
        System.out.print("Alanını ve çevresini hesaplamak için yarıçap değerini giriniz: ");
        double yariCap = input.nextDouble();
        double daireAlani = daireAlanHesapla(yariCap);
        double cevreHesabi = cevreHesapla(yariCap);

        System.out.println("Yarıçapı : " + yariCap + " olan dairenin alanı   = " + daireAlani);
        System.out.println("Yarıçapı : " + yariCap + " olan dairenin çevresi = " + cevreHesabi);

    }
}
