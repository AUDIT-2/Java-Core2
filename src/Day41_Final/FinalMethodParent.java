/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_Final;

public class FinalMethodParent {
    final double KDV_18 = 0.18;

    //Can not be overridden
    public final double kdvHesapla(double fiyat){
        return (fiyat * KDV_18 + fiyat);
    }
}
