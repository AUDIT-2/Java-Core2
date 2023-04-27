/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

public class UlkelerTest {
    public static void main(String[] args) {
        Ulkeler ulke1 = new Ulkeler("Türkiye");
        System.out.println("ulke1.name = " + ulke1.name);
        System.out.println("ulke1.dummyCounter = " + ulke1.dummyCounter);

        System.out.println("Ulkeler Sayacı = " + Ulkeler.ulkelerSayac);

        Ulkeler ulke2 = new Ulkeler("Almanya");
        System.out.println("ulke2.name = " + ulke2.name);
        System.out.println("ulke2.dummyCounter = " + ulke2.dummyCounter);

        System.out.println("Ulkeler Sayacı = "  + Ulkeler.ulkelerSayac);

        Ulkeler ulke3 = new Ulkeler("Norveç");
        System.out.println("ulke3.name = " + ulke3.name);
        System.out.println("ulke3.dummyCounter = " + ulke3.dummyCounter);

        System.out.println("Ulkeler Sayacı = "  + Ulkeler.ulkelerSayac);

        System.out.println("ulke1.ulkelerSayac = " + ulke1.ulkelerSayac);
        System.out.println("ulke2.ulkelerSayac = " + ulke2.ulkelerSayac);
        System.out.println("ulke3.ulkelerSayac = " + ulke3.ulkelerSayac);

        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);
    }
}
