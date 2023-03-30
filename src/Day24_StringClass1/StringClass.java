/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day24_StringClass1;

public class StringClass {

    public static void main(String[] args) {
        System.out.println("String class in Java.");

        String str1 = "Apple"; //JVM bu nesnesyi Heap memory deki String pool da oluşturur.
        String str2 = "Apple"; //JVM bu nesne pool da var mı diye bakar varsa adresini bu değişkene atar.

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("(str1 == str2) = " + (str1 == str2));

        //(==) yapılan karşılaştırma heriki objeninde referans adresleri aynı mı? karşılaştırmasıdır.
        // Literal değer atama ile oluşturulan nesneler JVM tarafından String pool a eklendiğinden
        // pool da bulunan nesneye bir den birden fazla referans olabilir.
        // Dolayısıyla literal tanımlamada yapılan (==) karşılaştırması da yine değişkenlerin referans ettikleri nesnenin adresi üzerinden olacaktır.
        //Bu durumda str1 == str2 herikisi de pooldaki aynı nesneye referans ettiğinden sonuç 'true' olacaktır.

        //JVM heap memory de oluşturur.
        // New keyword ile oluşturulduğundan String pool a eklenmez.
        String str3 = new String("Apple");
        String str4 = new String("Apple");

        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);

        System.out.println("(str3 == str4) = " + (str3 == str4)); //Class tiplerde karşılaştırma referans adreslerine göre yapılır.

        System.out.println("(str3.equals(str4)) = " + (str3.equals(str4)));

        System.out.println("(str1 == str4) = " + (str1 == str4));
        System.out.println("(str1.equals(str4)) = " + (str1.equals(str4)));
    }
}
