/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.MAP;

import java.util.HashMap;
import java.util.Map;

public class MapPersonTest {
    public static void main(String[] args) {
        Map<Integer,PersonKisi> kisilerMap = new HashMap<>();

        PersonKisi personKisi = new PersonKisi(12345,"Ahmet Falanca","Bir adres.");
        PersonKisi personKisi1 = new PersonKisi(45678,"Kaan Cancan","Bir başka adres.");

        kisilerMap.put(personKisi.TCKNO, personKisi);
        kisilerMap.put(personKisi1.TCKNO, personKisi1);

        System.out.println("kisilerMap.get(12345) = " + kisilerMap.get(12345));
        System.out.println(kisilerMap.get(45678).name);
        System.out.println(kisilerMap.get(45678).TCKNO);
        System.out.println(kisilerMap.get(45678).address);
        System.out.println(kisilerMap.get(45678));

        for (Map.Entry<Integer,PersonKisi> entryPerson : kisilerMap.entrySet()){
            System.out.println(entryPerson.getKey());
            System.out.println("  -" + entryPerson.getValue().name);
            System.out.println("  -" + entryPerson.getValue().address);
        }
    }
}
