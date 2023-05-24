/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day48_Collection1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("Kayseri");
        cities.add("Çanakkale");
        cities.add("İstanbul");

        System.out.println(Arrays.asList(cities));
        System.out.println(cities.toString());
        System.out.println(cities);

        System.out.println(cities.get(1));
        System.out.println();

        System.out.println("For loop....");
        System.out.println("----------------");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
        System.out.println();

        System.out.println("For each....");
        System.out.println("----------------");
        for (String eleman :cities){
            System.out.println(eleman);
        }

        System.out.println();
        System.out.println("İkinci ArrayList");

        ArrayList<String> cities1 = new ArrayList<>();
        cities1.add("Van");
        cities1.add("Konya");
        cities1.add("Malatya");
        cities1.add("Urfa");

        System.out.println("Cities List : " + cities);
        System.out.println("Cities1 List : " + cities1);

        //Adding an ArrayList to another ArrayList with for each loop
        for (String eleman :cities1){
            cities.add(eleman);
        }
        System.out.println("Cities List : " + cities);

        System.out.println();
        System.out.println("addAll() metodu ile arrayListe başka bir arrayList ekleme");
        cities1.addAll(cities);
        System.out.println("Cities1 List : " + cities1);
        System.out.println();

        System.out.println("removeAll() metodu ile arrayListen başka bir arrayList elemanlarını silme");
        ArrayList<String> temp = new ArrayList<>();
        temp.add("Malatya");
        temp.add("Kayseri");
        temp.add("Van");

        cities1.removeAll(temp);
        System.out.println("Cities1 List : " + cities1);
    }
}
