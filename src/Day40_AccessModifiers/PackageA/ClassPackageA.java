/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.PackageA;

import Day40_AccessModifiers.PackageB.AccessModifiers;

public class ClassPackageA extends AccessModifiers{
    public static void main(String[] args) {
        System.out.println("Access modifiers in Java. Accessing different class from different package.");
        AccessModifiers obj = new AccessModifiers();
        //Public
        obj.name = "Başka bir paketten erişim"; //Public olduğundan başka bir paketteki class tan da erişebildik
        obj.pubMethod(); //Public olduğundan başka bir paketteki class tan da erişebildik

        //Protected
        // obj.proMethod(); //Protected tanımlandığından başka bir paket içerisindeki class tan doğrudan erişim yapamayız.
        //obj.TCNo = 123345; //Protected tanımlandığından başka bir paket içerisindeki class tan doğrudan erişim yapamayız.

        //Default
        //obj.defMethod(); //Default tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.
        //obj.okulNo = 34567; //Default tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.

        //Private
        // obj.privateToplam(12,45); //Private tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.
        // obj.id = 10; //Private tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.

        //Protected ---child-parent
        ClassPackageA classPaketA = new ClassPackageA(); //ClassPaketA--> child  AccessModifiers --> parent

        classPaketA.TCNo = "12233444"; //Başka paketlerde de olsalar aralarında parent-child ilişkisi olan class lar protected üyelere erişebişirler.
        classPaketA.proMethod();//Child class tan parent class ındaki protected üyelerine erişim yapabiliriz.

        //Public ---child-parent
        classPaketA.pubMethod();
        classPaketA.name = "Public member";
    }
}
