/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day48_Collection1;

import java.util.ArrayList;

public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("Kayseri");
        cities.add("Çanakkale");
        cities.add("İstanbul");
        cities.add("Çanakkale");

        String arama = "";
        arama = "Çanakkale";

        System.out.println("Finding an element in an ArrayList with .contains() ");
        if(cities.contains(arama)){//Sadece ilk rastladığını  ile ilgili işlem yapar
            System.out.println("Şehir listede var.");
            System.out.println("Şehrin listedeki index no : " + cities.indexOf(arama));
        }else System.out.println("Şehir listede yok!!!");

        System.out.println();

      /*  System.out.println("Finding an element in an ArrayList with for each ");
        int index = 0;
        for (String eleman :cities){
          //  System.out.println(eleman);
            if(eleman.equalsIgnoreCase(arama)){
                System.out.println(cities.get(index) + " ilinin listedeki index no : " + index);
            }
            index++;
        }*/
        System.out.println(myIndexOf(cities, "Çanakkale"));
    }

    //My custom method to find the index no of given element in a ArrayList
    public static String myIndexOf(ArrayList<String> liste, String sehir){
        System.out.println("myIndexOf metodu.......");
        int index = 0;
        String result = "";
        for (String eleman :liste){
            if(eleman.equalsIgnoreCase(sehir)){
               // System.out.println(liste.get(index) + " ilinin listedeki index no : " + index);
                result += liste.get(index) + " ilinin listedeki index no : " + index + "\n";
            }
            index++;
        }
        if(result.isBlank()) return sehir+" Şehri listede yok!!!";

        return result;
    }
}
