/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapMultipleOrganizasyon {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> organizsayonSemasi = new HashMap<>();

        organizsayonSemasi.put("Arşiv Müdürlüğü",new ArrayList<String >());
        organizsayonSemasi.get("Arşiv Müdürlüğü").add("Ahmet Falanca");
        organizsayonSemasi.get("Arşiv Müdürlüğü").add("Can Can");
        organizsayonSemasi.get("Arşiv Müdürlüğü").add("Cin Ali ");

        organizsayonSemasi.put("Satınalma Müdürlüğü",new ArrayList<String >());
        organizsayonSemasi.get("Satınalma Müdürlüğü").add("Hasan Falanca");
        organizsayonSemasi.get("Satınalma Müdürlüğü").add("Kaan Can");
        organizsayonSemasi.get("Satınalma Müdürlüğü").add("Ali Filanca");

        organizsayonSemasi.put("Genel Müdür",new ArrayList<String >());
        organizsayonSemasi.get("Genel Müdür").add("Adnan Bey");

        System.out.println("organizsayonSemasi = " + organizsayonSemasi);

        System.out.println("Satınalma Müdürlüğü- Çalışanlarr Listesi");
        System.out.println("----------------------------------------");
        for (String eleman : organizsayonSemasi.get("Satınalma Müdürlüğü")){
            System.out.println(eleman);
        }

        System.out.println();
        System.out.println("Arşiv Müdürlüğü- Çalışanlarr Listesi");
        System.out.println("----------------------------------------");
        for (String eleman : organizsayonSemasi.get("Arşiv Müdürlüğü")){
            System.out.println(eleman);
        }
    }
}

