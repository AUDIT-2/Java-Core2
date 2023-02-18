/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day06_CastOperators;

public class NarrowingCast {
    public static void main(String[] args) {
        System.out.println("Narrowing Cast operation in Java.");

        //Büyük bir veri tipinin kendisinden küçük bir veri tipine dönüştürülmesi(cast) işlemine "Narrowing" denir.
        //Narrowing tip dönüşümünde veri kaybı yaşanabilir.

        double myDouble = 10;
        System.out.println("My double = " + myDouble);
        int myInt = 1;
        System.out.println("My Int = " + myInt);

        myInt =(int)myDouble; //() casting operatoru. Double veri tipi (int) cast işlemi ile int tipinine dönüştürüldü.
        System.out.println("My Int = " + myInt);

        myDouble = 214748364.85798579385787557d;
        System.out.println("My double = " + myDouble);

        myInt = (int)myDouble; //Double veri tipi (int) cast işlemi ile int tipinine dönüştürüldü.
        System.out.println("My Int = " + myInt);

        int vize1;
        int vize2;
        int finalNotu;
        double gecmeNotu;

        vize1 = 45;
        vize2 = 52;
        finalNotu = 78;

        double vizeOrtalamasi =(double) (vize1 + vize2) / 2;
        gecmeNotu = (vizeOrtalamasi + finalNotu) / 2;
        System.out.println("Geçme notu  =  " + gecmeNotu);

        gecmeNotu =((double) (vize1 + vize2) / 2 + finalNotu) / 2;
        System.out.println("Geçme notu  =  " + gecmeNotu);

        System.out.println("vize1 / 2 : " + vize1 / 2); //Bir tamsayının bir tamsayıya bölümü bir tam sayıdır.
        System.out.println("vize1 / 2.0 : " + vize1 / 2.0); //Bir tamsayının bir double/float bölümü bir double/float sayıdır.
        System.out.println("vize1 / 2 (double) : " + (double)vize1 / 2); //Bir tamsayının bir double/float bölümü bir double/float sayıdır.
    }
}
