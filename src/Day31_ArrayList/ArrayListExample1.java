/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day31_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample1 {
    public static void main(String[] args) {
        String[] sehirAdlari = {"Ankara","İzmir","Kayseri","Van"};

     // ArrayList<String> sehirListesi = new ArrayList<>(Arrays.asList(sehirAdlari));
        ArrayList<String> sehirListesi = new ArrayList<>(Arrays.asList("Ankara","İzmir","Kayseri","Van"));

        System.out.println("sehirListesi = " + sehirListesi);

        ArrayList<Integer> plakalar = new ArrayList<>();
        plakalar.add(6);
        plakalar.add(34);
        plakalar.add(1);
        plakalar.add(24);

        System.out.println("Print list as added order:");
        System.out.println("plakalar = " + plakalar);
        System.out.println("plakalar.get(1) = " + plakalar.get(1));

        System.out.println("Print list as sorted:");
        Collections.sort(plakalar);
        System.out.println("plakalar = " + plakalar);
        System.out.println("plakalar.get(1) = " + plakalar.get(1));

    }
}
