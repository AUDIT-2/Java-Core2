/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day04_Variables2;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println("Concatenation ve aritmetik işlemler.");
        float elmaFiyati;
        float miktar;
        float toplamKDVsiz;
        float toplamKDVli;
        final float KDV_GIDA = 1.18F; //constant--- when initialize, later the value can not be changed.

        elmaFiyati = 50.0F;
        miktar = 2.0F;

        toplamKDVsiz = elmaFiyati * miktar;
        // toplamKDVli = elmaFiyati * miktar * kdvGida;

        toplamKDVli = toplamKDVsiz * KDV_GIDA;

        float toplamKDV;
        toplamKDV = toplamKDVli - toplamKDVsiz;

        System.out.println("Elmanın kilogram fiyatı = " + elmaFiyati);
        System.out.println("Alınan miktar(kilogram) = " + miktar);
        System.out.println("KDV siz toplam fiyat    = " + toplamKDVsiz);
        // System.out.println("Toplam KDV ............ = " + toplamKDV);
        System.out.println("Toplam KDV ............ = " + (toplamKDVli - toplamKDVsiz));

        System.out.println("KDV li toplam fiyat     = " + toplamKDVli);

    }
}
