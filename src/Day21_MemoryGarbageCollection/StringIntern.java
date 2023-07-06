/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day21_MemoryGarbageCollection;

public class StringIntern {
    public static void main(String[] args) {
        /*
        Java'da bir String oluşturulduğunda, Heap(öbekte) belleğinde oluşur. Ayrıca, String sınıfının değişmez(immutable) olduğunu biliyoruz.
        Bu nedenle, ne zaman new anahtar sözcüğünü kullanarak bir String oluşturduğumuzda, heap te karşılık gelen String nesnesi için yeni bellek ayrılır.
         */

        String str1 = new String("Ali"); //Heap te kendisine ait bir referans adresi ile bir nesne oluşur.

        //.intern() metodu heap te String pool un dışında oluşan String tipi bir nesnenin değerin(value) pool a koymak için kullanılır.
        String str2 = str1.intern();//str1 nesnesinin değerini String pool a koyduk. Ve pooldaki "Ali" nin referans adresini str2 nesnesine atadık.

        String str3 = "Ali"; // Bir önceki satırda str1.intern() metodu ile String pool'a "Ali" değerini koyduğumuzdan str3 e "Ali" değerini atadığımızda pooldaki referans adresini aldı

        System.out.println("(str2 == str3) = " + (str2 == str3)); //dolayısıyla hem str2 hem de str3 artık pooldaki "Ali" nin referans adresine sahip olduklarından true olur.

        System.out.println("(str1 == str2) = " + (str1 == str2)); // str1 pooldaki bir değere referans etmediği için str2 ile aynı adrese sahip değiller dolayısıyla false olur.

        String str4 = new String("Veli");
        String str5 = new String("Veli");

        System.out.println("(str4 == str5) = " + (str4 == str5)); // false-- çünkü her ikisi de ayrı ayrı nesneler referans ediyorlar.

        System.out.println("str4.intern() == str5.intern() = " + (str4.intern() == str5.intern())); //herikisi de intern() metodu ile kendi değerlerini pool a koyduklarından true olur.
    }
}
