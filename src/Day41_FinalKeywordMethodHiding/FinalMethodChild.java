/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeywordMethodHiding;

public class FinalMethodChild extends FinalMethodParent{

    //Declared as final in Parent Class therefore child classes can not override this method
   /* @Override
    public double kdvHesapla(double fiyat){
        return (fiyat * 0.08 + fiyat);
    }*/
    public static void main(String[] args) {
        FinalMethodChild obj = new FinalMethodChild();

        //obj.KDV_18 = 12; Error
        double kdvliFiyat =  obj.kdvHesapla(100);
        System.out.println("kdvliFiyat = " + kdvliFiyat);
    }
}
