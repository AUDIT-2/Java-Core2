/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day06_CastOperators;

public class WideningCast {
    public static void main(String[] args){
        //Küçük bir veri tipinin kendisinden büyük bir veri tipine dönüştürülmesi nişlemine Widening" denir.
        //JAVA compiler(derleyicisi) bu işlemi otomatik yapar. Bu işleme aynı zamanda Automatic casting de denir.

        System.out.println("Widening Cast operation in Java.");
        int myInt = 9;
        double myDouble = myInt; //Automatic casting : int ---> double; Widening
        float myFloat;
        myFloat = myInt; //Automatic casting : int ---> float; Widening

        myFloat = 10.5f;
        System.out.println("My float : " + myFloat);

        myFloat = 10; //Automatic casting : int ---> float;
        System.out.println("My float : " + myFloat);

        myInt = 2_147_483_647;//Maximum integer value. JAVA'da sayıları code içerisinde okunaklı yapmak için _ alt-çizgi sembolü kullanılabilir.
        long myLong = 2_147_483_647_347_749_884L;
        myFloat = 2_147_483_647_347_749_884_332_423_53675353336666.92342342355345235452426666666666666666323f;
        myDouble = 2_147_483_647_347_749_884_332_63426464266348762387462387762576534762837468236347654.978468746873468273648723648723648723648347298347298379823579875984758967352165467234526472;
      // myDouble = 10.25;

        System.out.println("My integer : " + myInt);
        System.out.println("My double  : " + myDouble);
        System.out.println("My float   : " + myFloat);
    }
}
