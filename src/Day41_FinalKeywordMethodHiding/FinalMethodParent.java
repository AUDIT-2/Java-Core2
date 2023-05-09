/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeywordMethodHiding;

public class FinalMethodParent {
    final double KDV_18 = 0.18;

    //Declared as final therefore child classes can not override this method
    //Can not be overridden
    public final double kdvHesapla(double fiyat){
        return (fiyat * KDV_18 + fiyat);
    }
}
