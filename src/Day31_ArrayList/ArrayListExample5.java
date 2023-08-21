/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day31_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample5 {
    public static void main(String[] args) {
        //.retainsAll(), .removeAll()
        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add("Ahmet");
        isimler.add("Mehmet");
        isimler.add("Ali");
        isimler.add("Ayşe");
        isimler.add("Can");
        isimler.add("Onur");
        isimler.add("Kaan");
        isimler.add("Ali");
        isimler.add("Ayşe");
        System.out.println("isimler(unsorted) = " + isimler);

        boolean sildinMi;
        sildinMi = isimler.removeAll(Arrays.asList("Kaan","Ali"));
        System.out.println("sildinMi = " + sildinMi);
        System.out.println("isimler(unsorted) = " + isimler);

        isimler.retainAll(Arrays.asList("Mehmet","Ayşe"));
        System.out.println("isimler = " + isimler);

        ArrayList<String> isimler2 = new ArrayList<>();
        isimler2.add("Mehmet");
        isimler2.add("Ali");
        isimler2.add("Mustafa");
        System.out.println("isimler2 = " + isimler2);

        //Ortak elemanlarını yazdırır. .retainAll()
        isimler.retainAll(isimler2);
        System.out.println("isimler = " + isimler);
    }
}
