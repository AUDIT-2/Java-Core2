/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetArrayListUnique {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();


        nameList.add("Ahmet");
        nameList.add("Ahmet");
        nameList.add("Mehmet");
        nameList.add("Ahmet");
        nameList.add("Hasan");
        nameList.add("Merve");
        nameList.add("Ahmet");
        nameList.add("Naci");
        nameList.add("Zeynep");
        nameList.add("Ahmet");
        nameList.add("Mehmet");
        nameList.add("Zeynep");
        nameList.add("Merve");
        nameList.add("Zeynep");

        System.out.println("NameList : " + nameList);

       /* Set<String> nameListSet = new HashSet<>();
        for (String eleman:nameList){
            nameListSet.add(eleman);
        }*/

        Set<String> nameListSet = new HashSet<>(nameList);
        System.out.println("NameListSet : " + nameListSet);
    }
}
