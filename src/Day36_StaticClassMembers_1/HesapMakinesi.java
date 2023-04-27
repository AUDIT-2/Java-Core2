/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

public class HesapMakinesi {
    public static double result;

    private HesapMakinesi(){//This constructor can not be accessed outside the class

    }
    public static double topla(int sayiA, int sayiB){
        result = sayiA + sayiB;
        return result;
    }
}
