/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.PackageB;

public class ClassA {
    public static void main(String[] args) {
        System.out.println("Access modifiers in Java. Accessing different class with in same package.");
        AccessModifiers obj = new AccessModifiers();

        //Private-Aynı paket içerisinde olsak bile private tanımlanmış bir üyeye erişemeyiz.
        //obj.id = 122;
        //obj.privateToplam(12,5)

        //Default-Aynı paket içerisinde olduğumuzdan default tanımlı bir üyeye erişebiliriz.
        obj.okulNo = 5667;
        obj.defMethod();

        //Protected-Aynı paket içerisinde olduğumuzdan protected tanımlı bir üyeye erişebiliriz.
        obj.TCNo = "1234556678";
        obj.proMethod();

        //Public-Public tanımlı üyelere farklı paketlerde de olsalar bütün class lar erişebilir.
        obj.name = "Ahmet";
        obj.pubMethod();
    }
}
