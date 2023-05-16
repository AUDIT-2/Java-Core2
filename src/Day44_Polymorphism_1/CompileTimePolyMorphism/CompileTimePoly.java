/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day44_Polymorphism_1.CompileTimePolyMorphism;

public class CompileTimePoly {
    /*public int toplaInt(int sayiA, int sayiB){
        return sayiA + sayiB;
    }

    public double toplaDbl(double sayiA, double sayiB){
        return sayiA + sayiB;
    }*/

    //Static polymorphism veya CompileTime polymorphism
    //Method overloading
    //Depends on the argument passing to method, compiler decide which methods to use.
    public static int topla(int sayiA, int sayiB){
        return sayiA + sayiB;
    }
    public static double topla(double sayiA, double sayiB){
        return sayiA + sayiB;
    }

    public static double topla(int sayiA, double sayiB){
        return sayiA + sayiB;
    }
    public static double topla(double sayiA, int sayiB){
        return sayiA + sayiB;
    }

    public static String topla(String strA, String strB){
        return strA + "-" + strB;
    }
}
