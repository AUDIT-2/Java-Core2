/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapMultipleValue {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> aracMarkaListe = new HashMap<>();

        aracMarkaListe.put("Honda",new ArrayList<String>());
        aracMarkaListe.get("Honda").add("Accord");
        aracMarkaListe.get("Honda").add("Civic");
        aracMarkaListe.get("Honda").add("Jazz");

        aracMarkaListe.put("Toyota",new ArrayList<>());
        aracMarkaListe.get("Toyota").add("Corolla");
        aracMarkaListe.get("Toyota").add("Yaris");
        aracMarkaListe.get("Toyota").add("Avensis");

        //.forEach() metodu
        aracMarkaListe.get("Toyota").forEach(eleman -> System.out.println(eleman));
        System.out.println();
        aracMarkaListe.get("Honda").forEach(eleman -> System.out.println(eleman));

        System.out.println();
        for (Map.Entry<String,ArrayList<String>> entry : aracMarkaListe.entrySet() ) {
            System.out.println("Araç marka ve modelleri");
            System.out.println("-----------------------");
            System.out.println(entry.getKey().toUpperCase());
            for (String model :aracMarkaListe.get(entry.getKey())){
                System.out.println("\t -" + model);
            }
        }
        System.out.println();
        String aracMarka = "Honda";
        System.out.println("Parametre olarak verilen " + aracMarka + " marka araçların modelleri..");
        for (String model : aracMarkaListe.get(aracMarka)){
            System.out.println(model);
        }
    }
}
