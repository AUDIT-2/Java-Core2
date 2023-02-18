/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day06_CastOperators;

public class TypePromotion2 {

    public static void main(String[] args) {

        //Bir işlemde işleme tabi tutulan(operand) long, float veya double ise, tüm işlem sırasıyla long, float veya double olarak yükseltilir.
        //Promote edilir.

        byte myByte = 42;
        char myChar = 'a';
        short myShort = 1024;
        int myInt = 50000;
        long myLong = 31514162837468746L;
        float myFloat = 5.4f;
        double myDouble = 0.25353;

        //Expression--işlem
        //(myFloat * myByte) ---> Otomatik olarak bu işlem sonucu float a promote edilir.
        //(myDouble * myShort) ---> Otomatik olarak bu işlem sonucu double a promote edilir.
        double result = (myFloat * myByte) + (myInt / myChar) + (myDouble * myShort);

        System.out.println("result = " + result);
        int resultInt = (int) result;
        System.out.println("resultInt = " + resultInt);

        myInt = 25;
        myFloat = 45.25f;
        myDouble = 15.75;
        myLong = 746782678378L;

        float resultFloat = myFloat + myInt; //Otomatik olarak bu işlem sonucu float a promote edilir.
        long resultLong = myLong + myInt; //Otomatik olarak bu işlem sonucu long a promote edilir.
        double resultDouble = myDouble + myFloat; //Otomatik olarak bu işlem sonucu double a promote edilir.

        System.out.println("resultFloat = " + resultFloat);
        System.out.println("resultLong = " + resultLong);
        System.out.println("resultDouble = " + resultDouble);
    }
}
