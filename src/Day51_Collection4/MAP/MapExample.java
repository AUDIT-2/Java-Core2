/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.MAP;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        System.out.println("Map---> Key Value Pair...");

        //Key value must be unique---biricik, eşsiz, benzersiz

        //Map<Key,Value>
        Map<String,Integer> cities = new HashMap<>();

        cities.put("Ankara",6); //----> entry
        cities.put("İzmir",35);
        cities.put("Adana",1);
        cities.put("Kayseri",38);
        cities.put("Konya",42);

        System.out.println("cities = " + cities);
        System.out.println("cities.get(\"Adana\") = " + cities.get("Adana")); //Parameter is the key of Map
        System.out.println("cities.get(\"Konya\") = " + cities.get("Konya"));

        for (Map.Entry<String,Integer> cityEntry : cities.entrySet()){
            System.out.println("cityEntry = " + cityEntry);

            System.out.println("cityEntry.getKey() = " + cityEntry.getKey());
            System.out.println("cityEntry.getValue() = " + cityEntry.getValue());
        }
    }
}
