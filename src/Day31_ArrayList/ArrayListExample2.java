/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day31_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {

    //Custom method to modify an element of passed ArrayList
    public static void setNewValue(ArrayList liste, String oldValue, String newValue){
        int index = liste.indexOf(oldValue);
        liste.set(index,newValue);
    }
    public static void main(String[] args) {
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

        Collections.sort(isimler);
        System.out.println("isimler(Sorted) = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        //Update an element
        isimler.set(3,"Mert Can");
        System.out.println("isimler(Sorted) = " + isimler);

        System.out.println("isimler.indexOf(\"Mehmet\") = " + isimler.indexOf("Mehmet"));

        int index = isimler.indexOf("Mehmet");
        isimler.set(index,"Mehmet Ali");
        System.out.println("isimler(Sorted) = " + isimler);


        isimler.set(isimler.indexOf("Mehmet Ali"),"Mehmet Can" );
        System.out.println("isimler(Sorted) = " + isimler);

        setNewValue(isimler,"Ayşe","Ayşe Gül");
        System.out.println("isimler = " + isimler);
    }
}
