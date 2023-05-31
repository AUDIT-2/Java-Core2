/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        System.out.println("Collections---> SET");
        Set<String> setList = new HashSet<>();

        //Duplication is not allowed.
        setList.add("Ahmet");
        setList.add("Kazım");
        setList.add("Ahmet");
        setList.add("Mehmet");
        setList.add("Ali");
        setList.add("Kazım");
        setList.add("Ali");
        setList.add("Mehmet");
        setList.add("Mehmet");
        setList.add("Ali");
        setList.add("Mehmet");
        setList.add("Mehmet");

        System.out.println("SetList : " + setList);
    }
}
