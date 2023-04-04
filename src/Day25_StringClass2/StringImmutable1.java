/*
 * Copyright (c) 2023.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class StringImmutable1 {

    public static void main(String[] args) {
        //Java da String Class immutable dır. Yani değiştirilemez.

        String str1 = "Ahmet Falanca";

        System.out.println("str1 = " + str1);
        System.out.println("str1 nesnesinin String pooldaki referans adresi  = " + System.identityHashCode(str1));

        System.out.println("str1.concat(\" Ankara\") = " + str1.concat(" Ankara"));
        System.out.println("str1 = " + str1);
        System.out.println("str1 nesnesinin String pooldaki referans adresi  = " + System.identityHashCode(str1));

        System.out.println("str1.uppercase() = " + str1.toUpperCase());
        System.out.println("str1 = " + str1);
        System.out.println("str1 nesnesinin String pooldaki referans adresi  = " + System.identityHashCode(str1));

        //Örnekteki gibi .concat() ve .uppercase() metodları String immutable olduğunda orijinal str1 nesnesini değiştiremedi.
        //Bunun yerine JVM herbir metod için Heapte ayrı ayrı nesneler oluşturdu.
        //Aşağıdki kodun çıktısına baktığımızda memory adreslerinin birbirlerinden farklı olduğunu görürüz.
        System.out.println("System.identityHashCode(str1.toUpperCase())      = " + System.identityHashCode(str1.toUpperCase()));
        System.out.println("System.identityHashCode(str1.concat(\"Ankara\"))   = " + System.identityHashCode(str1.concat("Ankara")));

        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        String str2 = "Merhaba ";
        System.out.println("str2 = " + str2);
        System.out.println("address of str2 before concatenation = " + System.identityHashCode(str2));

        str2 = str2 + "Nasılsın?";
        System.out.println("str2 = " + str2);
        System.out.println("address of str2 after concatenation  = " + System.identityHashCode(str2));

        System.out.println("before and after concatenation address of str2 is going to be different.");
    }
}
