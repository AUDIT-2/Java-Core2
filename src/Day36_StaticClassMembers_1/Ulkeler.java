/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

public class Ulkeler {
    static int ulkelerSayac;
    String name;
    int dummyCounter;

    public Ulkeler(String name) {
        this.name = name;
        ulkelerSayac++; //Belongs to class
        dummyCounter++; //Belongs to Instance-Object
    }
}
