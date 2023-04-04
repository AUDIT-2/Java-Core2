/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;


public class StringPoolAndHeap {
    public static void main(String[] args) {
        //Java da new ile oluşturulan String nesnesinin kaç kopyası oluşur?

        //new ile String sınıfından bir nesne oluşturduğumuzda JVM bu nesneyi Heap memory de oluşturur.
        // Aynı zamanda String Pool içerisinde de eğer aynı değere sahip bir nesne yoksa bir kopyası da poolda oluşturulur.

        String str1 = new String("Merhaba"); //Heap te bir nesne oluşturulur.

        System.out.println("str1 nesnesinin Heapteki referans adresi                        = " + System.identityHashCode(str1));
        System.out.println("str1 nesnesinin String poolda oluşan kopyasının referans adresi = " + System.identityHashCode(str1.intern()));

        String str2 = "Merhaba"; //String poolda aynı değere sahip bir nesne yoksa yenisi oluşturulur.
        System.out.println("str2 nesnesinin String poolda oluşan referans adresi            = " + System.identityHashCode(str2));

        //str2 nesnesinin String pooldaki referansı ile str1 nesnesini String poolda oluşan kopyasının referansı birbirlerine eşittir.

        System.out.println();

        String abc = "Java"; //String poolda "Java" nesnesi yoksa poolda oluşturulur ve referansı abc değişkenine atanır.
        System.out.println("abc nesnesinin String poolda oluşan referans adresi             = " + System.identityHashCode(abc));

        String xyz = new String("Java"); //xyz Heapte oluşturulur. Poolda aynı değere sahip bir nesne olduğundan ikinci kopya poolda oluşturulmaz
        System.out.println("xyz nesnesinin Heapteki referans adresi                         = " + System.identityHashCode(xyz));
        System.out.println("xyz nesnesinin String poolda daha önce varolan referans adresi  = " + System.identityHashCode(xyz.intern()));

    }
}
