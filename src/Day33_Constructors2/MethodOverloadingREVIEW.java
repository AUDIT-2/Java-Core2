/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day33_Constructors2;

public class MethodOverloadingREVIEW {

    public static int ikiSayiTopla(int sayiA, int sayiB){
        return sayiA + sayiB;
    }
    public static int ucSayiTopla(int sayiA, int sayiB, int sayiC){
        return sayiA + sayiB + sayiC;
    }
    public static double ucSayiDoubleTopla(int sayiA, int sayiB, double sayiC){
        return sayiA + sayiB + sayiC;
    }

    //Method overloading
    public static int topla(int sayiA, int sayiB){
        return sayiA + sayiB;
    }
    public static int topla(int sayiA, int sayiB, int sayiC){
        return sayiA + sayiB + sayiC;
    }
    public static int topla(int sayiA, int sayiB, int sayiC, int sayiD){
        System.out.println("4 parametreli metod çağrıldı.");
        return sayiA + sayiB + sayiC + sayiD;
    }

    public static int topla(int sayiA, int sayiB, int sayiC, int sayiD, int sayiE){
        System.out.println("5 parametreli metod çağrıldı.");
        return topla(sayiA,sayiB,sayiC,sayiD) + sayiE; //Method chaining.
    }
    public static void main(String[] args) {
        System.out.println("ikiSayiTopla(5,6) = " + ikiSayiTopla(5, 6));
        System.out.println("ucSayiTopla(3,56,7) = " + ucSayiTopla(3, 56, 7));
        System.out.println("ucSayiDoubleTopla(12,45,6.7) = " + ucSayiDoubleTopla(12, 45, 6.7));

        System.out.println("topla(5,4) = " + topla(5, 4));
        System.out.println("topla(12,34,5) = " + topla(12, 34, 5));
        System.out.println("topla(12,56,7,3) = " + topla(12, 56, 7, 3));
        System.out.println("topla(1,1,1,1,1) = " + topla(1, 1, 1, 1, 1));
    }
}
