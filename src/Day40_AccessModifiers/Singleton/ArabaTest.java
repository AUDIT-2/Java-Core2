/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.Singleton;

public class ArabaTest {
    public static void main(String[] args) {
       Araba.setMaxInstance(3);
       Araba araba1 = Araba.instanceOlustur();
       Araba araba2 = Araba.instanceOlustur();
       Araba araba3 = Araba.instanceOlustur();
       Araba araba4 = Araba.instanceOlustur();
       Araba araba5 = Araba.instanceOlustur("Ford","Taunus");

        if (araba1 !=null) {
            araba1.setMarka("Toyota");
            araba1.setModel("Corolla");
        }

        if (araba2 !=null) {
            araba2.setMarka("Honda");
            araba2.setModel("Accord");
        }

        if (araba3 !=null){
           araba3.setMarka("Mercedes");
           araba3.setModel("E550");
       }
        if (araba4 !=null){
            araba4.setMarka("Mercedes");
            araba4.setModel("SLK50");
        }

        System.out.println(araba1);
        System.out.println(araba2);
        System.out.println(araba3);
        System.out.println(araba4);
        System.out.println(araba5);

        System.out.println("Araba.getNumberOfInstance() = " + Araba.getNumberOfInstance());
    }
}
