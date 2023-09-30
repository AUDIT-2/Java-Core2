/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ArrayListRemove {
    public static void main(String[] args) {
        System.out.println("ArrayList remove() method example.");
        List<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("İstanbul");
        cities.add("London");
        cities.add("Paris");
        cities.add("Zurih");
        cities.add("London");

        System.out.println(cities);
        cities.add(0,"Ankara");
        System.out.println(cities);

     /*   cities.remove("London");
        System.out.println(cities);*/

        String elemanSil = "London";
       // cities.remove(elemanSil);
        List<String> silinecekler = new ArrayList<>();
       /* for (String eleman:cities){
            if(eleman.equals(elemanSil)){
                silinecekler.add(eleman);
                //cities.remove(eleman); //ConcurrentModificationException hata
            }
        }*/

        System.out.println(silinecekler);
        cities.removeAll(silinecekler); //Collection
        System.out.println(cities);

        Iterator<String> silIterator = cities.iterator();
/*
        while (silIterator.hasNext()){
            String eleman = silIterator.next();
            if (eleman.equals(elemanSil)){
                silIterator.remove();
            }
        }
        */
        cities.removeIf(str -> str.equals(elemanSil));
        System.out.println(cities);
    }
}
