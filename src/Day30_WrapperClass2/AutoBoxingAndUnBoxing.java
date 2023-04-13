/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day30_WrapperClass2;

public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        System.out.println("Autoboxing and Unboxing in Java.");
        int i = 1234; //Primitive data type
        System.out.println("Primitive Type -> i = " + i);
        //Autoboxing  primitive ---> Wrapper type
        Integer i2 = i; //Autoboxing
        System.out.println("Class type -> i2 = " + i2);

        System.out.println("Unboxing...");
        int sayi = 0;
        sayi = i2; //Unboxing
        System.out.println("Primitive(unboxing) -> sayi = " + sayi);

        int sayi1 = 0;
        sayi1 = i2.intValue(); //Unboxing
        System.out.println("Primitive(unboxing) -> sayi2 = " + sayi1);

        float fltSayi = 0.0F;
        fltSayi = i2;
        fltSayi = i2.floatValue();
        System.out.println("i2 = " + fltSayi);
    }
}
