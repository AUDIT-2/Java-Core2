/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static int myIndexOf(ArrayList liste, String eleman){
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).equals(eleman)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        //Traversing an ArrayList
        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add("Ahmet");
        isimler.add("Mehmet");
        isimler.add("Ali");
        isimler.add("Ayşe");
        isimler.add("Can");
        isimler.add("Onur");
        isimler.add("Kaan");
        System.out.println("isimler(unsorted) = " + isimler);

        //For i
        System.out.println("For....");
        for (int i = 0; i < isimler.size(); i++) {
            System.out.println(isimler.get(i));
        }
        System.out.println();
        //For each
        System.out.println("For each....");
        for (String eleman:isimler){
            System.out.println("eleman = " + eleman);
        }
        //While...
        System.out.println("While....");

        int i = isimler.size()-1;
        while (i >=0){
            System.out.println("isimler.get(i) = " + isimler.get(i));
            i--;
        }

        System.out.println("myIndexOf(isimler,\"Onuralp\") = " + myIndexOf(isimler, "Onuralp"));

    }
}
