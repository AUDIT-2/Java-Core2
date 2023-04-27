/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

public class ArabaTest {
    public static void main(String[] args) {
        for (Araba araba: Araba.arabalar){
            System.out.println(araba.getName() + "-" + araba.getModel());
        }
        System.out.println("-------------------------------------");

        Araba araba = new Araba("Mercedes","E350D");
        Araba.arabalar.add(araba);

        for (Araba araba1: Araba.arabalar){
            System.out.println(araba1.getName() + "-" + araba1.getModel());
        }
    }
}
