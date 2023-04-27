/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

public class HesapTest {
    public static void main(String[] args) {
        HesapMakinesi.topla(12,34);
        System.out.println("HesapMakinesi.result = " + HesapMakinesi.result);

       // HesapMakinesi hsp = new HesapMakinesi(); Cannot create an object

        HesapMakinesi.topla(2,3,5,6,71,12,45,678);
        System.out.println("HesapMakinesi.result = " + HesapMakinesi.result);

    }
}
