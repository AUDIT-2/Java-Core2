/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

public class HesapMakinesi {
    //Utility--Helper Class
    public static double result;

    private HesapMakinesi(){//This constructor can not be accessed outside the class
        //Private access olduğundan bu constructor ile instance oluşturulamaz.
        //Static metodlar olduğundn class ismi ile metodlar çağrılabilir.
    }
    public static double topla(int sayiA, int sayiB){
        result = sayiA + sayiB;
        return result;
    }
    public static double topla(int sayiA, int sayiB, int sayiC){
        result = sayiA + sayiB + sayiC;
        return result;
    }
    public static double topla(int... sayilar){//varArgs --> variable arguments--> değişen sayıda arguman
        for (int sayi:sayilar){
            result += sayi;
        }
        return result;
    }

}
