/*
 * Copyright (c) 2023.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.PersonAdres;

import java.util.ArrayList;

public class Rehber {
    private static ArrayList<Person> rehber = new ArrayList();

    public static ArrayList<Person> getRehber() {
        return rehber;
    }

    public static void addRehber(Person person) {
        Rehber.rehber.add(person);
    }

    public static void showRehber(){
        for (Person person :rehber){
            System.out.println(person);
        }
    }
}
