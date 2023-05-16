/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.CompileTimePolyMorphism;

public class CompileTimePolyTest {
    public static void main(String[] args) {
    //Static polymorphism veya CompileTime polymorphism
        //
        String str;
        str = CompileTimePoly.topla("Ahmet", "Falanca");
        System.out.println(str);

        int toplam = CompileTimePoly.topla(12,5);
        System.out.println("Toplam = " + toplam);

        System.out.println("Toplam = " + CompileTimePoly.topla(2.5, 5.6));

    }
}
