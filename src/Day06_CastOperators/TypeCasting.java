/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day06_CastOperators;

public class TypeCasting {
    public static void main(String[] args) {
        byte myByte = 127;
        short myShort = 15828;
        int myInt = 2146888888;
        long myLong = 1111323423567889012L;
        float myFloat = 11234455666234244423424424564566759999.67879999999999999999999999999999999999999999F;
        double myDouble = 12312312318947248921498125892.98379879837987;
        char harf = 'A';
        boolean isOn = false; //boolean veri tipi başka bir veri tipine cast edilemez.

        myDouble = myByte; // double is greater than byte--->  automatic casting int to double
        System.out.println("myDouble = " + myDouble);
        myDouble = myShort;
        System.out.println("myDouble = " + myDouble);
        myDouble = myInt;
        System.out.println("myDouble = " + myDouble);
        myDouble = myLong;
        System.out.println("myDouble = " + myDouble);
        myDouble = myFloat;
        System.out.println("myDouble = " + myDouble);

        System.out.println("myInt variable value is = " + myInt);
        System.out.println("myDouble variable value is = " + myDouble);

        System.out.println("harf = " + harf);
        myInt = harf;
        System.out.println("myInt = " + myInt); //'A' harfinin ASCII code tablosundaki integer sayı karşılığı olan 65 i yazdırır.

        // myInt = myDouble; error cannot assign larger size to smaller size
        // cannot be converted automatically by compiler
    }
}
