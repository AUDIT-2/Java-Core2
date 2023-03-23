/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day21_MemoryGarbageCollection;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Ali"; //Heap'te string pool içerisinde oluşturuldu.
        String s2 = "Ali"; //String pool a bakar aynı değer varsa yeni bir nesne oluşturmaz. Havuzdaki nesnenin adresini bu değişkene de atar.

        String s3 = new String("Ali"); //String pool'da oluşmaz. Heap memory'de diğer nesneler gibi oluşturulur.

        System.out.println("(s1 == s2) = " + (s1 == s2)); //Nesneler arasında referans(adres) karşılaştırması(adresleri eşit mi?)
        System.out.println("(s1 == s3) = " + (s1 == s3)); //Nesneler arasında referans(adres) karşılaştırması(adresleri eşit mi?)
        System.out.println("(s2 == s3) = " + (s2 == s3)); //Nesneler arasında referans(adres) karşılaştırması(adresleri eşit mi?)

        System.out.println("(s1.equals(s2)) = " + (s1.equals(s2)));//Değer karşılaştırması-value-->değişkenin değer açısından bir karşılaştırma("Ali" == "Ali")
        System.out.println("(s1.equals(s3)) = " + (s1.equals(s3)));//Değer karşılaştırması-value-->değişkenin değer açısından bir karşılaştırma("Ali" == "Ali")

        int sayi1 = 10;
        int sayi2 = 10;
        System.out.println("(sayi1 == sayi2) = " + (sayi1 == sayi2)); // 10 == 10--primitive types always compared by their values
    }
}
